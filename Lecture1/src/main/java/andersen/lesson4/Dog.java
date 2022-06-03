package andersen.lesson4;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void runDistance(int distance) {
        if ((distance >= 0) && (distance <= 500))
            super.runDistance(distance);
        else {
            System.out.println(this.name + " can not run: " + distance + " m");
        }
    }
    @Override
    public void swimDistance(int distance) {
        if ((distance >= 0) && (distance <= 10))
            super.swimDistance(distance);
        else {
            System.out.println(this.name + " can not swim: " + distance + " m");
        }
    }
}
