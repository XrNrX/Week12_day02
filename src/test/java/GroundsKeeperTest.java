import Staff.GroundsKeeper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GroundsKeeperTest {

    GroundsKeeper groundskeeper;

    @Before
    public void setup(){
        groundskeeper = new GroundsKeeper("Willie", 65, 22000);
    }

    @Test
    public void getName() {
        assertEquals("Willie", groundskeeper.getName());
    }

    @Test
    public void getAge() {
        assertEquals(65, groundskeeper.getAge());
    }

    @Test
    public void getSalary() {
        assertEquals(22000, groundskeeper.getSalary());
    }

    @Test
    public void canTalkToAnimals() {
        assertEquals("You're a fine beast you are!!!", groundskeeper.talkToAnimals("You're a fine beast you are!!!"));
    }
}
