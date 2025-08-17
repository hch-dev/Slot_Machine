package Slot_Machine;

import java.util.*;

class Main {

    static String[] symbol = { "7️⃣", "💎", "🪙", "♠️", "🔔", "🧨", "🍒" };

    public static void main(String args[]) throws InterruptedException {
        Reel pr = new Reel();
        System.out.print("\033[H\033[2J"); // Clears terminal
        System.out.flush();
        int reelNum = 1;
        for (List<String> reel : Reel.Reel_build) {
            int count = 0;
            System.out.print("Reel " + reelNum++ + ": ");
            for (String val : reel) {
                System.out.print(val + " ");
                ++count;
            }
            System.out.println(count);
            System.out.println();
        }

        Print obj = new Print();

        pr.spinreels();
    }
}