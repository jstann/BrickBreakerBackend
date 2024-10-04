/**
 * Jasmine Tann
 * 10/01/2024
 * COMP 167 Computer Programming and Design
 */
/**
 * The PlayerProfile file is a class that is mean to handle the profile of the player. The file
 * saves data about player like the name,, total number of games played, highest scores and the list of saved games
 * The class has methods to set and retrieve these values.
 */



package edu.ncat.brickbreakerbackend;

import java.util.ArrayList;


public class PlayerProfile {
    private String name;                        // Players Name
    private int numGamesPlayed;                 // Current number of games played
    private int highScore;                      //Players current high score
    private ArrayList<String> savedGames;

    /**
     * Default constructor
     */
    public PlayerProfile () {
        this.name = null;                       //Initialize with default or empty name
        this.numGamesPlayed = 0;                //Initialize with 0 number of games played
        this.highScore = 0;                     //Initialize with 0 high score
        this.savedGames = new ArrayList<>();    //List of players saved games
    }

    public PlayerProfile (String name) {
        this.name = name;
        this.savedGames = new ArrayList<>();
    }

    /**
     * Getters and Setters
     * @return
     */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumGamesPlayed() {
        return numGamesPlayed;
    }
    public void setNumGamesPlayed(int numGamesPlayed) {
        this.numGamesPlayed = numGamesPlayed;
    }
    public int getHighScore() {
        return highScore;
    }
    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }
    public ArrayList<String> getSavedGames() {
        return savedGames;
    }
    public void setSavedGames(ArrayList<String> savedGames) {
        this.savedGames = savedGames;
    }
    /**
     * ArrayList Methods
     * @return
     */
    public int getNumSavedGames() {
        return savedGames.size();
    }
    public String getSavedGame(int index) {
        return savedGames.get(index);
    }
    public void setSavedGames(int index, String name){
        savedGames.set(index, name);
    }
    public void addSavedGame(String name) {
        savedGames.add(name);
    }
    public String deletedSavedGames(int index) {
        return savedGames.remove(index);
    }
    @Override
    public String toString() {
        StringBuilder levelstring = new StringBuilder();
        levelstring.append(name).append("\n");
        levelstring.append(numGamesPlayed).append("\n");
        levelstring.append(highScore).append("\n");
        levelstring.append(savedGames.size()).append("\n");
        for (int i = 0; i < savedGames.size(); i++) {
            levelstring.append(savedGames.get(i)).append("\n");
        }
        return levelstring.toString();
    }
}
