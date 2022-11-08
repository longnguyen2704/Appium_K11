package Lesson11;

public class Leopard implements MoveAbleInterface, FlyAbleInterface{
    String animalsName;
    int Speed;
    boolean Fly;

    public Leopard() {
        this.animalsName = getAnimalsName();
        Fly = flyAble();
    }

    public Leopard setAnimalsName(String animalsName) {
        this.animalsName = animalsName;
        return this;
    }

    public Leopard setSpeed(int Speed) {
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
