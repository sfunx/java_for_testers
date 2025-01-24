package ru.stqa.geometry.figures;

public record Triangle(double a, double b, double c) {
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
}
