package de.adesso.wickedcharts.chartjs.colors;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.HexColor;
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
        HexColor color = new HexColor("#101010");
        assertEquals(16,color.getRed());
        assertEquals(16,color.getGreen());
        assertEquals(16,color.getBlue());
    }
}
