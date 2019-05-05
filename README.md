Wicked Charts
=============
Beautiful and interactive JavaScript charts for Java-based web applications.

 * Check out the [Changelog](https://github.com/adessoAG/wicked-charts/wiki/Changelog)
 * Check out the [Feature Overview](https://github.com/adessoAG/wicked-charts/wiki/Feature-Overview) with coding examples
 * Browse the [Javadoc](http://adessoAG.github.io/wicked-charts/apidocs)
 * [Browse](https://wicked-charts-showcase.appspot.com/) or download and run the [Showcase](https://github.com/adessoAG/wicked-charts/wiki/Developer-Info:-Starting-the-Showcase-Application) application for your web framework
 * Check out the [FAQ](https://github.com/adessoAG/wicked-charts/wiki/FAQ)

[![Build Status](https://travis-ci.org/adessoAG/wicked-charts.png?branch=master)](https://travis-ci.org/adessoAG/wicked-charts)

What is Wicked Charts?
======================
Wicked Charts is a Java wrapper of the [Chart.js](https://www.chartjs.org/) and [Highcharts](https://www.highcharts.com/) JavaScript libraries.
The Chart.js and Highcharts libraries provide eye-pleasing charts using HTML5 (see [Highcharts demo](http://www.highcharts.com/demo) and [Chart.js Samples](http://www.chartjs.org/samples/latest/)).
With Wicked Charts, you can configure a chart in Java and display it in any web application based on Apache Wicket or JSF. Or you can use the Chart.js or Highcharts Java wrappers to integrate it in web applications built with other java web frameworks.

*Please note that while Wicked Charts is licensed under Apache 2.0 License, Highcharts itself is only free for non-commercial use. Chart.js, however, is licensed under the MIT license and is free to use.*
See here: [Highcharts shop](http://shop.highsoft.com/highcharts.html)
And here: [Chart.js license](http://www.chartjs.org/docs/latest/notes/license.html)

How does it work?
=================
For a quick start on how to use Wicked Charts in your Wicket or JSF application, visit the [Getting Started](https://github.com/thombergs/wicked-charts/wiki/Getting-Started) page.

Your web framework is not supported?
================================
If your Java-based framework of choice is not supported by Wicked Charts, feel free to get in touch with us. It shouldn't be much work to get the basic features also working for your framework (most of the work has already been done).

Want to contribute?
===================
Feel free to clone this repository and submit pull requests. We'll see to get them merged into the main project.

Adding Wicked-Charts as a dependency
=================
Depending on what web framework you use, add one of the following dependencies to your Gradle/Maven build:

Wicket 8.x
---------
Gradle:
```groovy
repositories {
    jcenter()
}

dependencies {
  compile 'de.adesso.wicked-charts:wicked-charts-wicket8:3.2.0'
}
```

Maven:
```xml
<dependency>
  <groupId>de.adesso.wicked-charts</groupId>
  <artifactId>wicked-charts-wicket8</artifactId>
  <version>3.2.0</version>
  <type>pom</type>
</dependency>

```

Wicket 7.x
---------
Gradle:
```groovy
repositories {
    jcenter()
}

dependencies {
  compile 'de.adesso.wicked-charts:wicked-charts-wicket7:3.2.0'
}
```

Maven:
```xml
<dependency>
  <groupId>de.adesso.wicked-charts</groupId>
  <artifactId>wicked-charts-wicket7</artifactId>
  <version>3.2.0</version>
  <type>pom</type>
</dependency>
```

Wicket 6.x
---------
Gradle:
```groovy
repositories {
    jcenter()
}

dependencies {
  compile 'de.adesso.wicked-charts:wicked-charts-wicket6:3.2.0'
}
```

Maven:
```xml
<dependency>
  <groupId>de.adesso.wicked-charts</groupId>
  <artifactId>wicked-charts-wicket6</artifactId>
  <version>3.2.0</version>
  <type>pom</type>
</dependency>
```

Wicket 1.5.x
---------
Gradle:
```groovy
repositories {
    jcenter()
}

dependencies {
  compile 'de.adesso.wicked-charts:wicked-charts-wicket15:3.2.0'
}
```

Maven:
```xml
<dependency>
  <groupId>de.adesso.wicked-charts</groupId>
  <artifactId>wicked-charts-wicket15</artifactId>
  <version>3.2.0</version>
  <type>pom</type>
</dependency>
```

Wicket 1.4.x
---------
Gradle:
```groovy
repositories {
    jcenter()
}

dependencies {
  compile 'de.adesso.wicked-charts:wicked-charts-wicket14:3.2.0'
}
```

Maven:
```xml
<dependency>
  <groupId>de.adesso.wicked-charts</groupId>
  <artifactId>wicked-charts-wicket14</artifactId>
  <version>3.2.0</version>
  <type>pom</type>
</dependency>
```

JSF 2.1
---------
Gradle:
```groovy
repositories {
    jcenter()
}

dependencies {
  compile 'de.adesso.wicked-charts:wicked-charts-jsf21:3.2.0'
}
```

Maven:
```xml
<dependency>
  <groupId>de.adesso.wicked-charts</groupId>
  <artifactId>wicked-charts-jsf21</artifactId>
  <version>3.2.0</version>
  <type>pom</type>
</dependency>
```

Java Wrappers
------------
If you want to use the Java abstraction and JSON serializer of the Chart.js or Highcharts options (for example to add them to an application built with a different web framework than Wicket ot JSF), add the following dependencies:

Gradle:
```groovy
repositories {
    jcenter()
}

dependencies {
  compile 'de.adesso.wicked-charts:chartjs-wrapper:3.2.0'
  compile 'de.adesso.wicked-charts:highcharts-wrapper:3.2.0'
}
```

Maven:
```xml
<dependencies>
    <dependency>
      <groupId>de.adesso.wicked-charts</groupId>
      <artifactId>chartjs-wrapper</artifactId>
      <version>3.2.0</version>
      <type>pom</type>
    </dependency>
    
    <dependency>
      <groupId>de.adesso.wicked-charts</groupId>
      <artifactId>highcharts-wrapper</artifactId>
      <version>3.2.0</version>
      <type>pom</type>
    </dependency>
</dependencies>
```

Latest snapshot release
-----------------------
Gradle:
```groovy
repositories {
    maven { url 'https://oss.jfrog.org/artifactory/oss-snapshot-local' }
}

dependencies {
  compile 'de.adesso.wicked-charts:wicked-charts-wicket8:3.3.0-SNAPSHOT'
}
```

Maven:
```xml
<dependency>
  <groupId>de.adesso.wicked-charts</groupId>
  <artifactId>wicked-charts-wicket8</artifactId>
  <version>3.3.0-SNAPSHOT</version>
  <type>pom</type>
</dependency>
```

