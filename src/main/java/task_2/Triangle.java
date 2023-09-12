package task_2;

import task_2.iface.HasMetrics;

public class Triangle extends ColoredFigure {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        initMetrics(a, b, c);
    }

    public Triangle(int a, int b, int c, Color backgroundColor, Color borderColor) {
        super(backgroundColor, borderColor);
        this.a = a;
        this.b = b;
        this.c = c;
        initMetrics(a, b, c);
    }

    private void initMetrics(int a, int b, int c) {
        perimeter = HasMetrics.getPerimeter(a, b, c);
        area = getArea();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public double getArea() {
        double p = HasMetrics.getPerimeter(a, b, c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
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
