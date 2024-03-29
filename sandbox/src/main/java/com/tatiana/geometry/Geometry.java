package com.tatiana.geometry;

import com.tatiana.geometry.figures.Rectangle;
import com.tatiana.geometry.figures.Square;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(7.0); // это вызов функции
        Square.printSquareArea(5.0);
        Square.printSquareArea(3.0);

        Rectangle.printRectangleArea(3.0, 5.0);
        Rectangle.printRectangleArea(7.0, 9.0);

    }

}
