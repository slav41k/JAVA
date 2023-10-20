import java.util.*;
public class AirlineSystem {
    private final List<Airport> airports = new ArrayList<>();
    private final List<Plane> planes = new ArrayList<>();
    private final List<Passenger> passengers = new ArrayList<>();
    private final List<Ticket> tickets = new ArrayList<>();

    public void addPlane(final Plane plane){
        planes.add(plane);
    }
    public void removePlane(final int index){
        planes.remove(index);
    }

    public void editPlane(final int index, final String name, final int speed){
        planes.set(index, new Plane(name, speed));
    }

    public void addAirport(final Airport airport){
        airports.add(airport);
    }
    public void removeAirport(final int index){
        airports.remove(index);
    }

    public void editAirport(final int index, final String name, final String location){
        airports.set(index, new Airport(location, name));
    }

    public void addPassenger(final Passenger passenger) {
        passengers.add(passenger);
    }

    public void removePassenger(final Passenger passenger) {
        passengers.remove(passenger);
    }

    public void editPassenger(final int index, final String name) {
        passengers.set(index, new Passenger(name));
    }

    public void addTicket(final Ticket ticket) {
        tickets.add(ticket);
    }

    public void removeTicket(final int index) {
        tickets.remove(index);
    }

    public void editTicket(final int index, final Passenger passenger, final double price, final Calendar purchaseDate) {
        tickets.set(index, new Ticket(passenger, price, purchaseDate));
    }

    public double calculateProfit(Calendar startDate, Calendar endDate) {
        double totalProfit = 0;

        for (Ticket ticket : tickets) {
            Calendar purchaseDate = ticket.getPurchaseDate();

            if (purchaseDate.after(startDate) && purchaseDate.before(endDate)) {
                totalProfit += ticket.getPrice();
            }
        }

        return totalProfit;
    }


    @Override
    public String toString() {
        return "AirlineSystem{" +
                "airports=" + airports +
                ", planes=" + planes +
                ", passengers=" + passengers +
                ", tickets=" + tickets +
                '}';
    }
}
