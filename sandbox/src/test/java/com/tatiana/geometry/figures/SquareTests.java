package com.tatiana.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {

    @Test

    void canCalculateArea() {
        var s = new Square(5.0);
        double result = s.area();
       Assertions.assertEquals(25.0, result);
   //     if (result != 25.0) {
   //         throw new AssertionError(String.format("Expected %f, actual %f", 25.0, result));
        }




    @Test

    void canCalculatePerimeter() {
        Assertions.assertEquals(20.0, new Square(5.0).perimeter());
    }


    @Test
    void cannotCreateSquareWithNegativeSide(){
        try {
            new Square(-5.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception){
            // OK
        }
    }

    @Test
    void testEquality(){
        var s1 = new Square(5.0); // var s1 - we create a new square
        var s2 = new Square(5.0); // var s2 - we create another square
        Assertions.assertEquals(s1, s2);
    }

    @Test
    void testNonEquality(){
        var s1 = new Square(5.0); // var s1 - we create a new square
        var s2 = new Square(4.0); // var s2 - we create another square
        Assertions.assertNotEquals(s1, s2);
    }
    @Test
    void testPass(){
        var s1 = new Square(5.0); // var s1 - we create a new square
        var s2 = new Square(5.0); // var s2 - we create another square
        Assertions.assertTrue(s1.equals(s2)); // s1 - в первом объкте вызываем метод и в качестве параметра указывеам второй объкт s2
    }



}

