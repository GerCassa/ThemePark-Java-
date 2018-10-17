import Stalls.CandyFloss;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossTest {

    CandyFloss candyFloss;
    Visitor visitor;

    @Before
    public void before() {
        candyFloss = new CandyFloss("Pompones", "Alvaro", 2, 3);
        visitor = new Visitor("Vicky", 42, 1.70, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Pompones", candyFloss.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Alvaro", candyFloss.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(2, candyFloss.getParkingSpot());
    }

    @Test
    public void defaultPriceAndVisitorPriceAreSame() {
        assertEquals(4.2, candyFloss.defaultPrice(),0.1);
        assertEquals(4.2, candyFloss.visitorPrice(visitor),0.1);
    }
}
