package edu.ncat.brickbreakerbackend;

public class Level {
    private int levelNum;
    private BrickRow[] brickRows;

    public Level() { //Default constructor or no args constructor
        levelNum = 0;    //Set to java defaults value
        brickRows = null; //Set empty array
    }

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

