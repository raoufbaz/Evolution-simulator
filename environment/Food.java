package environment;

public class Food {
private int energy;
private Position position;

public Food(){
    energy =10;
}

    public int getEnergy() {
        return energy;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
