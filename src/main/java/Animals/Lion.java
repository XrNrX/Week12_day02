package Animals;

public class Lion extends Animal implements ICanMakeNoise, IHungry{


    public Lion(String name, int hunger) {
        super(name, hunger);
    }

    public String makeNoise(String noise){
        return "I am the King of the Jungle and I say " + noise;
    }

    public boolean isHungry(Animal animal){
        if(animal.getHunger() > 5){
            return true;
        } else {
            return false;
        }
    }
}

