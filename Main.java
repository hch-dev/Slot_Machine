package Slot_Machine;

class Main {

    public static void main(String args[]) {
        Print pr = new Print();
        System.out.print("\033[H\033[2J"); // Clears terminal
        System.out.flush();
        System.out.println(pr.firstrun());
    }
}