package Animals;
import Animals.Animal;

public class Giraffe extends Animal implements ICanMakeNoise , IHungry{


    public Giraffe(String name, int hunger) {
        super(name, hunger);
    }

    public String makeNoise(String noise){
        return noise;
    }

    public boolean isHungry(Animal animal){
        if(animal.getHunger() > 5){
            return true;
        } else {
            return false;
        }
    }

}
