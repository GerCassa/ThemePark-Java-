import Stalls.Tobacco;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoTest {

    Tobacco tobacco;
    Visitor visitor;
    Visitor visitor2;


    @Before
    public void before() {
        tobacco = new Tobacco("El Choique", "Levatti", 5, 5);
        visitor = new Visitor("Corran", 5, 1.20, 10);
        visitor2 = new Visitor("Vicky", 42, 1.70, 100);

    }

    @Test
    public void hasName() {
        assertEquals("El Choique", tobacco.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Levatti", tobacco.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(5, tobacco.getParkingSpot());
    }

    @Test
    public void underAgeIsNotAllowed() {assertEquals(false, tobacco.isAllowed(visitor));}

    @Test
    public void defaultPrice() {
        assertEquals(6.6, tobacco.defaultPrice(),0.1);
    }

    @Test
    public void visitorPrice() {
        assertEquals(6.6, tobacco.visitorPrice(visitor2),0.1);
        assertEquals(00.00, tobacco.visitorPrice(visitor),0.1);
    }
}
