package com.tatiana.geometry.figures;

public record Triangle (double a, double b, double c) {

    public Triangle {
        if (a < 0 || b <0 || c <0) {
            throw new IllegalArgumentException("Triangle side should not be negative");
        }
        if ((a + b) < c || (a + c) < b || (b + c) < a) {
            throw new IllegalArgumentException("The sum of any two sides must be no less than the third side");
        }

    }

    public static void printTrianglePerimeter(double a, double b, double c) {
        var text = String.format("Периметр треугольника со сторонами %f и %f и %f = %f", a, b, c, Perimeter(a, b, c));
        System.out.println(text); // в trianglePerimeter заложена формула треугольника: сначала ввели формулу, а потом правой кнопкой Refactor > Extract method > называем как нам будет понятней
    }


    public static void printTriangleArea(double a, double b, double c) {
        var text = String.format("Площадь треугольника со сторонами %f и %f и %f " + " = " + Math.sqrt(triangleArea(a, b, c)));
        System.out.println(text);
    }

    public static double Perimeter(double a, double b, double c) {
        return a + b +c;
    }

    private static double semiPerimeter(double a, double b, double c) {
        return (a + b + c)/2;
    }

    public static double triangleArea(double a, double b, double c) {
        var p = semiPerimeter(a, b, c);
        return p * (p - a) * (p - b) * (p - c);
    }

    public double Perimeter() {
        return a + b + c;
    }

    public double triangleArea() {
        return Math.sqrt(triangleArea(a, b, c));
    }

    }







