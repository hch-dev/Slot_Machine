package Slot_Machine;

import java.util.*;

class Print {

    static int num; // Number of games played
    double betamt; // Bet amount

    Print() {
        num = 0;
    }

    public String firstrun() {
        return """
                ******************************
                ******* DESTINY SLOTS ********
                ******************************
                """;
    }

    void details(Scanner in) {
        do {
            try {
                System.out.print("Enter bet amount: ");
                String input = in.nextLine().trim(); // Accepts the bet amount
                if (!Character.isDigit(input.charAt(input.length() - 1)))
                    throw new NumberFormatException("Error");
                // Checks if the last character is a digit
                this.betamt = Double.parseDouble(input);
                if (betamt < 1) {
                    System.out.println("Bet amount should be greater than 0");
                    throw new NumberFormatException("Bet amount less than 1");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.print("\033[H\033[2J"); // Clears terminal
                System.out.flush();
                System.out.println("Enter a valid number");
            }
        } while (betamt <= 0);

        do {
            System.out.println("Enter 1 to spin the reels");
            System.out.println("Enter 2 to exit");
            String input = in.nextLine();
            if (input.equals("1"))
                break;
            else if (input.equals("2"))
                System.exit(0);
            else {
                System.out.print("\033[H\033[2J"); // Clears terminal
                System.out.flush();
                System.out.println("Enter a valid option");
            }
        } while (true);
        // Accepts only valid answers
    }

    void printboard(int[] positions, Reel rl) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("You bet: " + this.betamt);
        System.out.println();
        System.out.println();
        System.out.println("-------------");

        for (int row = -1; row < 2; row++) { // Loops through 3 rows (top, middle, bottom)
            for (int i = 0; i < rl.num_reels; i++) { // Loops through each reel
                List<String> creel = rl.Reel_build.get(i); // Stores each reel
                int reelsize = creel.size();
                int symbolIndex = (positions[i] + row + reelsize) % reelsize;
                System.out.print(creel.get(symbolIndex) + " ");
            }
            System.out.println("-------------");
        }
    }
}