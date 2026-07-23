/**
 * Circle class that extends from GeometricObject
 *
 * @author Nastia Kotliar
 * @since 7.20.2026
 **/

//I learned from Chatty that java.lang.* imports automatically, but I didn't know this before, so here it is :)
import java.lang.Math;

public class Circle extends GeometricObject {

    private final double radius;

    /**
     * Default constructor
     *
     * @param radius radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * No-arg constructor
     */
    public Circle() {
        this(1.0);
    }

    /**
     * Calculate perimeter (circumference?) of the circle
     *
     * @return perimeter
     */
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    /**
     * Calculates area of the circle
     *
     * @return area
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Simple getter for radius
     *
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Overridden toString method to show circle's parameters
     *
     * @return String
     */
    @Override
    public String toString() {
        return String.format("This circle has a radius of %.2f,\ta circumference of %.2f,\tand an area of %.2f.", radius, getPerimeter(), getArea());
    }
}
