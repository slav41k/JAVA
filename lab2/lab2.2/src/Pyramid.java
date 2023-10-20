public class Pyramid extends Shape {
    private final double baseLength;
    private final double height;

    public Pyramid(String name, double baseLength, double height) {
        super(name);
        if (baseLength <= 0 || height <= 0) {
            throw new IllegalArgumentException("Base length or height must be greater than zero");
        }
        this.baseLength = baseLength;
        this.height = height;
    }

    public double getBaseLength() {
        return baseLength;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double Area() {
        double baseArea = Math.pow(baseLength, 2);
        double lateralArea = baseLength * Math.sqrt(Math.pow(baseLength, 2) / 4) + Math.pow(height, 2);
        return baseArea + lateralArea;
    }

    @Override
    public double Volume() {
        return (1.0 / 3.0) * Math.pow(baseLength, 2) * height;
    }

    @Override
    public String toString() {
        return String.format("Pyramid - Base Length: %.3f, Height: %.3f, Surface Area: %.3f, Volume: %.3f", baseLength, height, Area(), Volume());
    }

}
