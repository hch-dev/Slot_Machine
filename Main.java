package Slot_Machine;

import java.util.*;

class Main {

    static String[] symbol;

    Main() {
        String[] symbol = new String[] { "7️⃣", "💎", "🪙", "♠️", "🔔", "🧨", "🍒" };
    }

    public static void main(String args[]) {
        Print pr = new Print();
        System.out.print("\033[H\033[2J"); // Clears terminal
        System.out.flush();
        System.out.println(pr.firstrun());
    }
}