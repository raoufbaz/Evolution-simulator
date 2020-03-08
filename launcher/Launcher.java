package launcher;

import userInterface.Ui;

public class Launcher {
    public static void main(String[] args) {
        Thread t = new Thread(new Ui());
        t.run();
    }


    /** No mutations
     *
     * if fails to find food = death
     * if finds 1 food = live
     * if finds 2 food = reproduce
     *
     *
     *
     */
}
