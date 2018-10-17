import Attractions.RollerCoaster;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void before() {
        rollerCoaster = new RollerCoaster("Superman", 4);
        visitor = new Visitor("German", 29, 1.70, 50);
        visitor2 = new Visitor("Corran", 5, 1.20, 10);
        visitor3 = new Visitor("Tallguy", 20, 2.20, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Superman", rollerCoaster.getName());
    }

    @Test
    public void isAllowed() {
        assertEquals(true, rollerCoaster.isAllowed(visitor));
    }

    @Test
    public void isNotAllowed() {
        assertEquals(false, rollerCoaster.isAllowed(visitor2));
    }

    @Test
    public void tallVisitorPrice() {
        assertEquals(16.80, rollerCoaster.visitorPrice(visitor3),0.1);
    }

    @Test
    public void normalVisitorPrice() {
        assertEquals(8.40, rollerCoaster.visitorPrice(visitor),0.1);
    }
}
