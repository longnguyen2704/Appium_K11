package Lesson8.Animal;

import java.security.SecureRandom;

public class Tiger extends Animals {
    public Tiger(String animalsName) {
        super.setSpeed(new SecureRandom().nextInt(106));
        super.setAnimalsName(animalsName);
    }
}
