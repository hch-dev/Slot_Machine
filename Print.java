package Slot_Machine;

import java.util.*;

class Print {

    static int num;
    double betamt;
    double balance;

    Print() {
        num = 0;
        balance = 0;
    }

    void betamt(Scanner in) {
        if (balance == 0) {
            do {
                System.out.print("Enter your starting balance: $");
                String input = in.nextLine();
                try {
                    double amt = Double.parseDouble(input);
                    if (amt > 0) {
                        balance = amt;
                        break;
                    } else {
                        System.out.println("Amount must be greater than 0");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Enter a valid amount");
                }
            } while (true);
        }

        do {
            System.out.print("Enter bet amount (Balance: $" + balance + "): $");
            String input = in.nextLine();
            try {
                double amt = Double.parseDouble(input);
                if (amt <= 0) {
                    System.out.println("Bet must be greater than 0");
                } else if (amt > balance) {
                    System.out.println("Bet cannot exceed your balance");
                } else {
                    betamt = amt;
                    balance -= betamt;
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid amount");
            }
        } while (true);
    }

    void details(Scanner in) {
        do {
            System.out.println("Enter 1 to spin the reels");
            System.out.println("Enter 2 to exit");
            String input = in.nextLine();
            if (input.equals("1"))
                break;
            else if (input.equals("2"))
                System.exit(0);
            else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Enter a valid option");
            }
        } while (true);
    }

    boolean playagain(Scanner in) {
        do {
            System.out.println("Enter 1 to play again");
            System.out.println("Enter 2 to exit");
            String input = in.nextLine();
            if (input.equals("1"))
                return true;
            else if (input.equals("2"))
                return false;
            else {
                System.out.println("Enter a valid option");
            }
        } while (true);
    }

    void printboard(int[] positions, Reel rl) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("You bet: $" + this.betamt);
        System.out.println();
        System.out.println();
        System.out.println("----------");

        for (int row = -1; row < 2; row++) {
            for (int i = 0; i < rl.num_reels; i++) {
                List<String> creel = rl.Reel_build.get(i);
                int reelsize = creel.size();
                int symbolIndex = (positions[i] + row + reelsize) % reelsize;
                System.out.print(creel.get(symbolIndex) + " ");
            }
            System.out.println();
        }

        System.out.println("----------");
    }
}
