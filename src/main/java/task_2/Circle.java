package task_2;

import task_2.iface.HasMetrics;

public class Circle extends ColoredFigure implements HasMetrics {

    private int radius;

    public Circle(int radius) {
        super(Color.BLUE, Color.RED);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "[ " + HasMetrics.getPerimeter(radius) +
                ", " + getArea() +
                ", " + getBackgroundColor() +
                ", " + getBorderColor() +
                " ]";
    }
}
