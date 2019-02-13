package de.adesso.wickedcharts.chartjs.jackson.serializer;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.HexColor;
import de.adesso.wickedcharts.chartjs.jackson.JsonRenderer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class HexColorSerializerTest {

    private JsonRenderer renderer;
    private HexColor testColor;
    private static final String TEST_VALUE = "#7BEA38";

    @BeforeEach
    void setUp() {
        renderer = new JsonRenderer();
        testColor = new HexColor(123,234,56);
    }

    @Test
    void testHexSerializer() {
        String json = renderer.toJson(testColor);
        assertTrue(json.contains(TEST_VALUE));
    }

    @Test
    void testHexStringSerializer() {
        testColor = new HexColor(TEST_VALUE);
        String json = renderer.toJson(testColor);
        assertTrue(json.contains(TEST_VALUE));
    }
}