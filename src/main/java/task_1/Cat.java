package task_1;

import org.jetbrains.annotations.NotNull;
import task_1.iface.Eatable;

public class Cat extends Animal implements Eatable {

    private boolean satiety;
    private static int countCat = 0;

    public Cat(String name) {
        super(name);

        satiety = false;

        maxRunningDistance = 200;
        maxSwimmingDistance = 0;

        countCat++;
    }

    public static int getCountCat() {
        return countCat;
    }

    public boolean isSatiety() {
        return satiety;
    }

    @Override
    public void run(int obstacleLength) {
        if (obstacleLength <= maxRunningDistance) {
            super.run(obstacleLength);
        } else {
            System.out.println(name + " не умеет бегать на дистанцию более " + maxRunningDistance + " м.");
        }
    }

    @Override
    public void swim(int obstacleLength) {
        if (obstacleLength <= maxSwimmingDistance) {
            super.run(obstacleLength);
        } else {
            System.out.println(name + " не умеет плавать");
        }
    }

    @Override
    public void eat(int food, @NotNull Plate plate) {
        if (plate.getFood() < food) {
            return;
        }
        plate.setFood(-food);
        satiety = true;
    }
}
