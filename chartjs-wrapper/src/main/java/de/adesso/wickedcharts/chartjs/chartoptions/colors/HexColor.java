package de.adesso.wickedcharts.chartjs.chartoptions.colors;

@lombok.Data
public class HexColor extends Color {
	private int red;
	private int green;
	private int blue;
	private String hexColor;
	
	public HexColor(int red, int green, int blue) {
		hexColor = String.format("'#%02X%02X%02X'", red, green, blue);
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	public HexColor(String hexcolor) {
		this.hexColor = hexColor.toLowerCase();
		this.hexColor = "'" + hexColor + "'";
		if (!hexColor.matches("^#[0-9a-fA-F]{6}$")) {
			throw new IllegalArgumentException("Invalid hex color format: " + hexColor
			    + ". A hex color must be of the format \"^#[0-9a-fA-F]{6}$\".");
		}
	}
	
	public String getValue() {
		return hexColor;
	}

}