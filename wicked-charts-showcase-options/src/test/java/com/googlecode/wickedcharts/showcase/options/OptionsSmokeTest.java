package com.googlecode.wickedcharts.showcase.options;

import java.io.IOException;
import java.util.Set;

import org.junit.Test;

import com.googlecode.wickedcharts.highcharts.jackson.JsonRenderer;
import com.googlecode.wickedcharts.highcharts.options.Options;

public class OptionsSmokeTest {

  @Test
  public void testOptionsRendered() throws InstantiationException,
      IllegalAccessException, ClassNotFoundException, IOException {
    Set<Class<?>> classes = ClassFinder
        .getClasses(OptionsSmokeTest.class
            .getClassLoader(), "com.googlecode.wickedcharts.showcase.options");

    JsonRenderer renderer = new JsonRenderer();

    int i = 0;
    for (Class<?> clazz : classes) {
      if (Options.class
          .isAssignableFrom(clazz) && !clazz
          .isMemberClass()) {
        Options options = (Options) clazz
            .newInstance();
        renderer
            .toJson(options);
        i++;
      }
    }
    System.out
        .println("Successfully tested Serialization of " + i
            + " option classes.");
  }
}
