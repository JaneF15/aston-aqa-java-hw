package task_2;

import task_2.iface.HasMetrics;

public class Circle extends ColoredFigure {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
        initMetrics(radius);
    }

    public Circle(int radius, Color backgroundColor, Color borderColor) {
        super(backgroundColor, borderColor);
        this.radius = radius;
        initMetrics(radius);
    }

    private void initMetrics(int radius) {
        perimeter = HasMetrics.getPerimeter(radius);
        area = getArea();
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
        return "[ " + perimeter +
                ", " + area +
                ", " + backgroundColor +
                ", " + borderColor +
                " ]";
    }
}
