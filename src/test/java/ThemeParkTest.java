import Attractions.RollerCoaster;
import Stalls.Tobacco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    RollerCoaster rollerCoaster;
    Tobacco tobacco;

    @Before
    public void before() {
        themePark = new ThemePark("Parque del Bosque");
        rollerCoaster = new RollerCoaster("Superman", 4);
        tobacco = new Tobacco("Tehuel-Aike", "Alvarez", 4, 5);
    }

    @Test
    public void hasName() {
        assertEquals("Parque del Bosque", themePark.getName());
    }

    @Test
    public void hasAttractions() {
        themePark.addAttraction(rollerCoaster);
        assertEquals(1, themePark.countAttractions());
    }

    @Test
    public void hasStalls() {
        themePark.addStall(tobacco);
        assertEquals(1, themePark.stallsCount());
    }

    @Test
    public void hasReviewedThings() {
        themePark.addAttraction(rollerCoaster);
        themePark.addStall(tobacco);
        themePark.addReviewedThings();
        assertEquals(2, themePark.countReviewedThings());
    }
}
