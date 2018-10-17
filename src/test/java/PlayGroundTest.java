import Attractions.PlayGround;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayGroundTest {

    PlayGround playGround;
    Visitor visitor;

    @Before
    public void before() {
        playGround = new PlayGround("Plapla", 5);
        visitor = new Visitor("Vicky", 42, 1.68, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Plapla", playGround.getName());
    }

    @Test
    public void overAgeIsNotAllowed() {
        assertEquals(false, playGround.isAllowed(visitor));
    }
}
