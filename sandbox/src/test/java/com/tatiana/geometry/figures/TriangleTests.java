package com.tatiana.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
   void canCalculatePerimeter(){
        var t = new Triangle (10.0, 10.0, 15.0);
        double result = t.Perimeter(10.0, 10.0, 15.0);
        Assertions.assertEquals(35, new Triangle(10.0, 10.0, 15.0));

        }

    @Test
    void canCalculateArea(){
        var t = new Triangle(10.0, 10.0, 15.0);
        double result = t.triangleArea();
        Assertions.assertEquals(33.1, result);
    }

    }


