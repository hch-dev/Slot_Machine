package Slot_Machine;

import java.util.*;

public class Reel {

    public static int[][] reel_weights; // Weights of each symbol in each reel
    public final int num_reels; // Number of reels
    private static String[] sym;

    Main obj = new Main();
    static List<List<String>> Reel_build = new ArrayList<>();

    Reel() {
        num_reels = 3;

        sym = Main.symbol;
        
        reel_weights = new int[][] {
                { 14, 51, 62, 102, 218, 304, 273 },
                { 12, 48, 48, 96, 201, 315, 284 },
                { 10, 49, 64, 94, 212, 308, 287 } };

        buildreels();
    }

    void buildreels() {
        // Builds virtual reels according to the symbols and their weights
        for (int[] rw : reel_weights) {
            List<String> reel = new ArrayList<String>();
            for (int i = 0; i < sym.length; i++) {
                for (int j = 0; j < rw[i]; j++) {
                    reel.add(sym[i]);
                }
            }
            Collections.shuffle(reel);
            Reel_build.add(reel);
        }
    }
}