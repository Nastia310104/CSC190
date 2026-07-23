/**
 * Rectangle class that extends from GeometricObject
 *
 * @author Nastia Kotliar
 * @since 7.20.2026
 **/

public class Rectangle extends GeometricObject {

    //I learned private and getter-only data fields can be described as finals
    private final double length;
    private final double width;

    /**
     * Default constructor
     *
     * @param length length of the rectangle
     * @param width width of the rectangle
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * No-arg constructor
     */
    public Rectangle() {
        this(1.0, 1.0);
    }

    /**
     * Calculates rectangle's perimeter
     *
     * @return perimeter
     */
    public double getPerimeter() {
        return 2 * (length + width);
    }

    /**
     * Calculates rectangle's area
     *
     * @return area
     */
    public double getArea() {
        return length * width;
    }

    /**
     * Simple length getter
     *
     * @return length
     */
    public double getLength() {
        return length;
    }

    /**
     * Simple width getter
     *
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Overridden toString method to show rectangle's parameters
     * 
     * @return description
     */
    @Override
    public String toString() {
        return String.format("This rectangle has a length of %.2f,\ta width of %.2f, \ta perimeter of %.2f, \tand an area of %.2f.", length, width, getPerimeter(), getArea());
    }
}