public class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        if (width <= 0 || length <= 0) {
            throw new IllegalArgumentException("Width or length must be greater than zero");
        }
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double Area() {
        return getLength() * getWidth();
    }

    @Override
    public double Volume() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Rectangle - Length: %.3f, Width: %.3f, Area: %.3f", length, width, Area());
    }

}
