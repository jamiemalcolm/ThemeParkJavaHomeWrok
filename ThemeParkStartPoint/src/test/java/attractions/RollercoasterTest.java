package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;
    Visitor visitor5;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(11, 144, 20.00);
        visitor2 = new Visitor(12, 146, 20.00);
        visitor3 = new Visitor(13, 123, 20.00);
        visitor4 = new Visitor(14, 182, 20.00);
        visitor5 = new Visitor(14, 202, 20.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void cantVisitAgeAndHeight(){
        assertFalse(rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void cantVisitAge(){
        assertFalse(rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void cantVisitHeight(){
        assertFalse(rollerCoaster.isAllowedTo(visitor3));

    }

    @Test
    public void canVisitAge(){
        assertTrue(rollerCoaster.isAllowedTo(visitor4));
    }

    @Test
    public void shortPersonPrice(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor4), 0.01);
    }

    @Test
    public void tallPersonPrice(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor5), 0.01);
    }
}
