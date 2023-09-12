package task_2;

import task_2.iface.HasMetrics;

abstract public class Figure implements HasMetrics {

    protected double perimeter;
    protected double area;

    public Figure() {
    }

    public Figure(double perimeter, double area) {
        this.perimeter = perimeter;
        this.area = area;
    }

    abstract public double getArea();

}
