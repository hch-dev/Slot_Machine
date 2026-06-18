package Slot_Machine;

import java.util.*;

class Reel extends Main {

    static int[][] reel_weights;
    static int num_reels = 0;
    private static String[] sym;

    Print pr;
    static List<List<String>> Reel_build = new ArrayList<>();

    Reel(Print pr) {
        this.pr = pr;
        num_reels = 3;

        sym = Main.symbol;

        reel_weights = new int[][] {
                { 14, 51, 62, 102, 218, 304, 273},
                { 12, 48, 68, 96, 201, 315, 284},
                { 10, 49, 64, 94, 212, 308, 287}};

        buildreels();
    }

    void buildreels() {
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

    public String[] spinreels() throws InterruptedException {
        Random rand = new Random();
        int[] positions = new int[num_reels];
        int[] speed = { 20, 25, 30 };

        for (int i = 0; i < num_reels; i++) {
            positions[i] = rand.nextInt(Reel_build.get(i).size());
        }

        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < num_reels; j++) {
                if (i < speed[j])
                    positions[j] = (positions[j] - 1 + Reel_build.get(j).size()) % Reel_build.get(j).size();
            }
            pr.printboard(positions, this);
            Thread.sleep(100 + i * 5);
        }

        System.out.println("Final Result:");
        pr.printboard(positions, this);
        String[] result = new String[num_reels];
        for (int i = 0; i < num_reels; i++) {
            result[i] = Reel_build.get(i).get(positions[i]);
        }

        return result;
    }
}
