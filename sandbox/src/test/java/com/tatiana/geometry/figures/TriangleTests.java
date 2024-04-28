package com.tatiana.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculatePerimeter() {
        var s = new Triangle(3.0, 4.0, 5.0);
        double result = s.Perimeter();
        Assertions.assertEquals(12, result);

    }

    @Test
    void canCalculateArea() {
        var s = new Triangle(3.0, 4.0, 5.0); // Triangle - это объект. В скобках передали в качестве параметра стороны треуг
        double result = s.triangleArea(); // здесь мы вызываем метод "Площадь треуг" в этом объекте. Никакие параметры указывать не нужно, тк метод берет параметры объекта в котором он вызывается
        Assertions.assertEquals(6, result);
    }

    @Test
    void cannotCreateTriangleWithNegativeSide() {
        try {
            new Triangle(-3.0, -4.0, -5.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {

        }
    }

    @Test
    void cannotCreateTriangleWithTheseSidesLength() {
        try {
            new Triangle(3.0, 4.0, 9.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {

        }

    }

    @Test
    void testEquality() {
        var t1 = new Triangle(5.0, 4.0, 3.0);
        var t2 = new Triangle(5.0, 4.0, 3.0);
        Assertions.assertEquals(t1, t2);
    }

    @Test
    void testNonEquality() {
        var t1 = new Triangle(5.0, 4.0, 3.0);
        var t2 = new Triangle(4.0, 5.0, 7.0);
        Assertions.assertNotEquals(t1, t2);

    }

    @Test
    void testEquality2() {
        var t1 = new Triangle(2.0, 3.0, 4.0);
        var t2 = new Triangle(2.0, 4.0, 3.0);
        var t3 = new Triangle(3.0, 2.0, 4.0);
        var t4 = new Triangle(3.0, 4.0, 2.0);
        var t5 = new Triangle(4.0, 2.0, 3.0);
        var t6 = new Triangle(4.0, 3.0, 2.0);
        Assertions.assertEquals(t1, t2);
        Assertions.assertEquals(t1, t3);
        Assertions.assertEquals(t1, t4);
        Assertions.assertEquals(t1, t5);
        Assertions.assertEquals(t1, t6);
    }
}


