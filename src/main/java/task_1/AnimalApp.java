package task_1;

public class AnimalApp {

    public static void main(String[] args) {
        Cat[] cats = new Cat[5];

        cats[0] = new Cat("Барсик");
        cats[1] = new Cat("Рыжик");
        cats[2] = new Cat("Снежок");
        cats[3] = new Cat("Мурзик");
        cats[4] = new Cat("Филя");

        Plate plate = new Plate(33);

        int food = 8;
        for (Cat cat : cats) {
            cat.eat(food++, plate);
            System.out.println(cat.isSatiety());
        }

        System.out.println("В тарелке осталось " + plate.getFood() + " еды.");
    }

}
