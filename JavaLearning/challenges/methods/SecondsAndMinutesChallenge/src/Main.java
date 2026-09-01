/*
Seconds and Minutes Conversion Program
Task Summary:
    - Create a method that converts a total number of seconds to hours, minutes, and leftover seconds.
    - Create an overloaded method that converts minutes and seconds to hours, minutes, and leftover
    seconds.
    - Output format should be "XXh YYm ZZs".
    - Add Validation
        - First method: Seconds must be 0 or greater
        - Second method: Minutes must be 0 or greater AND Seconds must be between 0 and 59.

Reasoning:
- For the first method I tried multiple approaches:
    - 1a. Breaking down seconds to its respective values: Hours, Minutes, remainingSeconds.
    - 1b. Break down seconds into Minutes and remainingSeconds then pass to the overloaded method
    - 1c. Breakdown seconds directly into the overloaded method call (more concise, but impacted
    readability)
    - 1d. Use a ternary for validation and the overloaded method call, (heavily impacted
    readability)
- For overloaded method I tried a nested ternary, but that had a severe impact on readability

Notes:
- Found using another method to do the work helped streamline the code and reduce code duplication.
- When creating Validation message, be as specific as possible so that the user knows what caused the
error
 */

public class Main {

    public static void main(String[] args) {
        String firstTestCase = getDurationString(3945);
        String secondTestCase = getDurationString(65,45);
        String thirdTestCase = getDurationString(-3945);
        String fourthTestCase = getDurationString(-65,45);

        System.out.println(firstTestCase);
        System.out.println(secondTestCase);
        System.out.println(thirdTestCase);
        System.out.println(fourthTestCase);

        String fifthTestCase = getDurationString(60, 458);
        System.out.println(fifthTestCase);

        String sixthTestCase = getDurationString(60,-59);
        System.out.println(sixthTestCase);
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid seconds parameter (" + seconds + "), must be a positive integer value.";
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid minutes (" + minutes + "), must be a positive integer value.";
        } else if (seconds < 0 || seconds > 59) {
            return "Invalid seconds (" + seconds + "), must be between the values of 0 and 59.";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}