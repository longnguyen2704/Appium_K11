package Lesson8.Animal;

import java.security.SecureRandom;

public class Dog extends Animals {
    public Dog(String animalsName) {
        super.setSpeed(new SecureRandom().nextInt(66));
        super.setAnimalsName(animalsName);
    }
}
