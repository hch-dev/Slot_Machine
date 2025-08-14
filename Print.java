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
                betamt = Double.parseDouble(in.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number");
            }
        }

        System.out.println("Enter 1 to spin the reels");
        System.out.println("Enter 2 to exit");
        int ch = in.nextInt();
        if (ch == 3)
            System.exit(0);
        in.close();
    }
}