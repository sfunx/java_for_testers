package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {
    @Test
    void canCalculateArea() {
        var t = new Triangle(5, 29, 30 );
        double result = t.area();
        Assertions.assertEquals(72.0, result);
    }

    @Test
    void canCalculatePerimeter() {
        var s = new Triangle(5.0, 29.0, 30.0);
        double result = s.perimeter();
        Assertions.assertEquals(64.0, result);
    }
}
