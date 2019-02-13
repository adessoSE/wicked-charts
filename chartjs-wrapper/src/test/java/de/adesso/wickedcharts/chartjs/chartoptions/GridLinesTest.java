package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GridLinesTest {
	
	private GridLines testData;
	private List<Color> colorList;

	@BeforeEach
	void setUp() {
		testData = new GridLines();
	}
	
	@Test
	void testSetColorList() {
		testData.setColor(Arrays.asList(SimpleColor.BLUE, SimpleColor.RED));
		colorList = Arrays.asList(SimpleColor.BLUE, SimpleColor.RED);
		assertEquals(testData.getColor(),colorList);
	}
	
	@Test
	void testSetColor() {
		testData.setColor(SimpleColor.BLUE);
		colorList = Collections.singletonList(SimpleColor.BLUE);
		assertEquals(testData.getColor(),colorList);
	}

}
