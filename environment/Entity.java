package environment;

public abstract class Entity implements Living{


    private Position position;

    public Entity( Position position){

        this.position = position;
    }




    public Position getPosition() {
        return position;
    }

}
