package com.tatiana.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.Rectangle;

public class RectangleTests {

    @Test
    void cannotCreateRectangleWithNegativeSide(){
        try {
            new Rectangle();
            Assertions.fail();
        } catch (IllegalArgumentException exception){

        }
    }


}
