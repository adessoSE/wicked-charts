Wicked Charts
=============
Beautiful and interactive javascript charts for Java-based web applications.

 * Check out the [Changelog](https://github.com/thombergs/wicked-charts/wiki/Changelog)
 * Check out the [Feature Overview](https://github.com/thombergs/wicked-charts/wiki/Feature-Overview) with coding examples
 * Browse the [Javadoc](http://thombergs.github.io/wicked-charts/apidocs)
 * Browse the [Showcase](http://wicked-charts.org/wicked-charts-showcase-wicket6) to get an impression (use [this link](http://wicked-charts.org/wicked-charts-showcase-wicket6/simple) for a css- and ajax-free version that works better in IE)
 * Check out the [FAQ](https://github.com/thombergs/wicked-charts/wiki/FAQ)
 * [Subscribe](http://wicked-charts.2319560.n4.nabble.com/template/NamlServlet.jtp?macro=subscribe&node=1) to the [Mailing List](http://wicked-charts.2319560.n4.nabble.com/)

[![Build Status](https://travis-ci.org/thombergs/wicked-charts.png?branch=master)](https://travis-ci.org/thombergs/wicked-charts)

What is Wicked Charts?
======================
Wicked Charts is a Java wrapper of the [Highcharts](http://www.highcharts.com") javascript library. Highcharts provides eye-pleasing charts using HTML5 SVG technology (see http://www.highcharts.com/demo). With Wicked Charts, you can configure a chart in Java and display it in any web application based on Apache Wicket or JSF. Or you can use the Highcharts Java wrapper to integrate it in web applications built with other java web frameworks.

![Example chart](https://wicked-charts.googlecode.com/files/chart.png)

**Please note that while Wicked Charts is licensed under Apache 2.0 License, Highcharts itself is only free for non-commercial use.** 
See here: [http://shop.highsoft.com/highcharts.html]

How does it work?
=================
For a kick start on how to use Wicked Charts in your Wicket or JSF application, visit the [Getting Started](https://github.com/thombergs/wicked-charts/wiki/Getting-Started) page.

Your web framework is not supported?
================================
If your Java-based framework of choice is not supported by Wicked Charts, feel free to get in touch with us. It shouldn't be much work to get the basic features also working for your framework (most of the work has already been done).

Want to contribute?
===================
Feel free to clone this repository and submit pull request. We'll see to get them merged into the main project.

Maven coordinates
=================
Depending on what web framework you use, add one of the following dependencies to your Maven build:

Wcket 6.x
---------
```html
<dependency>
  <groupId>com.googlecode.wicked-charts</groupId>
  <artifactId>wicked-charts-wicket6</artifactId>
  <version>1.5.0</version>
</dependency>
```
Wicket 1.5.x
---------
```html
<dependency>
  <groupId>com.googlecode.wicked-charts</groupId>
  <artifactId>wicked-charts-wicket15</artifactId>
  <version>1.5.0</version>
</dependency>
```
Wicket 1.4.x
---------
```html
<dependency>
  <groupId>com.googlecode.wicked-charts</groupId>
  <artifactId>wicked-charts-wicket14</artifactId>
  <version>1.5.0</version>
</dependency>
```
JSF 2.1
---------
```html
<dependency>
  <groupId>com.googlecode.wicked-charts</groupId>
  <artifactId>wicked-charts-jsf21</artifactId>
  <version>1.5.0</version>
</dependency>
```

Java Wrapper
------------
If you want to use the Java abstraction and JSON serializer of the Highcharts options (for example to add Highcharts to an application built with a different web framework than Wicket ot JSF), add the following dependency:
```html
<dependency>
  <groupId>com.googlecode.wicked-charts</groupId>
  <artifactId>wicked-charts-highcharts</artifactId>
  <version>1.5.0</version>
</dependency>
```
