package ru.stqa.geometry.figures;

public record Triangle(double a, double b, double c) {
    public Triangle(double a, double b, double c) {
        if (a < 0 | b < 0 | c < 0) {
            throw new IllegalArgumentException("Длина стороны треугольника должна быть положительной");
        } else if ((a+b) < c | (a+c) < b | (b+c) < a) {
            throw new IllegalArgumentException("Нарушено неравенство треугольника");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static void printTriangleArea(Triangle t) {
        var format = String.format("Площадь треугольника со сторонами %f, %f, %f = %f", t.a, t.b, t.c, t.area());
        System.out.println(format);
    }
    public double area() {
        double p = this.perimeter()/2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double perimeter() {
        return this.a + this.b + this.c;
    }
    public double geta() {
        return this.a;
    }
    public double getb() {
        return this.b;
    }
    public double getc() {
        return this.c;
    }
}
