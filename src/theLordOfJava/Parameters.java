package theLordOfJava;

/** The game ecosystem-specific class that contains the technical details of the game. */

public class Parameters {
    /** FIELDS */
    private final String OS; // Operating system
    private final String gamePATH; // The path (PATH) in the file system to the game location
    private final String credentials; // Credentials (login) for the user account
    private final int noLives; // The player's number of lives left

    /** CONSTRUCTORS */
    Parameters(String OS,
               String gamePATH,
               String credentials,
               int noLives) {
        this.OS = OS;
        this.gamePATH = gamePATH;
        this.credentials = credentials;
        this.noLives = noLives;
    }

    /** METHODS */
    public String getOS() {
        return OS;
    }

    public String getGamePATH() {
        return gamePATH;
    }

    public String getCredentials() {
        return credentials;
    }

    public int getNoLives() {
        return noLives;
    }

    @Override
    public String toString(){
        return "OS: " + getOS() +
                "\nGame Path: " + getGamePATH() +
                "\nCredentials: " + getCredentials() +
                "\nNo. lives remaining: " + getNoLives();
    }
}