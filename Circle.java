
package circle;


public class Circle {

    private Point center;
    private float radius;

    public Circle(Point center, float radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public float getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = center;

    }

    public void setRadius(float radius) {
        this.radius = radius;

    }

    public String toString() {

        return "radius: " + radius + " center: " + center;

    }


}
