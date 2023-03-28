package theLordOfJava;

import java.util.ArrayList;
import java.util.List;

/** The 'Warg' class details mystical creatures whose superpowers are
  * crushingly powerful and almost always lethal bites. */

public class Warg extends Creature implements IBite {
    /** FIELDS */
    private static final List<String> WARG_NICKNAMES = new ArrayList<>(
            List.of("Fenrir", "Sköll", "Hati"));
    private static final int MAX_VALUE = 1000;
    private final double bitePower; // The bite strength of a creature of this species, in a duel

    /** CONSTRUCTORS */
    Warg(double stamina, double speed, int agility, String nickname, long score, double bitePower) {
        super(stamina, speed, agility, nickname, score);
        this.bitePower = bitePower;
    }

    /** METHODS */
    @Override
    public double getBitePower() {
        return this.bitePower;
    }

    // Update the Warg's abilities
    @Override
    public void powerUp(double newStamina,
                        double newSpeed,
                        int newAgility) {
        super.powerUp(newStamina / 2, 4 * newSpeed, newAgility);
    }

    // Generate an instance of type 'Warg'
    public static Warg generate() {
        return new Warg(Utils.genRandomDouble(MAX_VALUE), Utils.genRandomDouble(MAX_VALUE),
                Utils.genRandomInt(MAX_VALUE), WARG_NICKNAMES.get(Utils.genRandomInt(WARG_NICKNAMES.size())),
                Utils.genRandomLong(MAX_VALUE), Utils.genRandomDouble(MAX_VALUE));
    }

    @Override
    public String toString() {
        return super.toString() + "\nBite Power: " + getBitePower();
    }
}