package task_2.iface;

public interface HasMetrics {

    double getArea();

    static double getPerimeter(int... measurements) {
        if (measurements.length == 1) {
            return 2 * Math.PI * measurements[0];
        }

        int perimeter = 0;
        for (int m : measurements) {
            perimeter += m;
        }

        if (measurements.length == 2) {
            return 2 * perimeter;
        }

        return perimeter;
    }

}
