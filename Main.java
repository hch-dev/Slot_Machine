package Slot_Machine;

import java.util.*;

class Main {

    static String[] symbol = { "7️⃣", "💎", "🪙", "♠️", "🔔", "🧨", "🍒" };

    public static void main(String args[]) throws InterruptedException {
        Scanner in = new Scanner(System.in);

        Print pr = new Print();
        Reel rl = new Reel(pr);
        Payout py = new Payout(pr);
        System.out.println("\n\n");

        do {
            pr.betamt(in);
            pr.details(in);

            String[] win = rl.spinreels();

            py.result(win);
            Print.num++;

            System.out.println("\nBalance: $" + pr.balance);
            System.out.println("Games played: " + Print.num);
            System.out.println();

            if (pr.balance <= 0) {
                System.out.println("You're out of money. Game over.");
                break;
            }

        } while (pr.playagain(in));

        in.close();
    }
}
