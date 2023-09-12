package task_2;

import task_2.iface.HasMetrics;

public class Rectangle extends ColoredFigure implements HasMetrics {

    private int width;
    private int length;

    public Rectangle(int width, int length) {
        super();
        this.width = width;
        this.length = length;
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
        return "[ " + HasMetrics.getPerimeter(width, length) +
                ", " + getArea() +
                ", " + getBackgroundColor() +
                ", " + getBorderColor() +
                " ]";
    }
}
