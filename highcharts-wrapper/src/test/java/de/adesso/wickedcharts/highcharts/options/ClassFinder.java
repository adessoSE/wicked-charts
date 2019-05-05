package de.adesso.wickedcharts.highcharts.options;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

/**
 * Finds all classes in a given package. Source of this code: <a href=
 * "http://internna.blogspot.de/2007/11/java-5-retrieving-all-classes-from.html"
 * >http://internna.blogspot.de/2007/11/java-5-retrieving-all-classes-from.html<
 * /a>.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
class ClassFinder {

	static Set<Class<?>> getClasses(final ClassLoader loader, final String packageName) throws IOException,
	    ClassNotFoundException {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		String path = packageName.replace('.', '/');
		Enumeration<URL> resources = loader.getResources(path);
		if (resources != null) {
			while (resources.hasMoreElements()) {
				String filePath = resources.nextElement().getFile();
				// WINDOWS HACK
				if (filePath.indexOf("%20") > 0) {
					filePath = filePath.replaceAll("%20", " ");
				}
				if ((filePath.indexOf("!") > 0) && (filePath.indexOf(".jar") > 0)) {
					String jarPath = filePath.substring(0, filePath.indexOf('!')).substring(filePath.indexOf(':') + 1);
					// WINDOWS HACK
					if (jarPath.contains(":")) {
						jarPath = jarPath.substring(1);
					}
					classes.addAll(getFromJARFile(jarPath, path));
				} else {
					classes.addAll(getFromDirectory(new File(filePath), packageName));
				}
			}
		}
		return classes;
	}

	static Set<Class<?>> getClasses(final ClassLoader loader, final String[] packageNames)
	    throws ClassNotFoundException, IOException {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		for (String packageName : packageNames) {
			classes.addAll(getClasses(loader, packageName));
		}
		return classes;
	}

	private static Set<Class<?>> getFromDirectory(final File directory, final String packageName) throws ClassNotFoundException {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		if (directory.exists()) {
			for (String file : Objects.requireNonNull(directory.list())) {
				if (file.endsWith(".class")) {
					String name = packageName + '.' + stripFilenameExtension(file);
					Class<?> clazz = Class.forName(name);
					classes.add(clazz);
				}
			}
		}
		return classes;
	}

	private static Set<Class<?>> getFromJARFile(final String jar, final String packageName) throws
			IOException, ClassNotFoundException {
		Set<Class<?>> classes = new HashSet<>();
		try (JarInputStream jarFile = new JarInputStream(new FileInputStream(jar))) {
			JarEntry jarEntry;
			do {
				jarEntry = jarFile.getNextJarEntry();
				if (jarEntry != null) {
					String className = jarEntry.getName();
					if (className.endsWith(".class")) {
						className = stripFilenameExtension(className);
						if (className.startsWith(packageName)) {
							classes.add(Class.forName(className.replace('/', '.')));
						}
					}
				}
			} while (jarEntry != null);
		}
		return classes;
	}

	private static String stripFilenameExtension(final String file) {
		int index = file.lastIndexOf('.');
		return file.substring(0, index);
	}

}
