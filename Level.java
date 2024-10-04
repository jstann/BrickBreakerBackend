/**
 * Jasmine Tann
 * 10/01/2024
 * COMP 167 Computer Programming and Design
 */

/**
 * The Level file defines the Levels class represent the rows of bricks in a level,
 * makes up the Level class's model of a single game level. Brick rows are kept in an array,
 * and each level is designated by a number label, or level number. The main goal is to organize
 * every game level as a collection of brick rows.
 */


package edu.ncat.brickbreakerbackend;

/**
 * Default no arg Constructor
 */
public class Level {
    private int levelNum;
    private BrickRow[] brickRows;
    public Level() { //Default constructor or no args constructor
        levelNum = 0;    //Set to java defaults value
        brickRows = null; //Set empty array
    }

    /**
     * Constructor initializes variables
     * @param levelNum
     * @param numBricks
     */
    public Level(int levelNum, int numBricks) {
        this.levelNum = levelNum;
        this.brickRows = new BrickRow[numBricks]; // Instantiate the array with the specified size
    }
    public int getlevelNum() {
        return levelNum;
    }
    public void setLevelNum(int levelNum) {
        this.levelNum = levelNum;
    }
    public BrickRow getBrickRow(int index) {
        return brickRows[index];
    }
    // Set BrickRow at index
    public void setBrickRow(int index, BrickRow bkRow) {
        this.brickRows[index] = bkRow;
    }

    /**
     * Returns the length of each brick row
     * @param index
     * @return
     */
    public int getBricksPerRow(int index) {
        return brickRows[0].getBrickMaskLength();
    }
    @Override
    public String toString() {
        StringBuilder levelstring = new StringBuilder();
        levelstring.append(levelNum).append("\n");
        levelstring.append(brickRows.length).append("\n");
        for (int i = 0; i < brickRows.length; i++) {
            levelstring.append(i).append("\n");
            levelstring.append(brickRows[i]).append("\n");
        }
        return levelstring.toString(); // Return the complete string
    }
}

