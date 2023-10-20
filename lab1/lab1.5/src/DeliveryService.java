
public class DeliveryService {
    private final Shipment[] shipments = new Shipment[5];
    private int shipmentCount = 0;

    public void createShipment(Customer customer, DeparturePoint departurePoint, Point receivePoint, Item[] items) {
        Shipment shipment = new Shipment(items.length);
        for (Item value : items) {
            shipment.addItem(value);
        }

        if (shipmentCount < shipments.length) {
            shipments[shipmentCount] = shipment;
            shipmentCount++;

            System.out.println("Shipment created for customer: " + customer.getName() +
                    " from " + departurePoint.getAddress() +
                    " to " + receivePoint.getAddress());

            System.out.println("Items in the shipment:");
            for (Item item : items) {
                System.out.println(item.getName() + " - " +
                        item.getWeight() + " kg, " +
                        item.getSize() + "cm3");
            }
            System.out.println("Total weight: " +
                    shipment.getTotalWeight() + ", total size: " +
                    shipment.getTotalSize() + "cm3");

            if ("Unknown".equals(receivePoint.getAddress())) {
                shipment = new Shipment(items.length, 1);
            }

            String transportMethod = shipment.chooseTransport();
            System.out.println("Chosen transport: " + transportMethod);
        } else {
            System.out.println("No more space for shipments.");
        }
    }

    public void cancelShipment(int shipmentId) {
        for (int i = 0; i < shipmentCount; i++) {
            if (shipments[i].getId() == shipmentId) {
                shipments[i] = shipments[shipmentCount - 1];
                shipments[shipmentCount - 1] = null;
                shipmentCount--;
                System.out.println("Shipment with ID " + shipmentId + " has been canceled.");
                return;
            }
        }
        System.out.println("Shipment with ID " + shipmentId + " not found.");
    }
}
