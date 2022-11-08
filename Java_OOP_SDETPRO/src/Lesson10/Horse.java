package Lesson10;

import java.security.SecureRandom;

public class Horse extends Animals {
    public Horse(String AnimalsName, int Speed) {
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

    public Horse() {
    }
}
