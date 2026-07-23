/**
 * @author Nastia Kotliar
 * @since 7.20.2026
 **/

public class OctagonTester {

    public static void main(String[] args) {
        // Creating an octagon
        Octagon octagon = new Octagon(5.0);

        //Cleans screen
        System.out.println("\033[H\033[2J");

        //Prints the octacon data
        System.out.println(octagon);
        System.out.println();

        //Loads thinking animation
        try {
            WaitingAnimation.think();
        } catch (InterruptedException e) {
            System.out.println("It happens.");
        }

        //Clones octagon
        Octagon octagonClone = (Octagon)octagon.clone();

        //Comparing two octagons
        System.out.println(octagon.compareTo(octagonClone) != 0 ? "Cloning went wrong..." : "They're equal!" );
    }
}

/*
Output sample:

This octagon has a side of 5,00,        a perimeter of 40,00,   and an area of 191,42.


Thinking...

     /\_/\   z
    ( -.- ) z
    > ^ <




Thinking.....

     /\_/\  zZ
    ( -.- )
    > ^ <




Thinking...

     /\_/\   z
    ( -.- ) z
    > ^ <




Thinking.....

     /\_/\  zZ
    ( -.- )
    > ^ <




Thinking...

     /\_/\   z
    ( -.- ) z
    > ^ <




Thinking.....

     /\_/\  zZ
    ( -.- )
    > ^ <




Thinking...

     /\_/\   z
    ( -.- ) z
    > ^ <




Thinking.....

     /\_/\  zZ
    ( -.- )
    > ^ <




Thinking...

     /\_/\   z
    ( -.- ) z
    > ^ <




Thinking.....

     /\_/\  zZ
    ( -.- )
    > ^ <




Done!

     /\_/\~~
    ( *.* )
    > ^ <


They're equal!
 */