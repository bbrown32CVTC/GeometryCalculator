package edu.cvtc.java;

// Author: Bruce Brown
// Date: 2/24/2021
// Purpose: Application will run a continuous loop
// to calculate the area of a circle, rectangle, and
// triangle using the data given by the user until choice
// 4 is selected.

import java.util.Scanner;

public class GeometryCalculator {

    public static void main(String[] args) {

        // Declare variable
        int choice;


        // Runs the program on a do-while loop until selection 4 is made
        do {

            // Calls getMenuChoice method for selection
            choice = getMenuChoice();

            switch (choice) {
                case 1:

                    // Call on the static method for area calculation
                    circle();
                    break;

                case 2:

                    // Call on the static method for area calculation
                    rectangle();
                    break;

                case 3:

                    // Call on the static method for area calculation
                    triangle();
                    break;

                case 4:

                    // Display good bye message
                    System.out.println("Goodbye!");
                    break;

            }

        } while (choice != 4);

    }


    public static int getMenuChoice() {

        // Declare variables
        int menuChoice;

        // Create a Scanner object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Displays the menu options and calculator name
        System.out.println("Geometry Calculator");
        System.out.println("1. Calculate the Area of a Circle");
        System.out.println("2. Calculate the Area of a Rectangle");
        System.out.println("3. Calculate the Area of a Triangle");
        System.out.println("4. Quit");
        System.out.print("\nEnter your choice (1-4): ");
        menuChoice = keyboard.nextInt();

        // Validate input
        while (menuChoice < 1 || menuChoice > 4) {

            // Display error message and get new number
            System.out.print("\nError: Enter 1,2,3, or 4: ");
            menuChoice = keyboard.nextInt();
        }

        return menuChoice;

    }

    // Circle method for getting data from user
    public static void circle() {

        // Declare variable
        double radius;

        // Create a Scanner object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Prompt for radius
        System.out.println("Radius of the circle: ");
        radius = keyboard.nextDouble();

        // Validate input is not a negative number
        while (radius < 0.0) {
            System.out.println("Error: please enter a positive value > 0.0: ");
            radius = keyboard.nextDouble();
        }

        // Display results
        System.out.println("For a circle with a radius of " + radius
                + ", the circle's area is " + Geometry.circleArea(radius)
                + ".\n");

    }

    // Rectangle method for getting data from user
    public static void rectangle() {

        //Declare variables
        double length;
        double width;

        // Create a Scanner object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Prompt for length
        System.out.println("Length of the rectangle: ");
        length = keyboard.nextDouble();

        // Validate input is not a negative number
        while (length < 0.0) {
            System.out.println("Error: please enter a positive value > 0.0: ");
            length = keyboard.nextDouble();
        }

        // Prompt for width
        System.out.println("Width of the rectangle: ");
        width = keyboard.nextDouble();

        // Validate input is not a negative number
        while (width < 0.0) {
            System.out.println("Error: please enter a positive value > 0.0: ");
            width = keyboard.nextDouble();
        }

        // Display results
        System.out.println("For a rectangle with a length of " + length
                + " and width of " + width + ", the rectangle's area is "
                + Geometry.rectangleArea(length, width) + ".\n");

    }

    // Triangle method for getting data from user
    public static void triangle() {

        // Declare Variables
        double baseLength;
        double height;

        // Create a Scanner object for the keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Prompt for base length
        System.out.println("Base length of the triangle: ");
        baseLength = keyboard.nextDouble();

        // Validate input is not a negative number
        while (baseLength < 0.0) {
            System.out.println("Error: please enter a positive value > 0.0: ");
            baseLength = keyboard.nextDouble();
        }

        // Prompt for height
        System.out.println("Height of the triangle: ");
        height = keyboard.nextDouble();

        // Validate input is not a negative number
        while (height < 0.0) {
            System.out.println("Error: please enter a positive value > 0.0: ");
            height = keyboard.nextDouble();
        }

        // Display results
        System.out.println("For a triangle with a base length of " + baseLength
                + " and height of " + height + ", the triangle's area is "
                + Geometry.triangleArea(baseLength, height) + ".\n");

    }

}
