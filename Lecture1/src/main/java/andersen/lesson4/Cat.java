package andersen.lesson4;

public class Cat extends Animal {

    private int appetite;
    private Boolean satiety;
    public Cat(String name, int appetite) {
        super(name);

        this.appetite = appetite;
        this.satiety = Boolean.FALSE;
    }

    public Cat(String name) {
        super(name);

        this.satiety = Boolean.FALSE;
        this.appetite = 15;
    }


    @Override
    public void runDistance(int distance) {
        if ((distance >= 0) && (distance <= 200))
            super.runDistance(distance);
        else {
            System.out.println(this.name + " can not run: " + distance + " m");
        }
    }

    @Override
    public void swimDistance(int distance) {
        System.out.println(this.name + " can not swim");
    }

    public int getAppetite() {
        return appetite;
    }

    @Override
    public void eat(Plate plate) {
        if(plate.checkFood(appetite)){
            plate.decreaseFood(appetite);
            satiety = true;
            System.out.println(this.name + " eaten");
            return;
        }

        System.out.println(this.name + " not enough food");
    }

    public void printSatiety() {
        if (satiety) {
            System.out.println(this.name + " sati");
        } else {
            System.out.println(this.name + " not sati");
        }
    }
}

