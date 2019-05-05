package de.adesso.wickedcharts.chartjs.chartoptions.colors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HexColorTest {

    @Test
    void testHexColor() {
        HexColor color = new HexColor(123,45,67);
        assertEquals(123,color.getRed());
        assertEquals(45,color.getGreen());
        assertEquals(67,color.getBlue());
    }

    @Test
    void testHexColorString() {
        HexColor color = new HexColor("#FF1010");
        assertEquals(255,color.getRed());
        assertEquals(16,color.getGreen());
        assertEquals(16,color.getBlue());
    }

    @Test
    void testHexColorRGBException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new HexColor(256,45,67));
    }

    @Test
    void testHexColorRGBExceptionNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new HexColor(-1,45,67));
    }

    @Test
    void testHexColorException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new HexColor("#FG1010"));
    }
}
