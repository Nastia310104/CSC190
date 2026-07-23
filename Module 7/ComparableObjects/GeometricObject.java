/**
 * Abstract parent class for geometric objects, such as circles, rectangles, octagons, etc.
 *
 * @author Nastia Kotliar
 * @since 7.20.2026
 **/

import java.lang.Comparable;

/**
 * Abstract class implements Comparable interface
 */
public abstract class GeometricObject implements Comparable<GeometricObject>{

    /**
     * Protected no-arg constructor
     */
    protected GeometricObject() {}

    /**
     * Compares two objects' area
     *
     * @param object The GeometricObject type to compare to caller
     * @return int
     * **negative** if caller has smaller area
     * **zero** if caller has the same area as comparing object
     * **positive** if caller has bigger area
     */
    @Override
    public int compareTo(GeometricObject object) {
        //It seems like there is Double.compare() method, but I didn't know about it, so I'll use my if-else
        if(this.getArea() < object.getArea()) {
            return -1;
        } else if (this.getArea() == object.getArea()) {
            return 0;
        } else {
            return 1;
        }
    }

    public abstract String toString();

    public abstract double getArea();

    public abstract double getPerimeter();
}