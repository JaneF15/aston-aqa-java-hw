package task_2;

import task_2.iface.HasMetrics;

public class FigureApp {

    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(4, 5);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(triangle);

    }
}
