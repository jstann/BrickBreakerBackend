/**
 * Jasmine Tann
 * 10/01/2024
 * COMP 167 Computer Programming and Design
 */
/**
 * The GameProfiles file is a class that manages the player profiles.
 * It also manages the filename for the profile, which can be used to load or store player profiles.
 */



package edu.ncat.brickbreakerbackend;

import java.util.ArrayList;
public class GameProfiles {
    private PlayerProfile selectedProfile;
    private PlayerProfile highGameProfile;
    private ArrayList<PlayerProfile> profiles;
    private String profileFileName;
    public GameProfiles() {
        this.selectedProfile = null;
        this.highGameProfile = null;
        this.profiles = new ArrayList<>();
        this.profileFileName = null;
    }
    public PlayerProfile getSelectedProfile() {
        return selectedProfile;
    }
    public void setSelectedProfile(PlayerProfile selectedProfile) {
        this.selectedProfile = selectedProfile;
    }
    public PlayerProfile getHighGameProfile() {
        return highGameProfile;
    }
    public void setHighGameProfile(PlayerProfile highGameProfile) {
        this.highGameProfile = highGameProfile;
    }
    public ArrayList<PlayerProfile> getPlayerProfiles() {
        return profiles;
    }
    public void setPlayerProfiles(ArrayList<PlayerProfile> playerProfiles) {
        this.profiles = playerProfiles;
    }
    public String getProfileFileName() {
        return profileFileName;
    }
    public void setProfileFileName(String profileFileName) {
        this.profileFileName = profileFileName;
    }
    /**
     * ArrayList Methods
     */
    public int getNumPlayerProfiles() {
        return profiles.size();
    }
    public PlayerProfile getPlayerProfile(int index) {
        return profiles.get(index);
    }
    public void setPlayerProfile(int index, PlayerProfile profile) {
        profiles.set(index, profile);
    }
    public void addPlayerProfile(PlayerProfile profile) {
        profiles.add(profile);
    }
    public void removePlayerProfile(int index) {
        profiles.remove(index);
    }
    @Override
    public String toString() {
        StringBuilder levelstring = new StringBuilder();
        for (PlayerProfile profile : profiles) {
            levelstring.append(profile.toString());
        }
        return levelstring.toString();
    }
}
