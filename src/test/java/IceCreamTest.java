import Stalls.IceCream;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamTest {

    IceCream iceCream;
    Visitor visitor;

    @Before
    public void before() {
        iceCream = new IceCream("Acuarela", "Robinson", 1, 5);
        visitor = new Visitor("Vicky", 42, 1.70, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Acuarela", iceCream.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Robinson", iceCream.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(1, iceCream.getParkingSpot());
    }

    @Test
    public void defaultPriceAndVisitorPriceAreSame() {
        assertEquals(2.8, iceCream.defaultPrice(),0.1);
        assertEquals(2.8, iceCream.visitorPrice(visitor),0.1);
    }
}
