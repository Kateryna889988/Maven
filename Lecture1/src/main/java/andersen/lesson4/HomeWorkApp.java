package andersen.lesson4;


public class HomeWorkApp {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Mark");
        animal1.runDistance(150);
        animal1.swimDistance(150);


        Cat cat = new Cat("Tom");
        cat.runDistance(300);
        cat.swimDistance(0);


        Dog dog = new Dog("Jack");
        dog.runDistance(501);
        dog.swimDistance(11);

        Animal[] animals = new Animal[6];
        animals[0] = new Cat("Oliver");
        animals[1] = new Cat("Jack");
        animals[2] = new Cat("Harry");
        animals[3] = new Dog("Jacob");
        animals[4] = new Dog("Charley");
        animals[5] = new Dog("Thomas");

        int sumDogs = 0;
        int sumCats = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].getClass().getSimpleName().equals("Dog")) {
                sumDogs++;
            }

            if (animals[i].getClass().getSimpleName().equals("Cat")) {
                sumCats++;
            }
        }

        System.out.println("Dogs count - " + sumDogs);
        System.out.println("Cats count - " + sumCats);

        Plate plate = new Plate(50);
        Cat oliver = new Cat("Oliver", 10);
        oliver.eat(plate);

        plate.info();

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Alex", 5);
        cats[1] = new Cat("Barney", 5);
        cats[2] = new Cat("Bruno", 5);

        Plate plateForCats = new Plate(5);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plateForCats);
            cats[i].printSatiety();
        }
    }
}



