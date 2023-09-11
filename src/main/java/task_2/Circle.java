package task_2;

import task_2.iface.HasMetrics;

public class Circle implements HasMetrics {

    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

}
