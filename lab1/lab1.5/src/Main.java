public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Yurii Brawlstars");
        Customer customer2 = new Customer("DinaSi4ka");
        Customer customer3 = new Customer("Vladyslav Imlystyi");

        DeparturePoint departurePoint1 = new DeparturePoint("Husyatin");
        DeparturePoint departurePoint2 = new DeparturePoint("Drogobych");
        DeparturePoint departurePoint3 = new DeparturePoint("Kramatorsk");


        ReceivePoint receivePoint2 = new ReceivePoint("Unknown");
        ReceivePoint receivePoint3 = new ReceivePoint("Moscow");

        int countOfItems1 = 3;
        Item[] items1 = new Item[countOfItems1];
        items1[0] = new Item("Laptop", 8, 2, 10, 14);
        items1[1] = new Item("Pencil", 0.05, 10, 1, 1);
        items1[2] = new Item("Phone", 2, 9, 4, 1);

        int countOfItems2 = 3;
        Item[] items2 = new Item[countOfItems2];
        items2[0] = new Item("Book", 15, 3, 5, 1);
        items2[1] = new Item("Headphones", 0.2, 5, 5, 5);
        items2[2] = new Item("Pillow", 0.5, 75, 75, 100);

        int countOfItems3 = 2;
        Item[] items3 = new Item[countOfItems3];
        items3[0] = new Item("Kite-2", 2000, 800, 400, 800);
        items3[1] = new Item("С-4", 10, 20, 50, 200);


        DeliveryService deliveryService = new DeliveryService();

        deliveryService.createShipment(customer1, departurePoint1, departurePoint2, items1);

        deliveryService.createShipment(customer2, departurePoint2,receivePoint2, items2);

        deliveryService.createShipment(customer3, departurePoint3, receivePoint3, items3);

        deliveryService.cancelShipment(1);


    }
}
