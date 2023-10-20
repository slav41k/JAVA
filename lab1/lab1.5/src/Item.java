public class Item
{
    private final String name;
    private final double weight;

    private final int size;

    public Item(String name, double weight, int height, int width, int length) {
        this.name = name;
        this.weight = weight;
        this.size = height * width * length;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", weight=" + weight + " kg" +
                ", size=" + size + " cm^3" +
                '}';
    }
}
