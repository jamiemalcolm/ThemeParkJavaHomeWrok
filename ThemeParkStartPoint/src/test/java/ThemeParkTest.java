import attractions.Dodgems;
import attractions.Playground;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import java.util.ArrayList;

import static org.junit.Assert.*;

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

    @Test
    public void canAddAttraction(){
        themePark.addAttractionOrStall(dodgems);
        assertEquals(1, themePark.getNumAttrAndStalls());
    }

    @Test
    public void canAddStall(){
        themePark.addAttractionOrStall(tobaccoStall);
        assertEquals(1, themePark.getNumAttrAndStalls());
    }

    @Test
    public void canGetAllinList(){
        themePark.addAttractionOrStall(dodgems);
        themePark.addAttractionOrStall(tobaccoStall);
        themePark.addAttractionOrStall(rollerCoaster);
        themePark.addAttractionOrStall(playground);

        ArrayList<IReviewed> expected = new ArrayList<>();
        expected.add(dodgems);
        expected.add(tobaccoStall);
        expected.add(rollerCoaster);
        expected.add(playground);
        assertEquals(themePark.getAllReviewed(), expected);
    }

}
