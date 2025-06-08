abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

  
    double area() {
        return length * width;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Shape shape;

        shape = new Circle(3.5);
        System.out.println("Circle area: " + shape.area());

        shape = new Rectangle(5.0, 2.0);
        System.out.println("Rectangle area: " + shape.area());
    }
}
