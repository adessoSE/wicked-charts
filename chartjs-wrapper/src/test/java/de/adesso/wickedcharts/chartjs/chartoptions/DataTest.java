package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.chartoptions.label.Label;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class DataTest {

	private Data testData;
	private List<Label> labelList;
	
	@BeforeEach
	void setUp() {
		testData = new Data();
		labelList = Arrays.asList(new TextLabel("foo"), new TextLabel("bar"));
	}

	@Test
	void testSetStringLabels() {
		List<String> list = Arrays.asList("foo","bar");
		testData.setLabels(TextLabel.of(list));
		assertEquals(testData.getLabels(),labelList);
	}


	@Test
	void testSetLabelList() {
		testData.setLabels(labelList);
		assertEquals(testData.getLabels(),labelList);
	}

}
