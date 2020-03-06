package environment;

import javafx.geometry.Pos;

public class Creature extends Entity {

    Creature(){
        this(10,1,5,new Position(100,100));
    }
    Creature(int energy, int speed, int size, Position position){
        super(energy, speed, size, position);
    }

    @Override
    public void move() {

    }

    @Override
    public void eat(Food f) {

    }

    @Override
    public Entity replicate() {
        return null;
    }
}
