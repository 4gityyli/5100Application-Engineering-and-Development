public class main{
    public static void main(String[] args){
    }
    abstract class Shape {

        static String color = "red";
        abstract double Area();
    }
    
    class Triangle extends Shape {
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
    
    class Rectangle extends Shape {
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
    
    class Circle extends Shape {
        double radius;
        Circle(double radius) {
            this.radius = radius;
        }
    
        @Override
        double Area() {
            return 3.14* radius * radius;
        }
    
    
    }
    
    class Square extends Shape {
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
