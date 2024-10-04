/**
 * Jasmine Tann
 * 10/01/2024
 * COMP 167 Computer Programming & Design
 */

/**
 * The Brick Row file defines the Brick Row class that represents one row of bricks.
 All the bricks in the row have the same color and point value, but you may choose which
 bricks are displayed or concealed by using a "mask."This class is primarily intended to assist
 in designing levels with brick rows that can have different looks depending on whether bricks are
 shown or buried, all while maintaining the same color and row score.
 */


package edu.ncat.brickbreakerbackend;

import javafx.scene.paint.Color;
public class BrickRow {
    private int pointValue;
    private Color color;
    private boolean [] brickmask;
    /**
     * No arg BrickRow constructor that sets instance variables to default
     */
    public BrickRow() {                      //Default Constructor or no arg constructor
        this.pointValue = 0;                 //Default initial pointValue
        this.color = Color.BLACK;            //Default color is black
        this.brickmask = new boolean[20];    //Default brick mask is at 0
    }

    /**
     * Constructor initializing instance variables to its corresponding arguments
     * @param ptVal
     * @param clr
     * @param bMask
     */
    public BrickRow(int ptVal, Color clr, String bMask) {
        this.pointValue = ptVal;
        this.color = clr;
        this.brickmask = new boolean[bMask.length()];//Creates brickmask array
        for(int i = 0; i < bMask.length(); i++) { /*The for loop goes through each charcater in the string
                                                   and adds an integer into the array that represents that character*/
            if(bMask.charAt(i) == '1') {
                this.brickmask[i] = true;
            }
            else {
                this.brickmask[i] = false;
            }
        }
    }
    /**
     * Getters and setters for ptVal & clr
     */
    public int getPointValue() {
        return pointValue;
    }
    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Return the brick mask value at location index in brickMask.
     */

    public int getBrickmaskValue(int index) {
        for (int i = 0; i < brickmask.length; i++) {
            if (index == i) {
                return 1;
            }
        }
        return 0;
    }
    public void setBrickmaskValue(int index, boolean value) {
        brickmask[index] = value;
    }
    public int getBrickMaskLength() {
        return brickmask.length;
    }

    /**
     * Returns a string representing this object... in this case ptVal and the RGB colors
     */

    @Override
    public String toString() {
        int r = (int) (color.getRed() * 255);
        int g = (int) (color.getGreen() * 255);
        int b = (int) (color.getBlue() * 255);
        String brickmaskString = ""; //Creates empty string
        brickmaskString += pointValue + "\n" + r + " " + g + " " + b + "\n" +brickmaskString;
        for (int i = 0; i < brickmask.length; i++) {
            if (brickmask[i]) {
                brickmaskString += "1";
            }
            else {
                brickmaskString += "0";
            }
        }
        return brickmaskString;
    }
}
