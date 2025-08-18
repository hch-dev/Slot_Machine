package Slot_Machine;

import java.util.*;

public class Payout {

    public static HashMap<String, Integer> payout3; // Stores payout structure
    public static double payout2; // Stores payout for 2 of a kind
    String type; // Stores the type of final result

    Payout() {
        payout2 = 0.0;

        payout3.put("7️⃣", 500);
        payout3.put("💎", 200);
        payout3.put("🪙", 100);
        payout3.put("♠️", 68);
        payout3.put("🔔", 20);
        payout3.put("🧨", 10);
        payout3.put("🍒", 5);
    }

    void result(String[] win) {
        if (win[0].equals(win[1]) && win[1].equals(win[2]))
            type = "Three";
        else if (!win[0].equals(win[1]) && !win[1].equals(win[2]) && !win[0].equals(win[2]))
            type = "None";
        else
            type = "Two";
    }
}