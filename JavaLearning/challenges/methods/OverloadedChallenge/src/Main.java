/*
Conversion Program:
Task:
    - Create a method that converts inches to centimeters
    - Create a overloaded method that converts feet and inches to centimeters
    - 1in = 2.54cm
 */

public class Main {

    public static void main(String[] args) {
        //TODO: invoke both methods using 68in and 5ft, 8in as test cases
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
        System.out.println("5ft 8in = " + convertToCentimeters(5,8) + "cm");
    }

    // Convert inches to centimeters
    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    // Convert feet & inches to centimeters
    public static double convertToCentimeters(int feet, int inches) {
        /*
        1a. First approach was to convert feet to inches then calculate cm from the total inches
        int totalInches = (feet * 12) + inches;

        return totalInches = 2.54;
         */

        /*
        1b. Noticed that the original method converts in to cm
        int totalInches = (feet * 12) + inches;

        return convertToCentimeters(totalInches);
         */

        /*
        1c. Can pass expression directly into method call, unsure if conciseness is worth the impact
        on readability
        return convertToCentimeters((feet * 12) + inches);
         */

        int totalInches = (feet * 12) + inches;

        return convertToCentimeters(totalInches);
    }
}
