package edu.ncat.brickbreakerbackend;

import javafx.scene.paint.Color;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static javafx.scene.paint.Color.rgb;

public class BrickBreakerIO {
    public static Level[] readConfigFile(String configFileName) throws FileNotFoundException {
        File configFile = new File(configFileName);
        Scanner scnr = new Scanner(configFile);
        Level[] levels = new Level[scnr.nextInt()];

        for (int i = 0; i < levels.length; i++) {
            int numLevels = scnr.nextInt();
            int numBricks = scnr.nextInt();
            Level level = new Level(numLevels, numBricks);

            for (int j = 0; j < numBricks; j++) {
                int numOfBrickRows = scnr.nextInt();
                Color color = rgb(scnr.nextInt(), scnr.nextInt(), scnr.nextInt());
                int pointVal = scnr.nextInt();
                String brickMask = scnr.next();
                BrickRow bricks = new BrickRow(pointVal, color, brickMask);
                level.setBrickRow(j, bricks);
            }
            levels[i] = level;
        }
        scnr.close();
        return levels;
    }

    public static void readProfiles(GameProfiles gmProf, String pfileName) throws FileNotFoundException {
        Scanner scnr = new Scanner(new File(pfileName));
        while (scnr.hasNextLine()) {
            String playerName = scnr.nextLine();
            int numGames = Integer.parseInt(scnr.nextLine());
            int highscore = Integer.parseInt(scnr.nextLine());
            int numOfGamesSaves = Integer.parseInt(scnr.nextLine());
            PlayerProfile profiles = new PlayerProfile(playerName);
            profiles.setHighScore(highscore);
            profiles.setNumGamesPlayed(numGames);

            if (numOfGamesSaves > 0) {
                for (int i = 0; i < numOfGamesSaves; i++) {
                    profiles.addSavedGame(scnr.nextLine());
                }

            }
            gmProf.addPlayerProfile(profiles);

        }
        scnr.close();
    }

    public static void writeProfiles(GameProfiles gmProf, String pfileName) throws IOException {
        FileWriter write = new FileWriter(pfileName);
        write.write(gmProf.toString());
        write.close();
    }
}

