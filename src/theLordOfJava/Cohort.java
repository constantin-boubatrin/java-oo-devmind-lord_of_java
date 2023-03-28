package theLordOfJava;

import java.util.*;

/** Generic container for 'Creature' elements. */

public class Cohort<C extends Creature> {
    /** FIELDS */
    private final Map<String, C> citizens = new LinkedHashMap<>();

    /** METHODS */
    // Add a new 'Creature' to the horde, i.e. a new creature at a certain address
    public void addNewCitizen(String address, C creature) {
        citizens.put(address, creature);
    }

    // The method is responsible for preparing the horde for the duel
    // Return a sorted vector containing all the creatures
    // of that horde in ascending order
    public ArrayList<C> getAllCitizensToFight() {
        ArrayList<C> allAligned = new ArrayList<>(citizens.values());
        Collections.sort(allAligned);
        return allAligned;
    }

    // Return the 'Creature' at the specified address
    public C getCitizenAt(String address) {
        return citizens.get(address);
    }

    // Return the total number of creatures in the horde
    public int size() {
        return this.citizens.size();
    }

    // Return 'true' if the container is empty, 'false' otherwise
    public boolean isEmpty() {
        return citizens.isEmpty();
    }

    @Override
    public String toString() {
        ArrayList<C> citizensAligned = getAllCitizensToFight();
        StringBuilder ret = new StringBuilder();
        for (C creature: citizensAligned) {
            ret.append(creature).append("\n");
        }
        return ret.toString();
    }
}