import JavaAir.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Passenger passenger;
    Passenger passenger1;
    Passenger passenger2;
    Flight flight;
    Pilot pilot;
    Plane plane;


    @Before
    public void before(){
        flightManager = new FlightManager();
        passenger = new Passenger("Bob", 2);
        passenger1 = new Passenger("John", 3);
        passenger2 = new Passenger("Jeremy", 2);
        pilot = new Pilot("Bob the Pilot", StaffRank.CAPTAIN, "BP0020");
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(pilot, plane, "BA747", "NYC", "EDI", new Date(1, 02, 2023, 12, 30));

    }

    @Test
    public void canCalculatePassengerBaggage(){
        assertEquals(30, flightManager.calculatePassengerBaggageWeight(passenger));
    }

    @Test
    public void canCalculateAllPassengerBaggage(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(105, flightManager.calculateAllPassengerBaggage(flight));

    }

    @Test
    public void canCalculateRemainingBaggageWeight(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(91645, flightManager.calculateRemainingBaggageAllowance(flight));
    }
}
