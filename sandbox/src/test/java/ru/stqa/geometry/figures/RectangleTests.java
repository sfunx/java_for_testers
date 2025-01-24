package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTests {
    @Test
    void canCalculateArea() {
        var r = new Rectangle( 5.0, 4.0 );
        Assertions.assertEquals( 20.0, r.area() );
    }
    @Test
    void canCalculatePerimeter() {
        var r = new Rectangle( 5.0, 4.0  );
        Assertions.assertEquals( 18.0, r.perimeter() );
    }

    @Test
    void cannotCreateRectangleWithNegativeSides() {
        Object created = null;
        Exception e = null;
        try {
            var r = new Rectangle( -5.0, 5.0 );
            created = r;
            Assertions.fail();
        } catch (IllegalArgumentException iae) {
            Assertions.assertNull(created);
            e = iae;
        } finally {
            Assertions.assertNotNull(e);
        }
        try {
            var r = new Rectangle( 5.0, -5.0 );
            Assertions.fail();
            created = r;
        } catch (IllegalArgumentException iae) {
            Assertions.assertNull(created);
            e = iae;
        } finally {
            Assertions.assertNotNull(e);
        }
    }

    @Test
    void testEquals() {
        var r1 = new Rectangle( 5.0, 4.0 );
        var r2 = new Rectangle( 5.0, 4.0 );
        Assertions.assertEquals( r1, r2 );
    }

    @Test
    void testEquals2() {
        var r1 = new Rectangle( 4.0, 5.0 );
        var r2 = new Rectangle( 5.0, 4.0 );
        Assertions.assertEquals( r1, r2 );
    }

    @Test
    void testNotEquals() {
        var r1 = new Rectangle( 5.0, 5.0 );
        var r2 = new Rectangle( 5.0, 4.0 );
        Assertions.assertNotEquals( r1, r2 );
    }
}
