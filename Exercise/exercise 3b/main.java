import java.io.Serializable;
import org.apache.commons.lang3.SerializationUtils;

public class main {
    public static void main(String[] args) {
        Shape[] shapes = {new Triangle:5, 3), new Rectangle(7, 6), new Circle(9), new Square(2)};

        for (Shape shape : shapes) {
            try {
                byte[] serializedShape = SerializationUtils.serialize(shape);
                Shape deserializedShape = SerializationUtils.deserialize(serializedShape);
            } catch (Exception e) {
                System.out.println("Error serializing or deserializing object: " + e.getMessage());
            }
        }
    }

    abstract static class Shape implements Serializable {

        static String color = "black";
        abstract double Area();
    }

    static class Triangle extends Shape {
        double base;
        double height;

        Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        double Area() {
            return 0.5 * base * height;
        }

    }

    static class Rectangle extends Shape {
        double width;
        double height;

        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        double Area() {
            return width * height;
        }

    }

    static class Circle extends Shape {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double Area() {
            return 3.14 * radius * radius;
        }


    }

    static class Square extends Shape {
        double side;

        Square(double side) {
            this.side = side;
        }

        @Override
        double Area() {
            return side * side;
        }

    }
}
