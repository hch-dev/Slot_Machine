package Slot_Machine;

import java.util.*;

class Payout {

    HashMap<String, Integer> payout3;
    double payout2;
    Print pr;

    Payout(Print pr) {
        this.pr = pr;
        this.payout2 = 1.17;

        this.payout3 = new HashMap<>();
        this.payout3.put("7️⃣", 500);
        this.payout3.put("💎", 200);
        this.payout3.put("🪙", 100);
        this.payout3.put("♠️", 68);
        this.payout3.put("🔔", 20);
        this.payout3.put("🧨", 10);
        this.payout3.put("🍒", 5);
    }

    void result(String[] win) {
        if (win[0].equals(win[1]) && win[1].equals(win[2])) {
            double winnings = (double) (payout3.get(win[0])) * pr.betamt;
            pr.balance += winnings;
            System.out.println("You won $" + winnings);
        } else if (!win[0].equals(win[1]) && !win[1].equals(win[2]) && !win[0].equals(win[2])) {
            System.out.println("You lose $" + pr.betamt);
        } else {
            double winnings = (double) (payout2 * pr.betamt);
            pr.balance += winnings;
            System.out.println("You won $" + winnings);
        }
    }
}
