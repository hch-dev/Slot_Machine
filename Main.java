package Slot_Machine;

import java.util.*;

class Main {

    static String[] symbol = { "7️⃣", "💎", "🪙", "♠️", "🔔", "🧨", "🍒" };

    public static void main(String args[]) throws InterruptedException {
        Reel pr = new Reel();
        Print obj = new Print();

        pr.spinreels();
        for(int i = 0; i<3; i++) {
            System.out.println(obj.winner[i]);
        }
    }
}