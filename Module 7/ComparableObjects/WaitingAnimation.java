/**
 * @author Nastia Kotliar
 * @since 7.20.2026
 **/

/**
 * Plushka is the name of my cat
 */
public final class WaitingAnimation {

    private static final String PLUSHKA_1 = """
                                    \s
               Thinking...
                                    \s
                    /\\_/\\   z
                   ( -.- ) z
                    > ^ <
                                    \s
                                    \s
               """;

    private static final String PLUSHKA_2 = """
                                    \s
                Thinking.....
                                    \s
                     /\\_/\\  zZ
                    ( -.- )
                     > ^ <
                                    \s
                                    \s
                """;

    private static final String PLUSHKA_DONE = """
                                    \s
                Done!
                                    \s
                     /\\_/\\~~
                    ( *.* )
                     > ^ <
                                    \s
                """;

    private static final int SLEEPING_TIME = 250;

    /**
     * Prints cute waiting animation
     *
     * @throws InterruptedException Don't interrupt thread's sleep!
     */
    public static void think() throws InterruptedException {
        int position = 0;
        int waitingTime = 10;

        //Lets user read beginning intro
        Thread.sleep(SLEEPING_TIME * 4);

        //Printing only while time's left
        while (waitingTime != 0) {
            //Cleans screen
            System.out.println("\033[H\033[2J");

            //Choosing image to print
            if (position % 2 == 0) {
                System.out.println(PLUSHKA_1);
            } else {
                System.out.println(PLUSHKA_2);
            }

            //Waitiiiing...
            Thread.sleep(SLEEPING_TIME);

            position++;
            waitingTime--;
        }

        //Cleans screen one more time and prints final animation
        System.out.println("\033[H\033[2J");
        System.out.println(PLUSHKA_DONE);
    }
}
