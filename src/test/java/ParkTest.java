import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before() {
        park = new Park("Belgrano", 3);
    }

    @Test
    public void hasName() {
        assertEquals("Belgrano", park.getName());
    }
}
