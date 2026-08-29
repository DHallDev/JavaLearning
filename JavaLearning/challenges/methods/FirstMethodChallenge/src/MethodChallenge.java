public class MethodChallenge {

    public static void main(String[] args) {
        /*
        1a. Created variables individually to add meaning to parameters and avoid magic numbers.
         */

        String playerOne = "Darius";
        String playerTwo = "Jazmon";
        String playerThree = "Alyx";
        String playerFour = "Shyann";
        String playerFive = "Dad";
        int playerOneScore = 1500;
        int playerTwoScore = 1000;
        int playerThreeScore = 500;
        int playerFourScore = 100;
        int playerFiveScore = 25;

        /*
        1a. Tried a display method where the message is printed by using playerName variable and
        the return value of the calculatePosition method as parameters.

        displayHighScorePosition(playerOne, calculateHighScorePosition(playerOneScore));
        displayHighScorePosition(playerTwo, calculateHighScorePosition(playerTwoScore));
        displayHighScorePosition(playerThree, calculateHighScorePosition(playerThreeScore));
        displayHighScorePosition(playerFour, calculateHighScorePosition(playerFourScore));
        displayHighScorePosition(playerFive, calculateHighScorePosition(playerFiveScore));

         */

        /*
        1b. Decided to pass playerName and playerScore as parameters. New method will
        now calculate playerPostion inside. More organized due to one method
        doing the entirety of the work instead of calling a method half of work then pass that result
        to another to finish.
         */

        displayHighScorePosition(playerOne, playerOneScore);
        displayHighScorePosition(playerTwo, playerTwoScore);
        displayHighScorePosition(playerThree, playerThreeScore);
        displayHighScorePosition(playerFour, playerFourScore);
        displayHighScorePosition(playerFive, playerFiveScore);
    }

    /*
    1a. Display method with the main focus being printing the message

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition +
                " on the high score list.");
    }

     */

    /*
    1b. Put calculation inside display method due to method needing to know the high score position.
     */

    public static void displayHighScorePosition(String playerName, int playerScore) {
        int highScorePosition = calculateHighScorePosition(playerScore);

        System.out.println(playerName + " managed to get into position " + highScorePosition +
                " on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int highScorePosition = 4;

        if (playerScore >= 1000) {
            highScorePosition = 1;
        } else if (playerScore >= 500) {
            highScorePosition = 2;
        } else if (playerScore >= 100) {
            highScorePosition = 3;
        }

        /*
        1a. Tried a ternary approach in an attempt to make return statement more concise. Ultimately
        made it less readable.

        return playerScore >= 1000 ? 1 :
               playerScore >= 500 ? 2 :
               playerScore >= 100 ? 3 : 4;

         */

        return highScorePosition;
    }
}
