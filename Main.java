package Slot_Machine;

import java.util.*;

class Main {

    static String[] symbol = { "7️⃣", "💎", "🪙", "♠️", "🔔", "🧨", "🍒" };

    public static void main(String args[]) throws InterruptedException {
        Reel rl = new Reel();
        Print pr = new Print();
        
        String[] win = rl.spinreels();
        System.out.println(win[0]);
        System.out.println(win[1]);
        System.out.println(win[2]);

    }
}