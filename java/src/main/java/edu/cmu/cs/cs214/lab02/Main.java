package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Square;

public class Main {
    public static void main(String[] args) {
        // Circle circle = new Circle(3);
        // Rectangle rectangle = new Rectangle(2, 3);
        Square square = new Square(3);

        Renderer renderer = new Renderer(square);

        renderer.draw();
    }
}
