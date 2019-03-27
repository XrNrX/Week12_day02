import Animals.Lion;
import Staff.Employee;
import Staff.GroundsKeeper;
import Zoo.Zoo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZooTest {

    Zoo zoo;
    Lion lion;
    GroundsKeeper groundskeeper;


    @Before
    public void setup(){
        zoo = new Zoo();
        lion = new Lion("Jimmy", 9);
        groundskeeper = new GroundsKeeper("Willie", 65, 20000);
    }

    @Test
    public void canCountAnimals() {
        zoo.addAnimal(lion);
        assertEquals(1, zoo.countAnimals());
    }

    @Test
    public void canCountEmployees() {
        zoo.addEmployee(groundskeeper);
        assertEquals(1, zoo.countEmployees());
    }
}
