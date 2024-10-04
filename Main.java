package edu.ncat.brickbreakerbackend;
import javafx.scene.paint.Color;

import java.io.FileNotFoundException;

import static edu.ncat.brickbreakerbackend.BrickBreakerIO.ReadProfiles;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        BrickRow brickRow = new BrickRow(3, Color.PINK, "10100");
        Level level = new Level(3, 10);
        GameProfiles myobj = new GameProfiles();

        /*PlayerProfile playerProfile = new PlayerProfile();
        playerProfile.addSavedGame("test");
        playerProfile.setName("Jasmine");
        playerProfile.setHighScore(10);
        playerProfile.setNumGamesPlayed(10);
        level.setBrickRow(0, brickRow);
        myobj.addPlayerProfile(playerProfile);

        Level[] levels = readConfigFile("/Users/jstann23/MajorPrograms/BrickBreakerBackend/src/edu/ncat/brickbreakerbackend/ConfigFile");
        for (Level level1 : levels) {
            System.out.println(level1);
        }


        System.out.println(myobj);

         */
        ReadProfiles(myobj, "/Users/jstann23/MajorPrograms/BrickBreakerBackend/src/edu/ncat/brickbreakerbackend/SampleProfile");
        System.out.println(myobj);
    }

}