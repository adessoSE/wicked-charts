package de.adesso.wickedcharts.highcharts.jackson;

import de.adesso.wickedcharts.highcharts.jackson.JsonRenderer;
import de.adesso.wickedcharts.highcharts.options.SeriesType;
import junit.framework.Assert;
import org.junit.Test;

import java.util.Locale;

public class JsonRendererLocaleTest {

    /**
     * This test checks that the JsonRenderer can handle a turkish default Locale.
     */
    @Test
    public void testTurkishLocale() {
        Locale.setDefault(new Locale("tr"));

        SeriesType type = SeriesType.SPLINE;
        JsonRenderer renderer = new JsonRenderer();
        String json = renderer.toJson(type);

        // would be "splıne" if the turkish locale was not considered
        Assert.assertEquals("\"spline\"", json);
    }

}
