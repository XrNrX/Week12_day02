package Animals;


import Zoo.Zoo;

public abstract class Animal extends Zoo {

    private String name;
    private int hunger;

    public Animal(String name, int hunger) {
        this.name = name;
        this.hunger = hunger;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }
}
