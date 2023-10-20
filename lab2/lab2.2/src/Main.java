import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapesList = new ArrayList<>();


        shapesList.add(new Triangle("Triangle 1", 5, 4));
        shapesList.add(new Triangle("Triangle 2", 3, 3));

        shapesList.add(new Square("Square 1", 4.54532));
        shapesList.add(new Square("Square 2", 3));

        shapesList.add(new Rectangle("Rectangle 1", 4, 6));
        shapesList.add(new Rectangle("Rectangle 2", 7, 3));

        shapesList.add(new Cube("Cube 1", 5));
        shapesList.add(new Cube("Cube 2", 2));

        shapesList.add(new Pyramid("Pyramid 1", 4, 6));
        shapesList.add(new Pyramid("Pyramid 2", 8, 5));

        shapesList.add(new Circle("Circle 1", 7));
        shapesList.add(new Circle("Circle 2", 10));

        shapesList.add(new Sphere("Sphere 1", 4));
        shapesList.add(new Sphere("Sphere 2", 6));


        for (Shape shape : shapesList) {
            System.out.println(shape);
        }
    }
}
