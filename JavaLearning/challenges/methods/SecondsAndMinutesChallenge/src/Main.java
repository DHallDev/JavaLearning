/*
    Conversion Program:
    Task:
        - Create a method that converts seconds to hours, minutes, and seconds.
        - Create an overloaded method that converts minutes and seconds to hours, minutes, and seconds.
        - Format should be "XXh YYm ZZs" (X = # of hours Y = # of minutes and Z = # of seconds).
        - Add Validation
            - First method: Seconds parameter can only be 0 or greater
            - Second method: Minutes parameter can only be 0 or greater and Seconds parameter can only
              be between 0 and 59.
 */

public class Main {

    public static void main(String[] args) {
        //TODO: invoke both methods using 3945, -3945, 65mins 45s, and -65mins 45s as parameters
        String firstTestCase = getDurationString(3945);
        String secondTestCase = getDurationString(-3945);
        String thirdTestCase = getDurationString(65,45);
        String fourthTestCase = getDurationString(-65,45);

        System.out.println(firstTestCase);
        System.out.println(secondTestCase);
        System.out.println(thirdTestCase);
        System.out.println(fourthTestCase);

        String fifthTestCase = getDurationString(60, 458); // Test case for over 59s
        System.out.println(fifthTestCase);

        String sixthTestCase = getDurationString(60,-59); // Test case for under 0s
        System.out.println(sixthTestCase);
    }

    // Convert seconds to hours, minutes, and seconds
    public static String getDurationString(int seconds) {
        // Validation message for seconds
        if (seconds < 0) {
            return "Invalid seconds parameter (" + seconds + ")";
        }

        /*
        1a. Break down seconds to its respective values: Hours, Minutes, Seconds.
            NOTE: in order get the actual minutes you need to get the remainder minutes
                  after getting total minutes for hours.
            NOTE: Shouldn't use actual seconds as the parameter passed to return statement since it will
            just pass whole amount

        int minutes = seconds / 60;
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        int remainingSeconds = seconds % 60;

        1b. Overloaded method already does most of the work, just pass minutes, and remainingSeconds:

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);

        1c. Pass expressions directly into method call for more conciseness with an negative impact
        on readability:

        return getDurationString((seconds / 60), (seconds % 60));

        1d. Instead of an if statement to check for validation, could use a ternary. Definitely
        affects readability:

        return (seconds < 0) ? "Invalid seconds parameter (" + seconds + ")" :
                getDurationString((seconds / 60), (seconds % 60));
         */

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

    // Convert minutes and seconds to hours, minutes, and seconds
    public static String getDurationString(int minutes, int seconds) {
        // Validation message for minutes and seconds
        if (minutes < 0) {
            return "Invalid minutes (" + minutes + ")";
        } else if (seconds < 0 || seconds > 59) {
            return "Invalid seconds (" + seconds + ")";
        }

        /*
        1a. Take the calculation from the original method:

        int minutes = seconds / 60; -> take this out since minutes is already a parameter
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60; -> take this away since seconds is already a parameter
                                                and seconds can't be greater than 59

        int remainingSeconds = seconds % 60;

        1b. Use a nested ternary with a severe impact on readability:

        return (minutes < 0) ? "Invalid minutes (" + minutes + ")" :
               (seconds < 0 || seconds > 59)  ? "Invalid seconds (" + seconds + ")" :
                hours + "h " + remainingMinutes + "m " + seconds + "s";
         */


        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}