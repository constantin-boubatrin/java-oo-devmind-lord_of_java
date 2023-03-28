package main.typesOfCreatures;

/** The abstract class that details the general specifications of a supernatural creature */

abstract class Creature implements ICreature, Comparable<Creature> {
    /** FIELDS */
    private Abilities abilities; // A creature's features
    private String nickname; // The (individual) name / nickname of the mystical character
    private long score; // The creature's in-game score

    /** CONSTRUCTORS */
    Creature(double stamina,
             double speed,
             int agility,
             String nickname,
             long score) {
        abilities = new Abilities(stamina, speed, agility);
        this.nickname = nickname;
        this.score = score;
    }

    /** METHODS */
    @Override
    public String getNickname() {
        return this.nickname;
    }

    @Override
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public long getScore() {
        return this.score;
    }

    public Abilities getAbilities() {
        return this.abilities;
    }

    // Update the creature's features
    @Override
    public void updateScore(long amount) throws NumberFormatException {
        if(amount <= 0) {
            throw new NumberFormatException("Expecting positive bonus value, got: " + amount);
        }
        this.score += amount;
    }

    // Update the creature's abilities by delegation
    @Override
    public void powerUp(double stamina,
                        double speed,
                        int agility) {
        this.abilities.update(stamina, speed, agility); //
    }

    // Compare the abilities of two creatures by delegation
    @Override
    public int compareTo(Creature other) {
        return this.abilities.compareTo(other.abilities);
    }

    @Override
    public String toString() {
        return "\nNickname: " + getNickname() +
                "\nScore: " + getScore() +
                "\nAbilities: " + getAbilities();
    }
}