public class Square extends Shape {
    private final double side;

    public Square(String name, double side) {
        super(name);
        if (side <= 0) {
            throw new IllegalArgumentException("Side must be greater than zero");
        }
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double Area() {
        return Math.pow(getSide(), 2);
    }

    @Override
    public double Volume() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Square - Side: %.3f, Area: %.3f", side, Area());
    }

}
