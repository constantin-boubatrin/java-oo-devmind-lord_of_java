package main;

import java.util.Random;

public final class Utils {
    // Random is used to generate a stream of pseudorandom numbers
    private static final Random random = new Random();

    // Returns a random number between [0, max]
    public static int genRandomInt(int max){
        return random.nextInt(max);
    }

    // Returns a random number between [0, max]
    public static double genRandomDouble(int max){
        return random.nextDouble(max);
    }

    // Returns a random number between [0, max]
    public static long genRandomLong(int max){
        return random.nextLong(max);
    }
}
