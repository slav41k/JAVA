public class Sphere extends Shape {
    private final double radius;

    public Sphere(String name, double radius) {
        super(name);
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than zero");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double Area() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double Volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3);
    }

    @Override
    public String toString() {
        return String.format("Sphere - Radius: %.3f, Surface Area: %.3f, Volume: %.3f", radius, Area(), Volume());
    }

}
