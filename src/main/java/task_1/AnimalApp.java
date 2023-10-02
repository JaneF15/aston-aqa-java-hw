package task_1;

public class AnimalApp {

    public static void main(String[] args) {
        Cat[] cats = new Cat[5];

        cats[0] = new Cat("Барсик");
        cats[1] = new Cat("Рыжик");
        cats[2] = new Cat("Снежок");
        cats[3] = new Cat("Мурзик");
        cats[4] = new Cat("Филя");
        System.out.println("Создано кошек: " + Cat.getCountCat());

        cats[3].run(200);
        cats[4].swim(1);

        Plate plate = new Plate(33);

        int food = 8;
        for (Cat cat : cats) {
            cat.eat(food++, plate);
            System.out.println(cat.isSatiety());
        }

        System.out.println("В тарелке осталось " + plate.getFood() + " еды.");
        System.out.println("----------------------------------------------------");

        Dog bobik = new Dog("Бобик");
        Dog rich = new Dog("Рич");
        System.out.println("Создано собак: " + Dog.getCountDog());

        bobik.run(600);
        rich.swim(4);

        System.out.println("----------------------------------------------------");
        System.out.println("Создано животных: " + Dog.getCountAnimal());
    }

}
