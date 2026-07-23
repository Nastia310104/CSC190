/**
 * Rectangle class that extends from GeometricObject
 *
 * @author Nastia Kotliar
 * @since 7.20.2026
 **/

public class CompareObjectsTester {

    public static void main(String[] args) {
        //Creating objects to compare. Guess who generated random doubles :)
        Circle circle1 = new Circle(3.47);
        Circle circle2 = new Circle(8.12);
        Rectangle rectangle = new Rectangle(5.69, 2.94);

        //Cleans screen
        System.out.println("\033[H\033[2J");

        //Prints the circles and the rectangle data
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(rectangle);

        System.out.println();

        //Loads thinking animation
        try {
            WaitingAnimation.think();
        } catch (InterruptedException e) {
            System.out.println("It happens.");
        }

        //Comparing circles
        System.out.println(compareCircles(circle1, circle2));

        //Comparing circle and rectangle
        System.out.println(compareCircleAndRectangle(circle1, rectangle));
    }

    /**
     * Compares two circles
     *
     * @param circle1 First circle
     * @param circle2 Second circle
     * @return String which circle is bigger
     */
    public static String compareCircles(Circle circle1, Circle circle2) {
        int comparisonResult = circle1.compareTo(circle2);

        if (comparisonResult < 0) {
            return String.format("Circle with radius %.2f is bigger than circle with radius %.2f.", circle2.getRadius(), circle1.getRadius());
        } else if (comparisonResult == 0) {
            return "Circles are equal.";
        } else {
            return String.format("Circle with radius %.2f is bigger than circle with radius %.2f.", circle1.getRadius(), circle2.getRadius());
        }
    }

    /**
     * Compares a circle and a rectangle
     *
     * @param circle1 Circle to compare
     * @param rectangle Rectangle to compare
     * @return String is circle or rectangle bigger
     */
    public static String compareCircleAndRectangle(Circle circle1, Rectangle rectangle) {
        int comparisonResult = circle1.compareTo(rectangle);

        if (comparisonResult < 0) {
            return String.format("Rectangle with length %.2f and width %.2f is bigger than circle with radius %.2f.",
                    rectangle.getLength(), rectangle.getWidth(), circle1.getRadius());
        } else if (comparisonResult == 0) {
            return "Circle and rectangle have the same area.";
        } else {
            return String.format("Circle with radius %.2f is bigger than rectangle with length %.2f and width %.2f.",
                    circle1.getRadius(), rectangle.getLength(), rectangle.getWidth());
        }
    }
}

/*
Output sample:

This circle has a radius of 3,47,       a circumference of 21,80,       and an area of 37,83.
This circle has a radius of 8,12,       a circumference of 51,02,       and an area of 207,14.
This rectangle has a length of 5,69,    a width of 2,94,        a perimeter of 17,26,   and an area of 16,73.


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


Circle with radius 8,12 is bigger than circle with radius 3,47.
Circle with radius 3,47 is bigger than rectangle with length 5,69 and width 2,94.
 */