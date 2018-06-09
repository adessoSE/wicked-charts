package de.adesso.wickedcharts.showcase.configurations;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.BubbleValue;
import de.adesso.wickedcharts.showcase.configurations.base.ShowcaseConfiguration;

import java.util.Arrays;
import java.util.Random;
/**
 * 
 * A sample that shows how a bubble chart configuration looks.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/scriptable/bubble.html">http://www.chartjs.org/samples/latest/scriptable/bubble.html</a>
 *
 * @author maximAtanasov
 * @author anedomansky
 */
@SuppressWarnings("serial")
public class BubbleChartConfiguration extends ShowcaseConfiguration {
	public BubbleChartConfiguration() {
		super();
		setType(ChartType.BUBBLE);

		Data data = new Data()
				.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("My First dataset")
				.setBackgroundColor(SimpleColor.GREEN_TRANSPARENT)
				.setBorderColor(SimpleColor.YELLOW)
				.setHoverBackgroundColor(SimpleColor.WHITE)
				.setHoverBorderColor(SimpleColor.RED)
				.setHoverBorderWidth(10.0) 
				.setData(Arrays.asList(
						new BubbleValue(randomDouble(100),randomDouble(100),randomDouble(100)),
						new BubbleValue(randomDouble(100),randomDouble(100),randomDouble(100)),
						new BubbleValue(randomDouble(100),randomDouble(100),randomDouble(100)),
						new BubbleValue(randomDouble(100),randomDouble(100),randomDouble(100)),
						new BubbleValue(randomDouble(100),randomDouble(100),randomDouble(100)),
						new BubbleValue(randomDouble(100),randomDouble(100),randomDouble(100)),
						new BubbleValue(randomDouble(100),randomDouble(100),randomDouble(100))
						))
				.setFill(false);
		
		Dataset dataset2 = new Dataset()
				.setLabel("My Second dataset")
				.setBackgroundColor(SimpleColor.BLUE_TRANSPARENT)
				.setBorderColor(SimpleColor.RED)
				.setHoverBackgroundColor(SimpleColor.WHITE)
				.setHoverBorderColor(SimpleColor.RED)
				.setHoverBorderWidth(10.0)
				.setData(Arrays.asList(
						new BubbleValue(randomDouble(100),randomDouble(100),randomDouble(100)),
						new BubbleValue(randomDouble(100),randomDouble(100),randomDouble(100)),
						new BubbleValue(randomDouble(100),randomDouble(100),randomDouble(100)),
						new BubbleValue(randomDouble(100),randomDouble(100),randomDouble(100)),
						new BubbleValue(randomDouble(100),randomDouble(100),randomDouble(100)),
						new BubbleValue(randomDouble(100),randomDouble(100),randomDouble(100)),
						new BubbleValue(randomDouble(100),randomDouble(100),randomDouble(100))
						))
				.setFill(false);
		
		Dataset dataset3 = new Dataset()
				.setLabel("My Third dataset")
				.setBackgroundColor(SimpleColor.RED_TRANSPARENT)
				.setBorderColor(SimpleColor.YELLOW)
				.setHoverBackgroundColor(SimpleColor.WHITE)
				.setHoverBorderColor(SimpleColor.RED)
				.setHoverBorderWidth(10.0)
				.setData(Arrays.asList(
						new BubbleValue(randomDouble(100),randomDouble(100),randomDouble(100)),
						new BubbleValue(randomDouble(100),randomDouble(100),randomDouble(100)),
						new BubbleValue(randomDouble(100),randomDouble(100),randomDouble(100)),
						new BubbleValue(randomDouble(100),randomDouble(100),randomDouble(100)),
						new BubbleValue(randomDouble(100),randomDouble(100),randomDouble(100)),
						new BubbleValue(randomDouble(100),randomDouble(100),randomDouble(100)),
						new BubbleValue(randomDouble(100),randomDouble(100),randomDouble(100))
						))
				.setFill(false);
		
		data.setDatasets(Arrays.asList(dataset1,dataset2,dataset3));
		
		Options options = new Options()
				.setResponsive(true)
				.setAspectRatio((double)1)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Chart.js Bubble Chart"))
				;
		setOptions(options);
		
		
	}
	
	private Double randomDouble(int bound) {
		Random random = new Random();
		return (double)random.nextInt(bound)+1;
	}
}
