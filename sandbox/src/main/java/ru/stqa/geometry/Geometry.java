package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;
import ru.stqa.geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args) {
        Triangle.printTriangleArea( new Triangle( 5, 29, 30 ));

        Square.printSquareArea( new Square( 7.0 ));

        Rectangle.printRectangleArea( 4.0, 5.0 );
    }
}
