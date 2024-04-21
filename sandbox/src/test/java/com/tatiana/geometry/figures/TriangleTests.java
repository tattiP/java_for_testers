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
}


