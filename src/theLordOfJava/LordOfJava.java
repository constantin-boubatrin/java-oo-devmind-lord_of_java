package theLordOfJava;

import java.util.ArrayList;

/** The 'LordOfJava' class represents the main class that shapes the mystical world */

public class LordOfJava {
    /** FIELDS */
    private final Parameters parameters;
    private final Cohort<Dragon> dragons = new Cohort<>();
    private final Cohort<Warg> wargs = new Cohort<>();
    private final Cohort<Mumakil> mumakils = new Cohort<>();

    /** CONSTRUCTORS */
    public LordOfJava(String OS, String gamePATH, String credentials, int noLives) {
        this.parameters = new Parameters(OS, gamePATH, credentials, noLives);
    }

    /** METHODS */
    // Add a new creature to the specific horde
    public void addCreature(Creature creature, String address) {
        if (creature instanceof Dragon) {
            dragons.addNewCitizen(address, (Dragon) creature);
        } else if (creature instanceof Warg) {
            wargs.addNewCitizen(address, (Warg) creature);
        } else if (creature instanceof Mumakil) {
            mumakils.addNewCitizen(address, (Mumakil) creature);
        } else {
            throw new IllegalArgumentException(
                    "Creature type unknown: " + creature.getClass().getName());
        }
    }

    // The final score of the battle is given by the sum of all duels.
    // Intuitively, the sign of the result will indicate the winning horde
    // and the value in mode will represent the magnitude of the victory
    // (i.e. a larger value will represent a landslide victory).
    public int battleDragonsVSWargs() {
        if (dragons.size() < wargs.size()) {
            return -1;
        }
        if (dragons.size() > wargs.size()) {
            return 1;
        }

        ArrayList<Dragon> dragonsToFight = dragons.getAllCitizensToFight();
        ArrayList<Warg> wargsToFight = wargs.getAllCitizensToFight();
        int score = 0;
        for (int i = 0; i < wargs.size(); i++) {
            int duelResult = dragonsToFight.get(i).compareTo(wargsToFight.get(i));
            score += duelResult > 0 ? +1 : duelResult < 0 ? -1 : 0;
        }
        return score;
    }

    public int battleDragonsVSMumakils() {
        if (dragons.size() < mumakils.size()) {
            return -1;
        }
        if (dragons.size() > mumakils.size()) {
            return 1;
        }

        ArrayList<Dragon> dragonsToFight = dragons.getAllCitizensToFight();
        ArrayList<Mumakil> mumakilsToFight = mumakils.getAllCitizensToFight();
        int score = 0;
        for (int i = 0; i < mumakils.size(); i++) {
            int duelResult = dragonsToFight.get(i).compareTo(mumakilsToFight.get(i));
            score += duelResult > 0 ? +1 : duelResult < 0 ? -1 : 0;
        }
        return score;
    }

    public int battleWargsVSMumakils() {
        if (wargs.size() < mumakils.size()) {
            return -1;
        }
        if (wargs.size() > mumakils.size()) {
            return 1;
        }

        ArrayList<Warg> wargsToFight = wargs.getAllCitizensToFight();
        ArrayList<Mumakil> mumakilsToFight = mumakils.getAllCitizensToFight();
        int score = 0;
        for (int i = 0; i < mumakils.size(); i++) {
            int duelResult = wargsToFight.get(i).compareTo(mumakilsToFight.get(i));
            score += duelResult > 0 ? +1 : duelResult < 0 ? -1 : 0;
        }
        return score;
    }

    @Override
    public String toString() {
        return "" + parameters + "\n" + dragons + "\n" + wargs + "\n" + mumakils;
    }
}