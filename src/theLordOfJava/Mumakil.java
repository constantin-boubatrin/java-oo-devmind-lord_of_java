package theLordOfJava;

import java.util.ArrayList;
import java.util.List;

/** The 'Mumakil' class details a species of giant animals, which, although slow,
  * have a special capacity for strategic organization both in defense and
  * in organizing attack strategies. */

public class Mumakil extends Creature {
    /** FIELDS */
    private static final List<String> MUMAKIL_NICKNAMES = new ArrayList<>(
            List.of("Green Oliphaunt", "Gold Oliphaunt", "Red Oliphaunt"));
    private static final int MAX_VALUE = 1000;

    /** CONSTRUCTORS */
    Mumakil(double stamina, double speed, int agility, String nickname, long score) {
        super(stamina, speed, agility, nickname, score);
    }

    /** METHODS */
    // Update the Mumakil's abilities
    @Override
    public void powerUp(double newStamina,
                        double newSpeed,
                        int newAgility) {
        super.powerUp(newStamina * .75, newSpeed + 10, newAgility);
    }

    // Generate an instance of type 'Mumakil'
    public static Mumakil generate() {
        return new Mumakil(Utils.genRandomDouble(MAX_VALUE), Utils.genRandomDouble(MAX_VALUE),
                Utils.genRandomInt(MAX_VALUE), MUMAKIL_NICKNAMES.get(Utils.genRandomInt(MUMAKIL_NICKNAMES.size())),
                Utils.genRandomLong(MAX_VALUE));
    }

    @Override
    public String toString() {
        return super.toString() + "\nA creature of type Mumak-il.";
    }
}