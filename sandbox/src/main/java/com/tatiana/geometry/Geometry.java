package com.tatiana.geometry;

import com.tatiana.geometry.figures.Rectangle;
import com.tatiana.geometry.figures.Square;
import com.tatiana.geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args) {

        Square.printSquareArea(new Square(7.0)); // это вызов функции
        Square.printSquareArea(new Square(5.0));
        Square.printSquareArea(new Square(3.0));

        Rectangle.printRectangleArea(3.0, 5.0);
        Rectangle.printRectangleArea(7.0, 9.0);

        Triangle.printTrianglePerimeter(5.0, 7.0, 5.0);
        Triangle.printTriangleArea(5.0, 7.0, 5.0);

    }


}


