package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.Collection;
import java.util.HashMap;

public class FlightControl {
    
    private HashMap<String, Airplane> planes;
    private HashMap<String, Flight> flights;
    private HashMap<String, Place> places;
    
    public FlightControl() {
        this.planes = new HashMap();
        this.flights = new HashMap();
        this.places = new HashMap();
    }
    
    public void addAirplane(String name, int capacity) {
        this.planes.putIfAbsent(name, new Airplane(name, capacity));
    }
            
    public void addFlight(Airplane plane, String departureID, String destinationID) {
        this.places.putIfAbsent(departureID, new Place(departureID));
        this.places.putIfAbsent(destinationID, new Place(destinationID));
        
        Flight flight = new Flight(plane, this.places.get(departureID), this.places.get(destinationID));
        this.flights.put(flight.toString(), flight);
    }
            
    public Collection<Airplane> getAirplanes() {
        return this.planes.values();
    }
            
    public Collection<Flight> getFlights() {
        return this.flights.values();
    }
            
    public Airplane getAirplane(String ID) {
        return this.planes.get(ID);
    }        
    
}