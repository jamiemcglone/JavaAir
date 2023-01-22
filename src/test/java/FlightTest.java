import JavaAir.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Pilot pilot;
    Plane plane;
    CabinCrewMember cabinCrewMember;
    Flight flight;
    Passenger passenger;

    @Before
    public void before(){
        pilot = new Pilot("Bob the Pilot", StaffRank.CAPTAIN, "BP0020");
        plane = new Plane(PlaneType.BOEING747);
        passenger = new Passenger("John", 2);
        flight = new Flight(pilot, plane, "BA747", "NYC", "EDI", new Date(1, 02, 2023, 12, 30));
    }

    @Test
    public void flightCanReturnNumOfAvailableSeats(){
        assertEquals(300, flight.getNumOfAvailableSeats());
    }

    @Test
    public void flightCanBookPassenger(){
        flight.bookPassenger(passenger);
        assertEquals(1, flight.getNumOfPassengers());
        assertEquals(flight, passenger.getFlight());

    }

}
