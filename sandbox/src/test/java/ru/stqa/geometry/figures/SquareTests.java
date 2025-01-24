package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {
    @Test
    void canCalculateArea() {
        var s = new Square( 5.0 );
        double result = s.area();
        Assertions.assertEquals( 25.0, result );
    }
    @Test
    void canCalculatePerimeter() {
        var s = new Square( 5.0 );
        double result = s.perimeter();
        Assertions.assertEquals( 20.0, result );
    }

    @Test
    void cannotCreateSquareWithNegativeSides() {
        Object created = null;
        Exception e = null;
        try {
            var t = new Square( -5.0 );
            Assertions.fail();
            created = t;
        } catch (IllegalArgumentException iae) {
            Assertions.assertNull(created);
            e = iae;
        } finally {
            Assertions.assertNotNull(e);
        }
    }

    @Test
    void testEquals() {
        var s1 = new Square( 5.0 );
        var s2 = new Square( 5.0 );
        Assertions.assertEquals( s1, s2 );
    }

    @Test
    void testNotEquals() {
        var s1 = new Square( 5.0 );
        var s2 = new Square( 4.0 );
        Assertions.assertNotEquals( s1, s2 );
    }

//    @Test
//    void testPass() {
//        var s1 = new Square( 5.0 );
//        var s2 = new Square( 5.0 );
//        Assertions.assertTrue( s1.equals( s2 ) );
//    }
}
