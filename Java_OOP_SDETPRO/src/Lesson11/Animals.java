package Lesson11;

public class Animals implements MoveAbleInterface, FlyAbleInterface {
    private String animalsName;
    private int Speed;
    private boolean Fly;

    public Animals(String animalsName, int Speed, boolean Fly) {
        this.animalsName = animalsName;
        this.Speed = Speed;
        this.Fly = Fly;
    }

    public boolean isFly() {
        return Fly;
    }

    public void setFly(boolean fly) {
        Fly = fly;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    @Override
    public int Speed() {
        return getSpeed();
    }

    @Override
    public boolean moveAble() {
        return true;
    }

    @Override
    public String toString1() {
        return animalsName + ", with speed: [null] " + ", wings = " + Fly;
    }

    public Animals setAnimalsName(String animalsName) {
        this.animalsName = animalsName;
        return this;
    }

    @Override
    public boolean flyAble() {
        return false;
    }
}
