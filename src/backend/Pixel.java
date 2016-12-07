package backend;

/**
 * Represents a pixel in an image.
 * 
 * @author Zander Ackerman
 * @version 0.0.1
 */
public class Pixel {
    // Field

    /**
     * [Red, Green, Blue] Each value can range from [0, 255] inclusive.
     */
    private int[] colorData;


    // Constructor
    /**
     * Creates a new pixel that has the default color of white.
     */
    public Pixel() {
        colorData = new int[3];
        colorData[0] = 0;
        colorData[1] = 0;
        colorData[2] = 0;
    }


    /**
     * Creates a new pixel with a specified color.
     * 
     * @param color
     *            Three element array detailing the Red value, Green value, and
     *            Blue value
     */
    public Pixel(int[] color) {
        if (color.length != 3) {
            throw new IllegalArgumentException();
        }

        // Checks to make sure each color value in the color array is a valid
        // value.
        checkBound(color);
        colorData = color;
    }


    public int[] getColorData() {
        return colorData;
    }


    public void setColorData(int red, int green, int blue) {
        int[] tempArray = {red, green, blue};
        checkBound(tempArray);
        colorData[0] = red;
        colorData[1] = green;
        colorData[2] = blue;
        
    }


    public void changeRed(int delRed) {
        checkBound(colorData[0] + delRed);
        colorData[0] = colorData[0] + delRed;
    }


    public void changeGreen() {

    }


    public void changeBlue() {

    }


    public void changeColor() {

    }


    public void changeSaturation() {

    }


    public void mix() {

    }


    public String toString() {
        return "";
    }


    public boolean equals() {
        return false;
    }
    
    private void checkBound(int value) {
        if(value > 255 || value < 0) {
            throw new ValueOutOfBoundsException();
        }
    }
    
    private void checkBound(int[] array) {
        for(int value : array) {
            checkBound(value);
        }
    }
}
