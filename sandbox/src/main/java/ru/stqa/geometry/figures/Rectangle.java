package ru.stqa.geometry.figures;

public record Rectangle(double w, double l) {
    public static void printRectangleArea(double a, double b) {
        var format = String.format("Площадь прямоугольника со сторонами %f и %f = %f", a, b, squareRectangle(a,b) );
        System.out.println(format);
    }

    private static double squareRectangle(double a, double b) {
        return a * b;
    }
}
