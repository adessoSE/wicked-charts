package de.adesso.wickedcharts.chartjs.chartoptions.colors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HexColorTest {

    @Test
    public void testHexColor() {
        HexColor color = new HexColor(123,45,67);
        assertEquals(123,color.getRed());
        assertEquals(45,color.getGreen());
        assertEquals(67,color.getBlue());
    }

    @Test
    public void testHexColorString() {
        HexColor color = new HexColor("#FF1010");
        assertEquals(255,color.getRed());
        assertEquals(16,color.getGreen());
        assertEquals(16,color.getBlue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHexColorRGBException() {
        HexColor color = new HexColor(256,45,67);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHexColorRGBExceptionNegative() {
        HexColor color = new HexColor(-1,45,67);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHexColorException() {
        HexColor color = new HexColor("#FG1010");
    }
}
