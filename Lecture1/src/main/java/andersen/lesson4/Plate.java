package andersen.lesson4;

public class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood (int n) {
        food -= n;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    void increaseFood() {
        this.food += 1000;
        System.out.println("Added food to the bowl");
    }

    boolean checkFood(int n) {
        return (food - n) >= 0;
    }
}
