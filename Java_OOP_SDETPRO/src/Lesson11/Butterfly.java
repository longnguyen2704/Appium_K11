package Lesson11;

import java.security.SecureRandom;

public class Butterfly implements MoveAbleInterface, FlyAbleInterface {
    final int BUTTERFLY_MAX_SPEED = 100;
    String animalsName;
    int Speed;
    boolean Fly;

    public Butterfly() {
        this.animalsName = getAnimalsName();
        Speed = new SecureRandom().nextInt(BUTTERFLY_MAX_SPEED);
        Fly = flyAble();
    }

    public boolean flyAble() {
        return true;
    }

    public Butterfly setAnimalsName(String animalsName) {
        this.animalsName = animalsName;
        return this;
    }

    public Butterfly setSpeed(int Speed) {
        this.Speed = Speed;
        return this;
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
