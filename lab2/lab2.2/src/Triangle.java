public class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(String name, double base, double height) {
        super(name);
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Base or height must be greater than zero");
        }
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double Area() {
        return 0.5 * getBase() * getHeight();
    }

    @Override
    public double Volume() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Triangle - Base: %.3f, Height: %.3f, Area: %.3f", base, height, Area());
    }

}
