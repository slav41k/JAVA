public class Shipment {

    private static int nextId = 1;
    private final int id;
    private final Item[] items;
    private int itemCount;
    private double totalWeight;

    public Shipment(int maxSize) {
        items = new Item[maxSize];
        id = nextId++;
    }


    public Shipment(int maxSize, double totalWeight) {
        this(maxSize);
        this.totalWeight = totalWeight;
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
        double weight = totalWeight;
        for (int i = 0; i < itemCount; i++) {
            weight += items[i].getWeight();
        }
        return weight;
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
            return "Curier";
        } else if (totalWeight <= 300 && totalSize <= 4000000) {
            return "Bus";
        } else if (totalWeight <= 750 && totalSize <= 12000000) {
            return "Train";
        } else {
            return "Truck";
        }
    }
}
