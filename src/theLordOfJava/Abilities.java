package theLordOfJava;

/** The 'Abilities' class represents the essence of every fabulous creature in the Java realm,
  * it characterizes the strength of each individual. The higher a character's personal skill
  * values, the more respected he is in society, the more feared he is, and the more likely
  * he is to win a battle against a "weaker" creature. */

public class Abilities implements Comparable<Abilities> {
    /** FIELDS */
    private double stamina; // The creature's physical strength
    private double speed;   // The creature's speed, crucial in surprise attacks
    private int agility;    // Personal agility, the ability to defend, fight back and
                            // change the fate of a duel at key moments when all seemed lost

    /** CONSTRUCTORS */
    Abilities(double stamina, double speed, int agility) {
        this.stamina = stamina;
        this.speed = speed;
        this.agility = agility;
    }

    /** METHODS */
    // Compare the abilities of two creatures
    @Override
    public int compareTo(Abilities other) {
        if (this.stamina != other.stamina) {
            return (this.stamina < other.stamina) ? -1 : 1;
        }

        if (this.speed != other.speed) {
            return (this.speed < other.speed) ? -1 : 1;
        }

        if (this.agility != other.agility) {
            return (this.agility < other.agility) ? -1 : 1;
        }

        return 0;
    }

    // Update the current creature's abilities
    public void update(double stamina,
                       double speed,
                       int agility) {
        this.stamina += stamina;
        this.speed += speed;
        this.agility += agility;
    }

    // Check the power difference between 2 characters
    public int powerDifferenceApprox(Abilities other) {
        return (int) Math.abs(this.stamina - other.stamina);
    }

    @Override
    public String toString() {
        return "Player has a power of: " +
                this.stamina + ", the speed: " + this.speed +
                " and the agility: " + this.agility;
    }
}