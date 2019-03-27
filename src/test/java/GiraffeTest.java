import Animals.Giraffe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiraffeTest {
    
    Giraffe giraffe;
    
    @Before
    public void setup(){
        giraffe = new Giraffe("Henry", 8);
    }

    @Test
    public void getName() {
        assertEquals("Henry", giraffe.getName());
    }

    @Test
    public void canMakeNoise() {
        assertEquals("I wish i was small", giraffe.makeNoise("I wish i was small"));
    }

    @Test
    public void getHunger() {
        assertEquals(8, giraffe.getHunger());
    }

    @Test
    public void isHungry() {
        assertEquals(true, giraffe.isHungry(giraffe));
    }
}
