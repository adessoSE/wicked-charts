package de.adesso.wickedcharts.showcase.configurations.base;

import de.adesso.wickedcharts.chartjs.ChartConfiguration;
import org.apache.wicket.markup.html.panel.Fragment;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * The base class for all chart configurations for the showcase
 */
@SuppressWarnings("serial")
public abstract class ShowcaseConfiguration extends ChartConfiguration {

	protected List<Integer> randomIntegerList(int size) {
		List<Integer> dataList = new ArrayList<>();
		Random rng = new Random();
		for (int i = 0; i < size; i++) {
			dataList.add(rng.nextInt(60) + 1);
		}
		return dataList;
	}

	protected String readFile(String fileName) {

		StringBuilder result = new StringBuilder("");

		// Get file from resources folder
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());

		try (Scanner scanner = new Scanner(file)) {

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				result.append(line).append("\n");
			}

			scanner.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return result.toString();

	}

	public void modfiyIndividualMarkup(Fragment optionalMarkup) {
	    Fragment frag = new Fragment("optionalMarkup","defaultTooltip",optionalMarkup.getParent());
	    optionalMarkup.replaceWith(frag);
	}
}
