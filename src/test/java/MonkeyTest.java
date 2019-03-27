import Animals.Monkey;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MonkeyTest {

    Monkey monkey;

    @Before
    public void setup(){
        monkey = new Monkey("Bubbles", 7);
    }

    @Test
    public void getName() {
        assertEquals("Bubbles", monkey.getName());
    }

    @Test
    public void makeNoise() {
        assertEquals("I Love Banana's!!!", monkey.makeNoise());
    }

    @Test
    public void getHunger() {
        assertEquals(true, monkey.isHungry(monkey));
    }
}
