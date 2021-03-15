package edu.cvtc.java;

// Author: Bruce Brown
// Date: 2/24/2021
// Purpose: Class will calculate the area of
// a circle, rectangle, and triangle using the data given
// by the user.

public class Geometry {

    // Calculate the area of a circle
    public static double circleArea(double radius) {

        return Math.PI * Math.pow(radius, 2.0);

    }

    // Calculate the area of a rectangle
    public static double rectangleArea(double length, double width) {

        return length * width;

    }

    // Calculate the area of a triangle
    public static double triangleArea(double baseLength, double height) {

        return baseLength * height * 0.5;

    }


}
