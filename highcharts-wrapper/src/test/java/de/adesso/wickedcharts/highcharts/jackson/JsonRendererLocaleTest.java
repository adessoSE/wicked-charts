package de.adesso.wickedcharts.highcharts.jackson;

import de.adesso.wickedcharts.highcharts.options.SeriesType;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JsonRendererLocaleTest {

    /**
     * This test checks that the JsonRenderer can handle a turkish default Locale.
     */
    @Test
    void testTurkishLocale() {
        Locale.setDefault(new Locale("tr"));

        SeriesType type = SeriesType.SPLINE;
        JsonRenderer renderer = new JsonRenderer();
        String json = renderer.toJson(type);

        // would be "splıne" if the turkish locale was not considered
        assertEquals("\"spline\"", json);
    }

}
