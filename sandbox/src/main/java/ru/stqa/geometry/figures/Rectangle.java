package ru.stqa.geometry.figures;

import java.util.Objects;

public record Rectangle(double width, double length) {
    public Rectangle(double width, double length) {
        if (width < 0 | length < 0) {
            throw new IllegalArgumentException("Длина стороны прямоугольника должна быть неотрицательной");
        }
        this.width = width;
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return (Double.compare(width, rectangle.width) == 0 && Double.compare(length, rectangle.length) == 0) |
                (Double.compare(width, rectangle.length) == 0 && Double.compare(length, rectangle.width) == 0);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length);
    }

    public static void printRectangleArea(double a, double b) {
        var r = new Rectangle(a, b);
        var format = String.format("Площадь прямоугольника со сторонами %f и %f = %f", a, b, r.area() );
        System.out.println(format);
    }

    public double area() {
        return width * length;
    }

    public double perimeter() {
        return 2 * (width + length);
    }
}
