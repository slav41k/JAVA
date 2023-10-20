import java.util.*;

public class FlightSchedule {
    private final List<Flight> flights = new ArrayList<>();
    public List<Flight> getFlights() {
        return flights;
    }

    public void addFlight(final Flight flight) {
        flights.add(flight);
    }

    public void removeFlight(int index) {
        flights.remove(index);
    }

    @Override
    public String toString() {
        return "FlightSchedule{" +
                "flights=" + flights +
                '}';
    }
}
