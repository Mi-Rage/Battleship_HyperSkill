import java.util.Scanner;

public class Game {

    public void start() {

        boolean isGameOver = false;
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        System.out.println("Player 1, place your ships on the game field");
        player1.battlefield.initfield();
        changeTurn();

        System.out.println("Player 2, place your ships on the game field");
        player2.battlefield.initfield();
        changeTurn();

        //Until the game is over
        while (!isGameOver) {
            //printing the enemy field with the fog of war
            player2.battlefield.printBattlefield(true);
            System.out.println("---------------------");
            //printing the current player's field without the fog of war
            player1.battlefield.printBattlefield(false);
            System.out.println("Player 1, it's your turn:");
            //make turn
            isGameOver = player2.battlefield.makeShot();
            if (isGameOver) {
                break;
            }
            changeTurn();
            //printing the enemy field with the fog of war
            player1.battlefield.printBattlefield(true);
            System.out.println("---------------------");
            //printing the current player's field without the fog of war
            player2.battlefield.printBattlefield(false);
            System.out.println("Player 2, it's your turn:");
            //make turn
            isGameOver = player1.battlefield.makeShot();
            if (isGameOver) {
                break;
            }
            changeTurn();
        }
    }

    /**
     * Changing the move while waiting for the ENTER key to be pressed
     */
    public void changeTurn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter and pass the move to another player");
        scanner.nextLine();
    }
}
