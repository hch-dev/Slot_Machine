package Slot_Machine;

import java.util.*;

public class Reel {

    public HashMap<String, Integer> reel3;
    public HashMap<String, Integer> reel2;
    public HashMap<String, Integer> reel1;

    Reel() {
        reel3 = new HashMap<>();
        reel3.put("7️⃣", 10);
        reel3.put("💎", 49);
        reel3.put("🪙", 64);
        reel3.put("♠️", 94);
        reel3.put("🔔", 212);
        reel3.put("🧨", 308);
        reel3.put("🍒", 287);

        reel2 = new HashMap<>();
        reel2.put("7️⃣", 12);
        reel2.put("💎", 48);
        reel2.put("🪙", 68);
        reel2.put("♠️", 96);
        reel2.put("🔔", 201);
        reel2.put("🧨", 315);
        reel2.put("🍒", 284);

        reel1 = new HashMap<>();
        reel1.put("7️⃣", 14);
        reel1.put("💎", 51);
        reel1.put("🪙", 62);
        reel1.put("♠️", 102);
        reel1.put("🔔", 218);
        reel1.put("🧨", 304);
        reel1.put("🍒", 273);
    }
}