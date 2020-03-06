package environment;

public abstract class Entity implements Living{

    private int energy;
    private int speed;
    private int size;
    private Position position;

    public Entity(int energy, int speed, int size, Position position){
        this.energy = energy;
        this.speed = speed;
        this.size = size;
        this.position = position;
    }

    public Entity() {

    }


    public int getEnergy() {
        return energy;
    }

    public int getSize() {
        return size;
    }

    public int getSpeed() {
        return speed;
    }

    public Position getPosition() {
        return position;
    }

}
