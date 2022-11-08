package Lesson10;

public abstract class Animals {
    protected String AnimalsName;
    protected int Speed;

    public Animals() {
    }
    public Animals (String AnimalsName, int Speed){
        this.AnimalsName = AnimalsName;
        this.Speed = Speed;
    }
    public String getAnimalsName(){
        return AnimalsName;
    }
    public abstract Animals setAnimalsName(String AnimalsName);
    public int getSpeed(){
        return Speed;
    }
    public abstract Animals setSpeed(int speed);
    public String toString(){
        return AnimalsName + ", with speed: " + Speed;
    }
}
