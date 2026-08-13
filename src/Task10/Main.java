package Task10;

import java.awt.*;

public class Main {
    static void main(String[] args) {
        double radius = 5;
        Shape circle = new Shape() {
            @Override
            double area() {
                return Math.PI * radius * radius;
            }
        } ;
        System.out.println("Area: " + circle.area());
    }
}
