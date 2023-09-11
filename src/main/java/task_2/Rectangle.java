package task_2;

import task_2.iface.HasMetrics;

public class Rectangle implements HasMetrics {

    public int width;
    public int length;


    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
