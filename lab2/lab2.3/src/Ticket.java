import java.util.Calendar;

public class Ticket {
    private final Passenger passenger;
    private final double price;
    private final Calendar purchaseDate;

    public Ticket(final Passenger passenger, final double price, final Calendar purchaseDate) {
        this.passenger = passenger;
        this.price = price;
        this.purchaseDate = purchaseDate;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Calendar getPurchaseDate() {
        return purchaseDate;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "passenger=" + passenger +
                ", price=" + price +
                ", purchaseDate=" + purchaseDate +
                '}';
    }
}
