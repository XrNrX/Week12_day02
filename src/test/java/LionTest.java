import Animals.Lion;
import Staff.GroundsKeeper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LionTest {

    Lion lion;
    GroundsKeeper groundskeeper;

    @Before
    public void setup(){
        lion = new Lion("Simba", 2);
    }

    @Test
    public void getName() {
        assertEquals("Simba", lion.getName());
    }


    @Test
    public void canMakeNoise() {
        assertEquals("I am the King of the Jungle and I say RAAAAAR!", lion.makeNoise("RAAAAAR!"));
    }

    @Test
    public void isHungry() {
        assertEquals(false, lion.isHungry(lion));
    }
}
