package Slot_Machine;

import java.util.*;

public class Print {

    static int num; // Number of games played
    double betamt; // Bet amount

    Print() {
        num = 0;
    }

    public String firstrun() {
        return """
                ******************************
                ******** SLOT MACHINE ********
                ******************************
                """;
    }

    public void details() {
        Scanner in = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter bet amount: ");
                String input = in.nextLine(); // Accepts the bet amount
                if (!Character.isDigit(input.charAt(input.length() - 1)))
                    throw new NumberFormatException("Error");
                // Checks if the last character is a digit
                betamt = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.print("\033[H\033[2J"); //Clears terminal
                System.out.flush();
                System.out.println("Enter a valid number");
            }
        }

        do {
            System.out.println("Enter 1 to spin the reels");
            System.out.println("Enter 2 to exit");
            String input = in.nextLine();
            if (input.equals("1"))
                break;
            else if (input.equals("2"))
                System.exit(0);
            else {
                System.out.print("\033[H\033[2J"); //Clears terminal
                System.out.flush();
                System.out.println("Enter a valid option");
            }
        } while (true);
        // Accepts only valid answers
        in.close();
    }

    public void board() {

    }
}