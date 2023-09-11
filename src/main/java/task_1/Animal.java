package task_1;

public class Animal implements Runnable, Swimmable {

    protected String name;
    protected int maxRunningDistance;
    protected int maxSwimmingDistance;
    private static int countAnimal = 0;

    public Animal(String name) {
        this.name = name;
        countAnimal++;
    }

    public static int getCountAnimal() {
        return countAnimal;
    }

    @Override
    public void run(int obstacleLength) {
        System.out.println(name + " пробежал " + obstacleLength + " м.");
    }

    @Override
    public void swim(int obstacleLength) {
        System.out.println(name + " проплыл " + obstacleLength + " м.");
    }
}
