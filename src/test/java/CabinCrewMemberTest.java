import JavaAir.CabinCrewMember;
import JavaAir.StaffRank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Jason", StaffRank.FLIGHTATTENDANT);
    }

    @Test
    public void cabinCrewCanSpeakToPassengers(){
        assertEquals("Hello passengers, we will land soon", cabinCrewMember.announceLanding());
    }
}
