/*
Print Day of Week Program
Task Summary:
    - Create a method named printDayOfWeek that doesn't return any values.
    - Using an enhanced switch statement, return the name of the day based on the number to a String
    named dayOfTheWeek.
    - Any number not between 0 and 6, should return "Invalid Day".
    - Print both the day variable and the dayOfTheWeek variable
    - Create a second method called printWeekDay that uses the if/else statement instead

Reasoning:
    - Since we are only evaluating a single value and assigning it to a variable, a switch expression
    is best for this.
    - When using a switch expression, a ";" after the closing {} is needed.
    - I attempted to use a traditional switch statement to assign a value to a variable, but encountered
    the error "Not a statement" because traditional switch cases can't directly return values without
    break or return statements.
    - I tried an approach where a ternary was used to determine the dayOfWeek value:
        dayOfWeek = (day > 6) ? "Invalid Day" : switch (day) {...};
      but this was unnecessary because the switch expression requires a default case anyway.
    - Although I could have printed the switch expression result directly, the challenge required
    storing the value in a variable first.

Notes:
    - Writing the printWeekDay method was more tedious and error-prone.
    - It's easy to accidentally mix up comparison (==) and assignment (=) operators
    - This challenge reinforced that switch expressions are ideal when comparing a single value against
    multiple options
    - It was also tedious to manually call the method multiple times with different arguments.

Days of Week:
0 -> Sunday
1 -> Monday
2 -> Tuesday
3 -> Wednesday
4 -> Thursday
5 -> Friday
6 -> Saturday
 */

public class Main {

    public static void main(String[] args) {
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

        System.out.println("=====================================================================");

        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);
    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println(day + " stands for " + dayOfWeek + ".");
    }

    public static void printWeekDay(int day) {
        String dayOfWeek = "Invalid Day";

        if (day == 0) {
            dayOfWeek = "Sunday";
        } else if (day == 1) {
            dayOfWeek = "Monday";
        } else if (day == 2) {
            dayOfWeek = "Tuesday";
        } else if (day == 3) {
            dayOfWeek = "Wednesday";
        } else if (day == 4) {
            dayOfWeek = "Thursday";
        } else if (day == 5) {
            dayOfWeek = "Friday";
        } else if (day == 6) {
            dayOfWeek = "Saturday";
        }

        System.out.println(day + " stands for " + dayOfWeek + ".");
    }
}
