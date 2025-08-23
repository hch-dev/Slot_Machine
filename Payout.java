package Slot_Machine;

import java.util.*;

class Payout {

    HashMap<String, Integer> payout3; // Stores payout structure
    double payout2; // Stores payout for 2 of a kind
    Print pr;

    Payout(Print pr) {
        pr = this.pr;
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
            pr.betamt = (double) (payout3.get(win[0])) * pr.betamt;
            System.out.println("You won $" + pr.betamt);
        } else if (!win[0].equals(win[1]) && !win[1].equals(win[2]) && !win[0].equals(win[2])) {
            System.out.printf("You lose "+ pr.betamt);
        } else {
            pr.betamt = (double) (1.17 * pr.betamt);
            System.out.println("You won $" + pr.betamt);
        }
    }
}