package task_1;

public class Plate {

    private int food;

    public Plate(int eat) {
        this.food = eat;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = Math.max(this.food + food, 0);
    }
}
