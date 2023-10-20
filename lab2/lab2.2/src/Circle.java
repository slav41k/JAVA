public class Circle extends Shape {
    private final double radius;

    public Circle(String name, double radius) {
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
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double Volume() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Circle - Radius: %.3f, Area: %.3f", radius, Area());
    }

}
