public class Cube extends Shape {
    private final double side;

    public Cube(String name, double side) {
        super(name);
        if (side <= 0) {
            throw new IllegalArgumentException("Radius must be greater than zero");
        }
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double Area() {
        return 6 * Math.pow(getSide(), 2);
    }

    @Override
    public double Volume() {
        return Math.pow(getSide(), 3);
    }

    @Override
    public String toString() {
        return String.format("Cube - Side: %.3f, Surface Area: %.3f, Volume: %.3f", side, Area(), Volume());
    }

}
