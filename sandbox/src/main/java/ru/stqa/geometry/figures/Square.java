package ru.stqa.geometry.figures;

public record Square(double side) {

    public Square(double side) {
        if (side < 0)
            throw new IllegalArgumentException("Длина стороны квадрата должна быть неотрицательной");
        this.side = side;
    }
    public static void printSquareArea(Square s) {
        var format = String.format("Площадь квадрата со стороной %f = %f", s.side, s.area());
        System.out.println(format);
    }

    public double area() {
        return this.side * this.side;
    }

    public double perimeter() {
        return 4 * this.side;
    }
}
