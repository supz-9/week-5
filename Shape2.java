class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
   
    void display() {
        super.display();
        System.out.println("This is a circle.");
    }
}

class Rectangle extends Shape {
   
    void display() {
        super.display();
        System.out.println("This is a rectangle.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.display();
        shape2.display();
    }
}
