package andersen.lesson4;

public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void runDistance(int distance) {
        System.out.println(this.name + " run " + distance + "m");
    }

    public void swimDistance(int distance) {
        System.out.println(this.name + " swim " + distance + "m");
    }

    public void eat(Plate plate){
        System.out.println();
    }
}





