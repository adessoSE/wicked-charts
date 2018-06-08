/**
 *   Copyright 2012-2018 Wicked Charts (http://github.com/adessoAG/wicked-charts)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package de.adesso.wickedcharts.showcase.jsf.bean;

import de.adesso.wickedcharts.highcharts.options.Options;
import de.adesso.wickedcharts.highcharts.theme.*;
import de.adesso.wickedcharts.showcase.options.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Matthias Balke (matthias.balke@gmail.com)
 *
 */
@ManagedBean
@SessionScoped
public class Showcase {

	private Options options = null;
	private Theme theme = null;

	public Showcase() {
		this.selectBasicLineOptions();
		this.selectDefaultTheme();
	}

	public String getOptionsValue() {
		return "#{myBean.options}";
	}

	public String getThemeValue() {
		return "#{myBean.theme}";
	}

	public String getThemeUrlRefValue() {
		return "#{myBean.themeUrlRef}";
	}

	/* Theme */

	public Theme getTheme() {
		return this.theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	public void selectDefaultTheme() {
		this.setTheme(null);
	}

	public void selectGridTheme() {
		this.setTheme(new GridTheme());
	}

	public void selectSkiesTheme() {
		this.setTheme(new SkiesTheme());
	}

	public void selectGrayTheme() {
		this.setTheme(new GrayTheme());
	}

	public void selectDarkBlueTheme() {
		this.setTheme(new DarkBlueTheme());
	}

	/* Options */

	public Options getOptions() {
		return this.options;
	}

	public void setOptions(Options options) {
		this.options = options;
	}

	public void selectBasicLineOptions() {
		this.setOptions(new BasicLineOptions());
	}

	public void selectSplineWithSymbolsOptions() {
		this.setOptions(new SplineWithSymbolsOptions());
	}

	public void selectIrregularIntervalsOptions() {
		this.setOptions(new TimeDataWithIrregularIntervalsOptions());
	}

	/* Lines */
	public void selectLineWithDataLabelsOptions() {
		this.setOptions(new LineWithDataLabelsOptions());
	}

	public void selectZoomableTimeSeriesOptions() {
		this.setOptions(new ZoomableTimeSeriesOptions(false));
	}

	public void selectSplineWithInvertedAxisOptions() {
		this.setOptions(new SplineWithInvertedAxisOptions());
	}

	public void selectSplineWithPlotBandsOptions() {
		this.setOptions(new SplineWithPlotBandsOptions());
	}

	public void selectTimeDataWithIrregularIntervalsOptions() {
		this.setOptions(new TimeDataWithIrregularIntervalsOptions());
	}

	public void selectLogarithmicAxisOptions() {
		this.setOptions(new LogarithmicAxisOptions());
	}

	public void selectScatterOptions() {
		this.setOptions(new ScatterPlotOptions());
	}

	/* Area */

	public void selectBasicAreaOptions() {
		this.setOptions(new BasicAreaOptions());
	}

	public void selectAreaWithNegativeValuesOptions() {
		this.setOptions(new AreaWithNegativeValuesOptions());
	}

	public void selectStackedAreaOptions() {
		this.setOptions(new StackedAreaOptions());
	}

	public void selectPercentageAreaOptions() {
		this.setOptions(new PercentageAreaOptions());
	}

	public void selectAreaWithMissingOptions() {
		this.setOptions(new AreaMissingOptions());
	}

	public void selectAreaWithInvertedAxisOptions() {
		this.setOptions(new AreaInvertedAxisOptions());
	}

	public void selectAreaSplineOptions() {
		this.setOptions(new AreaSplineOptions());
	}

	/* Column and Bar */

	public void selectBasicBarOptions() {
		this.setOptions(new BasicBarOptions());
	}

	public void selectStackedBarOptions() {
		this.setOptions(new StackedBarOptions());
	}

	public void selectBarWithNegativeStackOptions() {
		this.setOptions(new BarWithNegativeStackOptions());
	}

	public void selectBasicColumnOptions() {
		this.setOptions(new BasicColumnOptions());
	}

	public void selectColumnWithNegativeValuesOptions() {
		this.setOptions(new ColumnWithNegativeValuesOptions());
	}

	public void selectStackedColumnOptions() {
		this.setOptions(new StackedColumnOptions());
	}

	public void selectStackedAndGroupedColoumOptions() {
		this.setOptions(new StackedAndGroupedColumnOptions());
	}

	public void selectStackedPercentagetOptions() {
		this.setOptions(new StackedPercentageOptions());
	}

	public void selectColumnWithRotatedLabelsOptions() {
		this.setOptions(new ColumnWithRotatedLabelsOptions());
	}

	public void selectColumnWithDrilldownOptions() {
		this.setOptions(new ColumnWithDrilldownOptions());
	}

	/* Pie */

	public void selectBasicPieOptions() {
		this.setOptions(new BasicPieOptions());
	}

	public void selectPieWithGradientOptions() {
		this.setOptions(new PieWithGradientOptions());
	}

	public void selectDonutOptions() {
		this.setOptions(new DonutOptions());
	}

	public void selectPieWithLegendOptions() {
		this.setOptions(new PieWithLegendOptions());
	}

	/* Dynamic */

    public void selectClickToAddPointOptions() {
        this.setOptions(new ClickToAddAPointOptions());
    }

	/* Combinations */

    public void selectComboOptions() {
        this.setOptions(new ComboOptions());
    }

    public void selectDualAxesLineColumnOptions() {
        this.setOptions(new DualAxesOptions());
    }

    public void selectMultipleAxesOptions() {
        this.setOptions(new MultipleAxesOptions());
    }

    public void selectScatterWithRegressionLineOptions() {
        this.setOptions(new ScatterWithRegressionLineOptions());
    }

	/* More chart types */

    public void selectAngularGaugeOptions() {
        this.setOptions(new AngularGaugeOptions());
    }

    public void selectAreaRangeOptions() {
        this.setOptions(new AreaRangeOptions());
    }

    public void selectColumnRangeOptions() {
        this.setOptions(new ColumnRangeOptions());
    }

    public void selectPolarOptions() {
        this.setOptions(new PolarOptions());
    }

    public void selectSpiderwebOptions() {
        this.setOptions(new SpiderwebOptions());
    }

    public void selectWindroseOptions() {
        this.setOptions(new WindroseOptions());
    }

    public void selectBubbleChart() {
        this.setOptions(new BubbleChartOptions());
    }

    public void selectClientServerInteractionOptions() {
        this.setOptions(new InteractionOptions());
    }

}
