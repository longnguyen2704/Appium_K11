package Lesson8.Animal;

import java.security.SecureRandom;

public class Horse extends Animals {
    public Horse(String animalsName) {
        super.setSpeed(new SecureRandom().nextInt(81));
        super.setAnimalsName(animalsName);
    }
}
