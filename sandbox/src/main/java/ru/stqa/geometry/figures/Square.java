package ru.stqa.geometry.figures;

public class Square {

    public static void printSquareArea(double side) {
        var format = String.format("Площадь квадрата со стороной %f = %f", side, area(side));
        System.out.println(format);
    }

    public static double area(double side) {
        return side * side;
    }

    public static double perimeter(double side) {
        return 4 * side;
    }
}
