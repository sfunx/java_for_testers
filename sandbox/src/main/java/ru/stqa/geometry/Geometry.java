package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea( 7);
        Square.printSquareArea( 5);
        Square.printSquareArea( 3);

        Rectangle.printRectangleArea( 4.0, 5.0 );
        Rectangle.printRectangleArea( 5.0, 7.0 );
    }
}
