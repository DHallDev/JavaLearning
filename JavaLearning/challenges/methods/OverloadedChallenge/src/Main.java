/*
Inches to Centimeters Conversion Program
Task:
    - Create a method called convertToCentimeters that converts inches to centimeters
    - Create an  overloaded method that converts feet and inches to centimeters
    - 1 inch = 2.54 cm
    - 12 inches = 1 foot

Reasoning:
    - Tried multiple approaches for the overloaded method
        - a. I tried to convert feet to inches then calculate the centimeters from the total inches
        using the conversion method.
        - b. I then noticed that the original method already converts inches to centimeters, so I invoked
        the first method and called the total inches from the first approach as an argument.
        - c. I tried passing the total inches expression directly into the method call, but it impacted
        readability

Notes:
    - Using the original conversion method inside the overloaded method helped reduce duplication.
    - This challenge reinforced how overloaded methods can streamline logic and improve maintainability.
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
        System.out.println("5ft 8in = " + convertToCentimeters(5,8) + "cm");
    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        int totalInches = (feet * 12) + inches;

        return convertToCentimeters(totalInches);
    }
}
