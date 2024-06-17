/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.service;

import FlightControl.models.Flight;
import FlightControl.models.Place;
import FlightControl.models.Plane;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author timo
 */
public class FlightControl {
    private HashMap<String, Plane> airplanes = new HashMap<>();
    private HashMap<String, Flight> flights = new HashMap<>();
    private Map<String, Place> places;

    public FlightControl() {
        this.flights = new HashMap<>();
        this.airplanes = new HashMap<>();
        this.places = new HashMap<>();
    }

    public void addAirplane(String ID, int capacity) {
        Plane plane = new Plane(ID, capacity);
        this.airplanes.put(ID, plane);
    }

    public void addFlight(Plane plane, String departureID, String destinationID) {
        this.places.putIfAbsent(departureID, new Place(departureID));
        this.places.putIfAbsent(destinationID, new Place(destinationID));

        Flight flight = new Flight(plane, this.places.get(departureID), this.places.get(destinationID));
        this.flights.put(flight.toString(), flight);
    }

    public Collection<Plane> getAirplanes() {
        return this.airplanes.values();
    }

    public Collection<Flight> getFlights() {
        return this.flights.values();
    }

    public Plane getAirplane(String ID) {
        return this.airplanes.get(ID);
    }
}
