package launcher;

import userInterface.Ui;

public class Launcher {
    public static void main(String[] args) {
        Thread t = new Thread(new Ui());
        t.run();
    }
}
