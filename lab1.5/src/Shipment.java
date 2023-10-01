public class Shipment {

    private static int nextId = 1;
    private int id;
    private final String BICYCLE = "Bicycle";
    private final String BUS = "Bus";
    private final String TRAIN = "Train";
    private final String TRUCK = "Truck";
    private final Item[] items;
    private int itemCount;

    public Shipment(int maxSize) {
        items = new Item[maxSize];
        id = nextId++;
    }

    public int getId() {
        return id;
    }

    public void addItem(Item item) {
        if (itemCount < items.length) {
            items[itemCount] = item;
            itemCount++;
        }
    }

    public double getTotalWeight() {
        double totalWeight = 0;
        for (int i = 0; i < itemCount; i++) {
            totalWeight += items[i].getWeight();
        }
        return totalWeight;
    }

    public int getTotalSize() {
        int totalSize = 0;
        for (int i = 0; i < itemCount; i++) {
            totalSize += items[i].getSize();
        }
        return totalSize;
    }

    public String chooseTransport() {
        double totalWeight = getTotalWeight();
        int totalSize = getTotalSize();

        if (totalWeight <= 10 && totalSize <= 500000) {
            return BICYCLE;
        } else if (totalWeight <= 300 && totalSize <= 4000000) {
            return BUS;
        } else if (totalWeight <= 750 && totalSize <= 12000000) {
            return TRAIN;
        } else {
            return TRUCK;
        }
    }




}