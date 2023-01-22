package JavaAir;

import java.util.ArrayList;
import java.util.Date;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private Date departureTime;

    public Flight(Pilot pilot, Plane plane, String flightNumber, String destination, String departureAirport, Date departureTime) {
        this.pilot = pilot;
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = new Date();
    }

    public void bookPassenger(Passenger passenger){
        this.passengers.add(passenger);
        passenger.setFlight(this);
    }

    public int getNumOfAvailableSeats(){
        PlaneType planeType = this.plane.getPlaneType();
        return planeType.getCapacity() - this.passengers.size();
    }

    public int getNumOfPassengers(){
        return this.passengers.size();
    }

    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }

    public int getPlaneBaggageWeight(){
        return this.plane.getBaggageWeight();
    }
}
