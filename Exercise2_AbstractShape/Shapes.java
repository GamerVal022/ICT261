interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Square implements Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }
}

public class Shapes {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 5);
        Square square = new Square(6);

        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Square area: " + square.calculateArea());
    }
}
