import attractions.Dodgems;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    RollerCoaster rollerCoaster;
    Playground playground;
    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void before(){
        themePark = new ThemePark("Thorpe Park");
        dodgems = new Dodgems("Bumper Cars", 5);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        playground = new Playground("Fun Zone", 7);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        visitor1 = new Visitor(12, 1.23, 10.00);
        visitor2 = new Visitor(15, 1.46, 10.00);
        visitor3 = new Visitor(16, 1.76, 10.00);
    }

    @Test
    public void newParkHasEmptyAL(){
        assertEquals(0, themePark.getNumAttrAndStalls());
    }
}
