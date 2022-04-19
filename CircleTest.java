package circle;

import java.util.Random;
import java.util.Scanner;

public class CircleTest {

    public static void main(String[] args) {

        Random random = new Random();

        int randX = random.nextInt(10) + 1;
        int randY = random.nextInt(10) + 1;

        Point point1 = new Point(randX, randY);
        Point point2 = new Point(0, 0);

        Scanner scan = new Scanner(System.in);
        float radius;
        System.out.println("Point 2 radius: ");
        radius = scan.nextFloat();

        Circle circle1 = new Circle(point2, radius);
        Circle circle2 = new Circle(point1, 5.5f);

        double distance = circle1.getCenter().distance(circle2.getCenter());
        System.out.println("Circle1: " + circle1);
        System.out.println("Circle2: " + circle2);
        System.out.println("distance: " + distance);

    }

}
