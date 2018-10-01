package de.adesso.wickedcharts.showcase.options.chartjs.base;


import de.adesso.wickedcharts.chartjs.ChartConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * The base class for all chart configurations for the showcase
 */
@SuppressWarnings("serial")
public abstract class ShowcaseConfiguration extends ChartConfiguration {

	protected List<Integer> randomIntegerList(int size) {
		List<Integer> dataList = new ArrayList<Integer>();
		Random rng = new Random();
		for (int i = 0; i < size; i++) {
			dataList.add(rng.nextInt(60) + 1);
		}
		return dataList;
	}

	protected String readFile(String fileName) {

		StringBuilder result = new StringBuilder("");

		// Get file from resources folder
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());

		try (Scanner scanner = new Scanner(file)) {

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				result.append(line).append("\n");
			}

			scanner.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return result.toString();

	}

	//This should be overriden in cofigurations that require optional markup
	public void modfiyIndividualMarkup(Object optionalMarkup){

	}

	//This should be overriden in cofigurations that require a proper locale
	public Locale getSessionLocale(){
		return Locale.GERMANY;
	}
}
