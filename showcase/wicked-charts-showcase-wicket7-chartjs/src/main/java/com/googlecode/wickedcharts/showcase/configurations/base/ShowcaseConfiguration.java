package com.googlecode.wickedcharts.showcase.configurations.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.googlecode.wickedcharts.chartjs.ChartConfiguration;

@SuppressWarnings("serial")
public abstract class ShowcaseConfiguration extends ChartConfiguration implements Serializable {
	
	protected List<Integer> randomIntegerList(int size) {
		List<Integer> dataList = new ArrayList<Integer>();
		Random rng = new Random();
		for (int i = 0; i < size; i++) {
			dataList.add(rng.nextInt(20));
		}
		return dataList;
	}
}
