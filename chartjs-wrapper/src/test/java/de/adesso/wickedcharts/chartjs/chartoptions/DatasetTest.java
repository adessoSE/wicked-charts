package de.adesso.wickedcharts.chartjs.chartoptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.BooleanFillingMode;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.BoundaryFillingMode;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.ValueType;

public class DatasetTest {
	private Dataset testDataset;
	private List<? extends Color> testColorList;
	private List<? extends ValueType> testDataList;
	private List<? extends Number> testPointRadiusList;
	
	@Before
	public void setUp() throws Exception {
		testDataset = new Dataset();
		testColorList = Arrays.asList(SimpleColor.RED, SimpleColor.BLUE);
		testDataList = IntegerValue.of(1,2,3,4,5);
		testPointRadiusList = Arrays.asList(1,2,3,4);
	}
	
	@Test
	public void testSetBackgroundColor() {
		testDataset.setBackgroundColor(SimpleColor.RED);
		assertEquals(testDataset.getBackgroundColor(), Arrays.asList(SimpleColor.RED));
	}
	
	@Test
	public void testSetBackgroundColorList() {
		testDataset.setBackgroundColor(testColorList);
		assertEquals(testDataset.getBackgroundColor(), testColorList);
	}
	
	@Test
	public void testSetDataList() {
		testDataset.setData(testDataList);
		assertEquals(testDataset.getData(), testDataList);
	}
	
	@Test
	public void testSetPointRadiusList() {
		testDataset.setPointRadius(testPointRadiusList);
		assertEquals(testDataset.getPointRadius(), testPointRadiusList);
	}
	
	@Test
	public void testSetPointRadius() {
		testDataset.setPointRadius(5);
		assertEquals(testDataset.getPointRadius(), Arrays.asList(5));
	}
	
	@Test
	public void testSetFill() {
		testDataset.setFill(BoundaryFillingMode.START);
		assertEquals(testDataset.getFill(), BoundaryFillingMode.START);
	}
	
	@Test
	public void testSetFillBoolFalse() {
		testDataset.setFill(true);
		assertEquals(testDataset.getFill(), null);
	}
	
	@Test
	public void testSetFillBoolTrue() {
		testDataset.setFill(false);
		assertEquals(testDataset.getFill(), BooleanFillingMode.FALSE);
	}
	
	
}
