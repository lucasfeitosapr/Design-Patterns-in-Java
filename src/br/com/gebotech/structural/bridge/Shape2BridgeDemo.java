package br.com.gebotech.structural.bridge;

public class Shape2BridgeDemo {

    public static void main(String[] args) {
        Color blue = new Blue();
        Color red = new Red();
        Color green = new Green();

        Shape square = new Square(blue);
        Shape circle = new Circle(green);

        square.applyColor();
        circle.applyColor();
    }

}
