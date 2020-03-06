package userInterface;

import environment.Creature;
import environment.Food;
import environment.Position;
import environment.World;

import javax.swing.*;
import java.awt.*;

public class Visual extends JPanel {
    private World world;

    public Visual(World world){
        this.world = world;
    }

    public void paintComponent(Graphics g) {
        int x = 0;
        int y = 0;
        int largeurX = this.getBounds().width / 10;
        int hauteurY = this.getBounds().height / 10;


        g.setColor(Color.BLACK);


        // met le pinceau en pointiller
        Graphics2D g2 = (Graphics2D) g;
        Stroke dashed = new BasicStroke(0, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 9 }, 0);
        Stroke full = new BasicStroke();

        g2.setStroke(dashed);



        g.setColor(Color.GREEN);

        drawFood(g,world.getFoods().getFirst());
    }


    public void drawFood(Graphics g, Food food) {
        g.fillOval(50,50, 10, 10);

    }
}
