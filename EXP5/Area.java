// Base class
class Shape {
    public double calculateArea() {
        return 0.0;
    }
}

// Rectangle subclass overriding calculateArea
class Rectangle extends Shape {
    int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}

// Triangle subclass overriding calculateArea
class Triangle extends Shape {
    int base, height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Main class
public class Area {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(5, 4);   // Polymorphism in action
        Shape s2 = new Triangle(7, 5);

        System.out.println("Area of Rectangle: " + s1.calculateArea()); // 20.0
        System.out.println("Area of Triangle: " + s2.calculateArea());  // 17.5
    }
}
