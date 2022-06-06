package andersen.lesson5;

import java.util.ArrayList;

public class HomeWorkApp {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[4];
        fruits[0] = new Fruit("1", 1.1f);
        fruits[1] = new Fruit("2", 1.1f);
        fruits[2] = new Fruit("3", 1.1f);
        fruits[3] = new Fruit("4", 1.1f);

        int n = fruits.length;
        Fruit temp;

        for (int i = 0; i < n / 2; i++) {
            temp = fruits[n - i - 1];
            fruits[n - i - 1] = fruits[i];
            fruits[i] = temp;
        }
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i].getName());
        }

        ArrayList<Apple> apples = new ArrayList<Apple>();

        apples.add(new Apple("Apple1"));
        apples.add(new Apple("Apple2"));
        apples.add(new Apple("Apple3"));
        apples.add(new Apple("Apple4"));

        ArrayList<Apple> redApples = new ArrayList<Apple>();
        redApples.add(new Apple("Apple1"));
        redApples.add(new Apple("Apple2"));
        redApples.add(new Apple("Apple3"));
        redApples.add(new Apple("Apple4"));

        ArrayList<Orange> oranges = new ArrayList<Orange>();
        oranges.add(new Orange("Orange1"));
        oranges.add(new Orange("Orange2"));
        oranges.add(new Orange("Orange3"));
        oranges.add(new Orange("Orange4"));

        Box<Apple> appleBox = new Box<>(apples);
        Box<Apple> redAppleBox = new Box<>(redApples);


        Box<Orange> orangeBox = new Box<>(oranges);

        System.out.println("Apple box weight:" + appleBox.getWeight());
        System.out.println("Orange box weight:" + orangeBox.getWeight());

        appleBox.compare(redAppleBox);
        appleBox.compare(orangeBox);

        System.out.println("Apple box compare red Apple box is " +  appleBox.compare(redAppleBox));
        System.out.println("Orange box compare Orange box is:" +  appleBox.compare(orangeBox));
    }
}

