/**
 * Octagon class that extends from GeometricObject
 *
 * @author Nastia Kotliar
 * @since 7.20.2026
 **/

public class Octagon extends GeometricObject {

    private double side;

    /**
     * Default constructor
     *
     * @param radius side of the octagon
     */
    public Octagon(double side) {
        this.side = side;
    }

    /**
     * No-arg constructor
     */
    public Octagon() {
        this(0.0);
    }

    /**
     * Calculate perimeter of the octagon
     *
     * @return perimeter
     */
    public double getPerimeter() {
        return 8 * side;
    }

    /**
     * Calculates area of the octagon
     *
     * @return area
     */
    public double getArea() {
        return (2 + 4 * Math.sqrt(2)) * side * side;
    }

    /**
     * Simple getter for radius
     *
     * @return radius
     */
    public double getSide() {
        return side;
    }

    private void setSide(double side) {
        this.side = side;
    }

    /**
     * Overridden toString method to show octagon's parameters
     *
     * @return String
     */
    @Override
    public String toString() {
        return String.format("This octagon has a side of %.2f,\ta perimeter of %.2f,\tand an area of %.2f.", side, getPerimeter(), getArea());
    }
}
