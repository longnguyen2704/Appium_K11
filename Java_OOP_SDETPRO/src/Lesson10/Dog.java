package Lesson10;

public class Dog extends Animals {
    public Dog(String AnimalsName, int Speed) {
        super(AnimalsName, Speed);
    }

    public Animals setAnimalsName(String AnimalsName) {
        this.AnimalsName = AnimalsName;
        return this;
    }

    public Animals setSpeed(int Speed) {
        this.Speed = Speed;
        return this;
    }

    public Dog() {
    }
}