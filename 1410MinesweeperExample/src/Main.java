import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Mine Sweeper!");

        System.out.print("Enter the width and height of the game, (eg, 10 10): ");
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        System.out.print("Enter the number of mines: ");
        int numMines = scanner.nextInt();

        Game game = new Game(width, height, numMines);
        while(!game.isLost() && !game.isWon()) {

            System.out.println("Controls");
            System.out.println("==============================");
            System.out.println("Select Cell: s <row> <col>");
            System.out.println("Toggle Flag: f <row> <col>");
//            game.displayGame();

            String command = scanner.nextLine();
            String[] parts = command.split(" ");
            if (parts.length != 3) {
                System.out.println("Invalid command");
                continue;
            }

            try {
                int row = Integer.parseInt(parts[1]);
                int col = Integer.parseInt(parts[2]);
                if (parts[0].equalsIgnoreCase("s")) {
                    game.selectCell(row, col);
                } else if (parts[0].equalsIgnoreCase("f")) {
                    game.flagCell(row, col);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Command");
            } catch (Game.OutOfGameAreaException e) {
                System.out.println(e.getMessage());
            }
        }

//        game.displayGame();

        if (game.isWon()) {
            System.out.println("You win!");
        } else {
            System.out.println("You lost");
        }
    }
}