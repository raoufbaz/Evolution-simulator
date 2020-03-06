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

        g.setColor(Color.BLACK);


        // met le pinceau en pointiller
        Graphics2D g2 = (Graphics2D) g;
        Stroke dashed = new BasicStroke(0, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 9 }, 0);
        Stroke full = new BasicStroke();

        g2.setStroke(dashed);

        g.setColor(Color.YELLOW);
        for (int i = 0; i < world.getFoods().size() ; i++) {
            int randomX = (int) (Math.random() * (getWidth() + 1));
            int randomY = (int) (Math.random() * (getHeight() + 1));
            world.getFoods().get(i).setPosition(new Position(randomX,randomY));

            drawFood(g,world.getFoods().get(i), randomX, randomY);
        }
        g.setColor(Color.blue);
        for (int i = 0; i < world.getCreatures().size() ; i++) {
            drawCreature(g, world.getCreatures().get(i));
        }
    }

    public void drawFood(Graphics g, Food food, int x, int y) {
        g.fillRect(x,y, 10, 10);
    }
    public void drawCreature(Graphics g, Creature creature) {
        g.fillOval(creature.getPosition().getX(),creature.getPosition().getY(), 20, 20);
        g.fillOval(creature.getPosition().getX()+4,creature.getPosition().getY()-8, 12, 12);
        g.setColor(Color.white);
        g.fillOval(creature.getPosition().getX()+7,creature.getPosition().getY()-5, 2, 2);
        g.fillOval(creature.getPosition().getX()+11,creature.getPosition().getY()-5, 2, 2);

    }


}
