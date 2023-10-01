public class Item
{
    private final String name;
    private final double weight;

    private int height, width, length;
    private int size;

    public Item(String name, double weight, int height, int width, int length) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.length = length;
        this.size = height * width * length;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }


    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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