package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.json.LowercaseEnum;

import java.io.Serializable;

/**
 * Defines the different font styles.
 *
 * @see <a
 *      href="http://www.chartjs.org/docs/latest/axes/styling.html?h=fontstyle">http://www.chartjs.org/docs/latest/axes/styling.html?h=fontstyle</a>
 *
 * @author SvenWirz
 */
public enum FontStyle implements LowercaseEnum, Serializable {
 NORMAL,BOLD, ITALIC, OBLIQUE, INITIAL, INHERIT;
}
