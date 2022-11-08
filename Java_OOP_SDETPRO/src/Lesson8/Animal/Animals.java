package Lesson8.Animal;

public class Animals {
    private String animalsName;
    private int speed;

    public Animals() {
    }

    public Animals(int speed) {
        this.speed = speed;
    }

    public Animals(String animalName) {
        this.animalsName = animalName;
    }

    public Animals(String animalName, int speed) {
        this.animalsName = animalName;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getAnimalsName() {
        return animalsName;
    }

    public void setAnimalsName(String animalsName) {
        this.animalsName = animalsName;
    }

}
