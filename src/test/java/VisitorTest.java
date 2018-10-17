import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before() {
        visitor = new Visitor("Holly", 16,1.60, 20);
    }

    @Test
    public void hasName() {
        assertEquals("Holly", visitor.getName());
    }

    @Test
    public void hasAge() { assertEquals( 16, visitor.getAge()); }

    @Test
    public void hasHeight() {
        assertEquals(1.60, visitor.getHeight(),0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(20, visitor.getMoney(),0.1);
    }
}
