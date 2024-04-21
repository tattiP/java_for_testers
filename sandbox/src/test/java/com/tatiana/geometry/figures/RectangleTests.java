package com.tatiana.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTests {


    @Test
    void cannotCreateRectangleWithNegativeSide() {
        try {
            new Rectangle(-5.0, 3.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {

        }

    }

    @Test
    void testEquality() {
        var r1 = new Rectangle(5.0, 4.0); // var r1 - we create a new square
        var r2 = new Rectangle(5.0, 4.0); // var r2 - we create another square
        Assertions.assertEquals(r1, r2);
    }

    @Test
    void testEquality2() {
        var r1 = new Rectangle(5.0, 4.0); // var r1 - we create a new square
        var r2 = new Rectangle(4.0, 5.0); // var r2 - we create another square
        Assertions.assertEquals(r1, r2);

    }
}
