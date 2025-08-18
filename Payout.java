package Slot_Machine;

import java.util.*;

public class Payout {

    HashMap<String, Integer> payout3; // Stores payout structure
    double payout2; // Stores payout for 2 of a kind
    String type; // Stores the type of final result

    Payout() {
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
        if (win[0].equals(win[1]) && win[1].equals(win[2]))
            type = "Three";
        else if (!win[0].equals(win[1]) && !win[1].equals(win[2]) && !win[0].equals(win[2]))
            type = "None";
        else
            type = "Two";
    }

    void finalamt() {
        
    }
}