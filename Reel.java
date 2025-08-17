package Slot_Machine;

import java.util.*;

public class Reel extends Main {

    public static int[][] reel_weights; // Weights of each symbol in each reel
    public static int num_reels = 0;
    private static String[] sym;

    Print pr = new Print();
    static List<List<String>> Reel_build = new ArrayList<>();

    Reel() {
        num_reels = 3;

        sym = Main.symbol;

        reel_weights = new int[][] {
                { 14, 51, 62, 102, 218, 304, 273 },
                { 12, 48, 68, 96, 201, 315, 284 },
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

    public int[] spinreels() throws InterruptedException { // For Thread.sleep()
        Random rand = new Random();
        int[] positions = new int[num_reels]; // Stores staring posiotion of reels
        int[] speed = { 20, 25, 30 }; // Speed of each reel

        for (int i = 0; i < num_reels; i++) { // Initializes the starting postion
            positions[i] = rand.nextInt(Reel_build.get(i).size());
        }

        for (int i = 0; i < 30; i++) {
            // 30 is the maximum number of spins
            for (int j = 0; j < num_reels; j++) {
                if (i < speed[j])
                    // Checks if current speed is less than number assigned for speed to the reel
                    positions[j] = (positions[j] + 1) % Reel_build.get(j).size();

                // Gets the next symbol of the reel

            }
            pr.printboard(positions, this);
            Thread.sleep(100 + i * 5);
        }

        System.out.println("Final Result:");
        pr.printboard(positions, this); // Display the final stationary result.
        return positions;

    }
}