package environment;


import java.util.LinkedList;

public class Creature extends Entity {

    private LinkedList<Food> foodGathered;

    Creature(){
        this(new Position(100,100));
    }
    Creature( Position position){
        super(position);
        foodGathered = new LinkedList<>();
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

    @Override
    public Position findFood() {
        return null;
    }

    
}
