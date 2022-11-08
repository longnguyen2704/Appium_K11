package Lesson11;

public class Bird implements MoveAbleInterface, FlyAbleInterface{
    String animalsName;
    int Speed;
    boolean Fly;

    public Bird() {
        this.animalsName = getAnimalsName();
        Fly = flyAble();
    }

    public Bird setAnimalsName(String animalsName) {
        this.animalsName = animalsName;
        return this;
    }

    public Bird setSpeed(int Speed) {
        this.Speed = Speed;
        return this;
    }

    @Override
    public boolean flyAble() {
        return true;
    }

    @Override
    public int Speed() {
        return Speed;
    }

    @Override
    public boolean moveAble() {
        return false;
    }

    public String toString() {
        return animalsName + ", with speed: " + Speed + ", wings = " + Fly;
    }
    public String toString1(){
        return animalsName + ", with speed: [null] " + ", wings = " + Fly;
    }
}
