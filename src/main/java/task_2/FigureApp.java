package task_2;

import task_2.iface.HasMetrics;

public class FigureApp {

    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(4, 5);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println(HasMetrics.getPerimeter(circle.radius));
        System.out.println(HasMetrics.getPerimeter(rectangle.width, rectangle.length));
        System.out.println(HasMetrics.getPerimeter(triangle.a, triangle.b, triangle.c));
        System.out.println("--------------------------------------------------------");
        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());
        System.out.println(triangle.getArea());

    }
}
