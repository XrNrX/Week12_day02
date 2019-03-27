package Animals;

public class Monkey extends Animal{


    public Monkey(String name, int hunger) {
        super(name, hunger);
    }

    public String makeNoise(){
        return "I Love Banana's!!!";
    }

    public boolean isHungry(Animal animal){
        if(animal.getHunger() > 5){
            return true;
        } else {
            return false;
        }
    }
}
