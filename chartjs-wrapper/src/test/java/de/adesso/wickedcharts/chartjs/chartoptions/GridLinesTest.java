package de.adesso.wickedcharts.chartjs.chartoptions;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;

public class GridLinesTest {
	
	private GridLines testData;
	private List<Color> colorList;
	

	@Before
	public void setUp() throws Exception {
		testData = new GridLines();
	}
	
	@Test
	public void testSetColorList() {
		testData.setColor(Arrays.asList(SimpleColor.BLUE, SimpleColor.RED));
		colorList = Arrays.asList(SimpleColor.BLUE, SimpleColor.RED);
		assertEquals(testData.getColor(),colorList);
	}
	
	@Test
	public void testSetColor() {
		testData.setColor(SimpleColor.BLUE);
		colorList = Arrays.asList(SimpleColor.BLUE);
		assertEquals(testData.getColor(),colorList);
	}

}
