import JavaAir.Pilot;
import JavaAir.StaffRank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Bob the Pilot", StaffRank.CAPTAIN, "BP0020");
    }

    @Test
    public void pilotCanFlyPlane(){
        assertEquals("Whoo I am flying", pilot.flyPlane());
    }
}
