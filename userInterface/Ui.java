package userInterface;

import environment.World;

import javax.swing.*;
import java.awt.*;

public class Ui extends JFrame implements Runnable {

    private Visual visual;
    private ControlPanel controlPanel;
    private PrincipalPanel panel;
    private World world;

    public Ui(){
        this.controlPanel = new ControlPanel();
        this.world = new World(1,10);
        this.visual = new Visual(world);
        initAll();
    }

    private void initAll() {
        panel = new PrincipalPanel(visual, controlPanel);
        panel.setBounds(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        panel.setBackground(Color.lightGray);
        setContentPane(panel);
        setSize(1000, 800);
        setResizable(false);
        setVisible(true);
    }


    public void run() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
