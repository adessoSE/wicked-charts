package de.adesso.wickedcharts.chartjs.chartoptions.colors;

@lombok.Data
public class HexColor extends Color {

	private int red;
	private int green;
	private int blue;

	public HexColor(int red, int green, int blue) {
	    this.setRed(red);
		this.setGreen(green);
		this.setBlue(blue);
	}
	
	public HexColor(String hexColor) {
		if (!hexColor.matches("^#[0-9a-fA-F]{6}$")) {
			throw new IllegalArgumentException("Invalid hex color format: " + hexColor
			    + ". A hex color must be of the format \"^#[0-9a-fA-F]{6}$\".");
		}else{
			String red_s =  Character.toString(hexColor.charAt(1)) + Character.toString(hexColor.charAt(2));
			red = Integer.parseInt(red_s);
			String green_s = Character.toString(hexColor.charAt(3)) + Character.toString(hexColor.charAt(4));
			green = Integer.parseInt(green_s);
			String blue_s = Character.toString(hexColor.charAt(5)) + Character.toString(hexColor.charAt(6));
			blue = Integer.parseInt(blue_s);
		}
	}

	public HexColor setRed(int value){
	    if(value >= 0 && value <= 255){
	        this.red = value;
        }else{
	        throw new IllegalArgumentException("Color value can only be in the range 0-255");
        }
        return this;
    }

    public HexColor setGreen(int value){
        if(value >= 0 && value <= 255){
            this.green = value;
        }else{
            throw new IllegalArgumentException("Color value can only be in the range 0-255");
        }
        return this;
    }

    public HexColor setBlue(int value){
        if(value >= 0 && value <= 255){
            this.blue = value;
        }else{
            throw new IllegalArgumentException("Color value can only be in the range 0-255");
        }
        return this;
    }
}