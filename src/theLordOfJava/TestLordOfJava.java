package theLordOfJava;

public class TestLordOfJava {

    public void run() {
        // Let's start the game by creating and initializing
        // an instance that models the mystical world
        LordOfJava loj = new LordOfJava(
                "MacOS ",
                "C://Users/Devmind/Applications/The-Lord-of-Java.app",
                "df56df76sdf689889dfs79sfd8fsd98.md5sum",
                5);

        // Let's display the data about the mystical world
        System.out.print(loj);

        // Let's create some instances of the 'Dragon' type
        Dragon dragon1 = Dragon.generate();
        Dragon dragon2 = Dragon.generate();
        Dragon dragon3 = Dragon.generate();

        // Let's create some instances of the 'Warg' type
        Warg warg1 = Warg.generate();
        Warg warg2 = Warg.generate();
        Warg warg3 = Warg.generate();

        // Let's create some instances of the 'Mumakil' type
        Mumakil mumakil1 = Mumakil.generate();
        Mumakil mumakil2 = Mumakil.generate();
        Mumakil mumakil3 = Mumakil.generate();

        // Let's add all the creatures to the mystical world
        loj.addCreature(dragon1, "1");
        loj.addCreature(dragon2, "2");
        loj.addCreature(dragon3, "3");
        loj.addCreature(warg1, "11");
        loj.addCreature(warg2, "22");
        loj.addCreature(warg3, "33");
        loj.addCreature(mumakil1, "111");
        loj.addCreature(mumakil2, "222");
        loj.addCreature(mumakil3, "333");

        // Let's display the updated data about the mystical world
        System.out.println(loj);

        // Let's test some methods from 'Dragon' class
        System.out.println(dragon1.getFlamesPower());
        System.out.println(dragon2.getFlyingSpeed());
        dragon3.powerUp(10.5, 5.5, 15);
        System.out.println();

        // Let's initiate some battles between the creatures of the mystical world
        int battleScoreDM = loj.battleDragonsVSMumakils();
        int battleScoreDW = loj.battleDragonsVSWargs();
        int battleScoreWM = loj.battleWargsVSMumakils();

        // Let's print the results of the battles
        System.out.println("The battle between Dragons and Mumakils: " + battleScoreDM);
        System.out.println("The battle between Dragons and Wargs: " + battleScoreDW);
        System.out.println("The battle between Wargs and Mumakils: " + battleScoreWM);
    }

    /** DRIVER CODE */
    public static void main(String[] args) {
        System.out.println("<<< The World of Supernatural Creatures >>>");

        // create and run an instance (for test purpose)
        new TestLordOfJava().run();
    }
}