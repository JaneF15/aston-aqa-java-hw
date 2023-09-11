package task_1;

public class Dog extends Animal {

    private static int countDog = 0;

    public Dog(String name) {
        super(name);
        maxRunningDistance = 500;
        maxSwimmingDistance = 10;

        countDog++;
    }

    public static int getCountDog() {
        return countDog;
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
            super.swim(obstacleLength);
        } else {
            System.out.println(name + " не умеет плавать на дистанцию более " + maxSwimmingDistance + " м.");
        }

    }
}
