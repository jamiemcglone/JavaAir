package JavaAir;

import java.util.ArrayList;

public class FlightManager {

    public FlightManager() {
    }

    public int calculatePassengerBaggageWeight(Passenger passenger){
        return passenger.getBags() * 15;
    }

    public int calculateAllPassengerBaggage(Flight flight){
        ArrayList<Passenger> passengers = flight.getPassengers();
        int total = 0;
        for (Passenger passenger: passengers){
            total += this.calculatePassengerBaggageWeight(passenger);
        }
        return total;
    }

    public int calculateRemainingBaggageAllowance(Flight flight){
        int flightWeight = flight.getPlaneBaggageWeight();
        return flightWeight - calculateAllPassengerBaggage(flight);
    }
}
