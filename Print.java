package Slot_Machine;

import java.util.*;

public class Print {

    static int num; // Number of games played
    double betamt; // Bet amount

    Print() {
        num = 0;
    }

    public static String firstrun() {
        return """
                ******************************
                ******** SLOT MACHINE ********
                ******************************
                """;
    }

    public void playgame() {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter bet amount: ");
                String input = in.nextLine(); // Accepts the bet amount
                if (!Character.isDigit(input.charAt(input.length() - 1)))
                    throw new NumberFormatException("Error");
                    //Checks if the last character is a digit
                betamt = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number");
            }
        }
    }
}