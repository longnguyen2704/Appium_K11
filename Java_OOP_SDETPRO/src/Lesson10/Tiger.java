package Lesson10;

import java.security.SecureRandom;

public class Tiger extends Animals {
    public Tiger(String AnimalsName, int Speed) {
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

    public Tiger() {
    }
}
