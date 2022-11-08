package Lesson11;

public class Dog implements MoveAbleInterface, FlyAbleInterface {
    String animalsName;
    int Speed;
    boolean Fly;

    public Dog() {
        this.animalsName = getAnimalsName();
        Fly = flyAble();
    }

    public Dog setAnimalsName(String animalsName) {
        this.animalsName = animalsName;
        return this;
    }

    public Dog setSpeed(int Speed) {
        this.Speed = Speed;
        return this;
    }

    @Override
    public boolean flyAble() {
        return false;
    }

    @Override
    public int Speed() {
        return Speed;
    }

    @Override
    public boolean moveAble() {
        return true;
    }

    public String toString() {
        return animalsName + ", with speed: " + Speed + ", wings = " + Fly;
    }
    public String toString1(){
        return animalsName + ", with speed: [null] " + ", wings = " + Fly;
    }
}