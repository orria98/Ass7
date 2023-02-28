public class RockPaperScissors {

    // Method to assign random number to rock, paper, or scissors
    public static String randomChoice() {
        int randomNumber = (int) (Math.random() * 3);
        if (randomNumber == 0) {
            return "rock";
        } else if (randomNumber == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }
    
    // Method to assign random number to player1 and player2
    public String play(String player1, String player2)
    {
        String result = "";

        // Call randomChoice method to assign random number to player1 and player2
        String player1Choice = randomChoice();
        String player2Choice = randomChoice();
        // Check who won
        if (player1Choice.equals(player2Choice)) {
            // Print player's choices
            System.out.println(player1 + " chose " + player1Choice + " and " + player2 + " chose " + player2Choice);
            result = "Tie!";
        } else if (player1Choice.equals("rock")) {
            if (player2Choice.equals("scissors")) {
                System.out.println(player1 + " chose " + player1Choice + " and " + player2 + " chose " + player2Choice);
                result = "Player 1 wins!";
            } else {
                System.out.println(player1 + " chose " + player1Choice + " and " + player2 + " chose " + player2Choice);
                result = "Player 2 wins!";
            }
        } else if (player1Choice.equals("paper")) {
            if (player2Choice.equals("rock")) {
                System.out.println(player1 + " chose " + player1Choice + " and " + player2 + " chose " + player2Choice);
                result = "Player 1 wins!";
            } else {
                System.out.println(player1 + " chose " + player1Choice + " and " + player2 + " chose " + player2Choice);
                result = "Player 2 wins!";
            }
        } else if (player1Choice.equals("scissors")) {
            if (player2Choice.equals("paper")) {
                System.out.println(player1 + " chose " + player1Choice + " and " + player2 + " chose " + player2Choice);
                result = "Player 1 wins!";
            } else {
                System.out.println(player1 + " chose " + player1Choice + " and " + player2 + " chose " + player2Choice);
                result = "Player 2 wins!";
            }
        }
        return result;

    }
        
    public static void main(String[] args) {
        // Create a new game
        RockPaperScissors game = new RockPaperScissors();
        // Call play method to play the game
        System.out.println(game.play("Player 1", "Player 2"));
    }
}
