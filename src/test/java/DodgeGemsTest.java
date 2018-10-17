import Attractions.DodgeGems;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgeGemsTest {

    DodgeGems dodgeGems;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void before() {
        dodgeGems = new DodgeGems("Chocones", 4);
        visitor = new Visitor("Corran", 5, 1.20, 10);
        visitor2 = new Visitor ("Holly", 16, 1.60, 20);
    }

    @Test
    public void hasName() {
        assertEquals("Chocones", dodgeGems.getName());
    }

    @Test
    public void under12VisitorPrice() {
        assertEquals(2.25, dodgeGems.visitorPrice(visitor),0.1);
    }

    @Test
    public void over12VisitorPrice() {
        assertEquals(4.5, dodgeGems.visitorPrice(visitor2),0.1);
    }

}
