package andersen.lesson5;

public class Fruit implements Comparable {
    private String name;
    private float weight;

    public Fruit(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public float getWeight () {
        return weight;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Fruit){
            Fruit fruit = (Fruit)o;
            if(fruit.name == name && fruit.weight == weight){
                return 0;
            }
        }

        return -1;
    }
}

