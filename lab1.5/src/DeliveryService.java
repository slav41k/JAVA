import java.util.List;
import java.util.ArrayList;

public class DeliveryService
{
    private List<Shipment> shipments = new ArrayList<>();

    public void createShipment(Customer customer, DeparturePoint departurePoint, Point receivePoint, Item[] items) {
        Shipment shipment = new Shipment(items.length);
        for (Item item : items) {
            shipment.addItem(item);
        }

        shipments.add(shipment);

        System.out.println("Shipment created for customer: " + customer.getName() +
                " from " + departurePoint.getAddress() +
                " to " + receivePoint.getAddress());

        System.out.println("Items in the shipment:");
        for (Item item : items) {
            System.out.println(item.getName() + " - " + item.getWeight() + " kg, " + item.getSize() + "cm3");
        }
        System.out.println("Total weight: " + shipment.getTotalWeight() + ", total size: " + shipment.getTotalSize() + "cm3");

        // Вивід інформації про спосіб доставки
        String transportMethod = shipment.chooseTransport();
        System.out.println("Chosen transport: " + transportMethod);
    }

    public void cancelShipment(int shipmentId) {
        Shipment shipmentToRemove = null;
        for (Shipment shipment : shipments) {
            if (shipment.getId() == shipmentId) {
                shipmentToRemove = shipment;
                break;
            }
        }

        if (shipmentToRemove != null) {
            shipments.remove(shipmentToRemove);
            System.out.println("Shipment with ID " + shipmentId + " has been canceled.");
        } else {
            System.out.println("Shipment with ID " + shipmentId + " not found.");
        }
    }


}
