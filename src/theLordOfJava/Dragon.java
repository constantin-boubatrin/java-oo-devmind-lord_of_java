package theLordOfJava;

import java.util.ArrayList;
import java.util.List;

/** The 'Dragon' class details fantastic creatures that can fly and throw flames. */

public class Dragon extends Creature implements IBurn {
    /** FIELDS */
    private static final List<String> DRAGON_NICKNAMES = new ArrayList<>(
            List.of("Earth Dragon", "Divine Dragon", "Coiled Dragon",
                    "Devdragonozaurus", "Javasorobaurus", "Classiscomoros"));
    private static final int MAX_VALUE = 1000;
    private final double flamesPower; // The power of thrown flames, in the duel
    private final int flySpeed; // Flight speed, expressed in kilometers per minute

    /** CONSTRUCTORS */
    Dragon(double stamina, double speed, int agility, String nickname,
           long score, double flamesPower, int flySpeed) {
        super(stamina, speed, agility, nickname, score);
        this.flamesPower = flamesPower;
        this.flySpeed = flySpeed;
    }

    /** METHODS */
    @Override
    public double getFlamesPower() {
        return this.flamesPower;
    }

    @Override
    public int getFlyingSpeed() {
        return this.flySpeed;
    }

    // Update the Dragon's abilities
    @Override
    public void powerUp(double newStamina,
                        double newSpeed,
                        int newAgility) {
        super.powerUp(newStamina * 2, newSpeed / 2, newAgility * 3);
    }

    // Generate an instance of type 'Dragon'
    public static Dragon generate(){
        return new Dragon(Utils.genRandomDouble(MAX_VALUE), Utils.genRandomDouble(MAX_VALUE),
                Utils.genRandomInt(MAX_VALUE), DRAGON_NICKNAMES.get(Utils.genRandomInt(DRAGON_NICKNAMES.size())),
                Utils.genRandomLong(MAX_VALUE), Utils.genRandomDouble(MAX_VALUE), Utils.genRandomInt(MAX_VALUE));
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nFlames power: " + getFlamesPower() +
                "\nFly speed: " + getFlyingSpeed();
    }
}