// Implementor interface
interface Color {
    String fill();
}

// Concrete Implementor classes
class RedColor implements Color {
    @Override
    public String fill() {
        return "Coloring with red color";
    }
}

class BlueColor implements Color {
    @Override
    public String fill() {
        return "Coloring with blue color";
    }
}

// Abstraction class
abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract String draw();
}

// Refined Abstraction classes
class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    String draw() {
        return "Drawing circle. " + color.fill();
    }
}

class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    String draw() {
        return "Drawing square. " + color.fill();
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        // Create different shapes with different colors
        Shape redCircle = new Circle(new RedColor());
        Shape blueSquare = new Square(new BlueColor());

        // Draw the shapes
        System.out.println(redCircle.draw());
        System.out.println(blueSquare.draw());
    }
}
