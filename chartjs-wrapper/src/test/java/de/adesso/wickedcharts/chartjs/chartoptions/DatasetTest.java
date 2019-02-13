package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.BooleanFillingMode;
import de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes.BoundaryFillingMode;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.ValueType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class DatasetTest {
	private Dataset testDataset;
	private List<? extends Color> testColorList;
	private List<? extends ValueType> testDataList;
	private List<? extends Number> testPointRadiusList;
	
	@BeforeEach
	void setUp() {
		testDataset = new Dataset();
		testColorList = Arrays.asList(SimpleColor.RED, SimpleColor.BLUE);
		testDataList = IntegerValue.of(1,2,3,4,5);
		testPointRadiusList = Arrays.asList(1,2,3,4);
	}
	
	@Test
	void testSetBackgroundColor() {
		testDataset.setBackgroundColor(SimpleColor.RED);
		assertEquals(testDataset.getBackgroundColor(), Collections.singletonList(SimpleColor.RED));
	}
	
	@Test
	void testSetBackgroundColorList() {
		testDataset.setBackgroundColor(testColorList);
		assertEquals(testDataset.getBackgroundColor(), testColorList);
	}
	
	@Test
	void testSetDataList() {
		testDataset.setData(testDataList);
		assertEquals(testDataset.getData(), testDataList);
	}
	
	@Test
	void testSetPointRadiusList() {
		testDataset.setPointRadius(testPointRadiusList);
		assertEquals(testDataset.getPointRadius(), testPointRadiusList);
	}
	
	@Test
	void testSetPointRadius() {
		testDataset.setPointRadius(5);
		assertEquals(testDataset.getPointRadius(), Collections.singletonList(5));
	}
	
	@Test
	void testSetFill() {
		testDataset.setFill(BoundaryFillingMode.START);
		assertEquals(testDataset.getFill(), BoundaryFillingMode.START);
	}
	
	@Test
	void testSetFillBoolFalse() {
		testDataset.setFill(true);
		assertNull(testDataset.getFill());
	}
	
	@Test
	void testSetFillBoolTrue() {
		testDataset.setFill(false);
		assertEquals(testDataset.getFill(), BooleanFillingMode.FALSE);
	}
	
	
}
