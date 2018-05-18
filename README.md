Wicked Charts
=============
Beautiful and interactive JavaScript charts for Java-based web applications.

 * Check out the [Changelog](https://github.com/adessoAG/wicked-charts/wiki/Changelog)
 * Check out the [Feature Overview](https://github.com/adessoAG/wicked-charts/wiki/Feature-Overview) with coding examples
 * Browse the [Javadoc](http://adessoAG.github.io/wicked-charts/apidocs)
 * Download and run the [Showcase](https://github.com/adessoAG/wicked-charts/wiki/Developer-Info:-Starting-the-Showcase-Application) application for your web framework
 * Check out the [FAQ](https://github.com/adessoAG/wicked-charts/wiki/FAQ)

[![Build Status](https://travis-ci.org/thombergs/wicked-charts.png?branch=master)](https://travis-ci.org/thombergs/wicked-charts)

What is Wicked Charts?
======================
Wicked Charts is a Java wrapper of the [Chart.js](www.chartjs.org) and [Highcharts](www.highcharts.com) JavaScript libraries.
The Chart.js and Highcharts libraries provide eye-pleasing charts using HTML5 (see [Highcharts demo](http://www.highcharts.com/demo) and [Chart.js Samples](http://www.chartjs.org/samples/latest/)).
With Wicked Charts, you can configure a chart in Java and display it in any web application based on Apache Wicket* or JSF. Or you can use the Chart.js or Highcharts Java wrappers to integrate it in web applications built with other java web frameworks.

*Support for Chart.js is only available in Apache Wicket 7.x

**Please note that while Wicked Charts is licensed under Apache 2.0 License, Highcharts itself is only free for non-commercial use. Chart.js, however, is licensed under the MIT license and is free to use.**
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
Feel free to clone this repository and submit pull request. We'll see to get them merged into the main project.

Gradle coordinates
=================
Depending on what web framework you use, add one of the following dependencies to your Gradle build:

Wicket 7.x
---------
```html
repositories {
    jcenter()
}

dependencies {
  compile 'de.adesso.wicked-charts:wicked-charts-wicket7:3.0.0'
}
```

Wicket 6.x
---------
```html
repositories {
    jcenter()
}

dependencies {
  compile 'de.adesso.wicked-charts:wicked-charts-wicket6:3.0.0'
}
```

Wicket 1.5.x
---------
```html
repositories {
    jcenter()
}

dependencies {
  compile 'de.adesso.wicked-charts:wicked-charts-wicket15:3.0.0'
}
```

Wicket 1.4.x
---------
```html
repositories {
    jcenter()
}

dependencies {
  compile 'de.adesso.wicked-charts:wicked-charts-wicket14:3.0.0'
}
```

JSF 2.1
---------
```html
repositories {
    jcenter()
}

dependencies {
  compile 'de.adesso.wicked-charts:wicked-charts-jsf21:3.0.0'
}
```

Java Wrappers
------------
If you want to use the Java abstraction and JSON serializer of the Chart.js or Highcharts options (for example to add them to an application built with a different web framework than Wicket ot JSF), add the following dependencies:
```html
repositories {
    jcenter()
}

dependencies {
  compile 'de.adesso.wicked-charts:chartjs-wrapper:3.0.0'
  compile 'de.adesso.wicked-charts:highcharts-wrapper:3.0.0'
}
```
