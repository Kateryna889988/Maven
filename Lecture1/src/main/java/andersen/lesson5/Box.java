package andersen.lesson5;

import java.util.ArrayList;
import java.util.Collections;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;


    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;

    }

    public ArrayList<T> getFruits() {
        return fruits;
    }


    public void addFruits(ArrayList<T> fruitsToAdd) {
        fruits.addAll(fruitsToAdd);
        Collections.sort(fruits);
    }

    public float getWeight() {
        float weight = 0.0f;
        for (int i = 0; i < fruits.size(); i++) {
          weight += fruits.get(i).getWeight();
        }
        return weight;
    }

    public boolean compare(Box boxToCompare) {

        ArrayList fruitsToCompare = boxToCompare.getFruits();
        Collections.sort(fruits);
        Collections.sort(fruitsToCompare);

        return fruits.equals(fruitsToCompare);
    }

    public void sprinkleTo(Box<T> box) {
        box.addFruits(fruits);
        fruits = new ArrayList<>();
    }
}


