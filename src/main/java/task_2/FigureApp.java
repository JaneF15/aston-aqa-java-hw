package task_2;

public class FigureApp {

    public static void main(String[] args) {

        Circle circle = new Circle(3, Color.YELLOW, Color.GREEN);
        Rectangle rectangle = new Rectangle(4, 5);
        Triangle triangle = new Triangle(3, 4, 5, Color.BLUE, Color.RED);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(triangle);

    }
}
