/*
Printing Program:

Task Summary:
    - Use a traditional switch statement to print the NATO word associated with a given letter (A-E).
    - Print a default message if the letter is outside the scope

Reasoning:
    - Even though the challenge doesn't require lower case variants, I included them to simulate
    user input
    - I grouped uppercase and lower cases together (e.g., 'A' and 'a') because it looked cleaner.
    While "case 'A': case 'a':" is a valid format, stacking them vertically is more readable to me.
    - The default case technically doesn't need a break statement since the code wil "fall through"
    to the end of the switch statement. But, having the break statement makes the code snippet look
    more uniform.

NATO Words:
    A -> Able
    B -> Baker
    C -> Charlie
    D -> Dog
    E -> Easy
 */

public class Main {

    public static void main(String[] args) {
        char letter = 'e';

        // Print NATO word associated with letter
        switch (letter) {
            case 'A':
            case 'a':
                System.out.println("A is Able.");
                break;
            case 'B':
            case 'b':
                System.out.println("B is Baker.");
                break;
            case 'C':
            case 'c':
                System.out.println("C is Charlie.");
                break;
            case 'D':
            case 'd':
                System.out.println("D is Dog.");
                break;
            case 'E':
            case 'e':
                System.out.println("E is Easy.");
                break;
            default:
                System.out.println("Letter " + letter + " was not found in the switch.");
                break;
        }
    }
}
