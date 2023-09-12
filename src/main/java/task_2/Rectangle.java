package task_2;

import task_2.iface.HasMetrics;

public class Rectangle extends ColoredFigure {

    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
        initMetrics(width, length);
    }

    public Rectangle(int width, int length, Color backgroundColor, Color borderColor) {
        super(backgroundColor, borderColor);
        this.width = width;
        this.length = length;
    }

    private void initMetrics(int width, int length) {
        perimeter = HasMetrics.getPerimeter(width, length);
        area = getArea();
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
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
