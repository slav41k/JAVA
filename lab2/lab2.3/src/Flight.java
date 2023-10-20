import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

public class Flight {

    private final Airport departureAirport;
    private final Airport arrivalAirport;
    private final double ticketPrice;
    private final Calendar departureTime;
    private final Plane plane;

    public Flight(Airport departureAirport, Airport arrivalAirport, Ticket ticketPrice, Calendar departureTime, Plane plane) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.ticketPrice = ticketPrice.getPrice();
        this.departureTime = departureTime;
        this.plane = plane;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public Calendar getDepartureTime() {
        return departureTime;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public Plane getPlane() {
        return plane;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureAirport=" + departureAirport +
                ", arrivalAirport=" + arrivalAirport +
                ", ticketPrice=" + ticketPrice +
                ", departureTime=" + departureTime +
                ", plane=" + plane +
                '}';
    }
}
