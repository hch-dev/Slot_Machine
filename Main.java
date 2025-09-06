package Slot_Machine;

import java.util.*;

class Main {

    static String[] symbol = { "7️⃣", "💎", "🪙", "♠️", "🔔", "🧨", "🍒" };

    public static void main(String args[]) throws InterruptedException {
        Scanner in = new Scanner(System.in);

        Print pr = new Print();
        Reel rl = new Reel(pr);
        Payout py = new Payout(pr);

        System.out.println(pr.firstrun());
        pr.details(in);

        String[] win = rl.spinreels();
        System.out.println(win[0]);
        System.out.println(win[1]);
        System.out.println(win[2]);

        py.result(win);
        in.close();
    }
}