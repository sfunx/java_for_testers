package ru.stqa.geometry.figures;

public class Square {

    public static void printSquareArea(double side) {
        var format = String.format("Площадь квадрата со стороной %f = %f", side, squareArea(side));
        System.out.println(format);
    }

    private static double squareArea(double side) {
        return side * side;
    }
}
