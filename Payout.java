package Slot_Machine;

import java.util.*;

public class Payout {

    public static HashMap<String, Integer> payout3;
    public static double payout2;

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
}
