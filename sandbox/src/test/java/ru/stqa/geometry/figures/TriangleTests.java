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

    @Test
    void cantCreateBadTriangle() {
        Object created = null;
        Exception e = null;
        try {
            var t = new Triangle(5.0, 3.0, 9.0);
            created = t;
        } catch (IllegalArgumentException iae) {
            Assertions.assertNull(created);
            e = iae;
        } finally {
            Assertions.assertNotNull(e);
        }
    }
    @Test
    void cantUseNegativeSides() {
        Object created = null;
        Exception e = null;
        try {
            var t = new Triangle( -5.0, 3.0, 9.0 );
            created = t;
        } catch (IllegalArgumentException iae) {
            Assertions.assertNull(created);
            e = iae;
        } finally {
            Assertions.assertNotNull(e);
        }
    }

    @Test
    void canCreateGoodTriangle() {
        double a = 1, b = 2, c = 1.5;

        var t = new Triangle(a,b,c);
        Assertions.assertNotNull(t);
        Assertions.assertEquals(t.geta(), a);
        Assertions.assertEquals(t.getb(), b);
        Assertions.assertEquals(t.getc(), c);
    }
}
