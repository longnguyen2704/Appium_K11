package Lesson10;

import java.security.SecureRandom;
import java.util.*;

public class AnimalController {
    public static void main(String[] args) {
        AnimalController animalController = new AnimalController();

        Animals Tiger = new Tiger().setAnimalsName("Tiger").setSpeed(new SecureRandom().nextInt(100));
        Animals Dog = new Dog().setAnimalsName("Dog").setSpeed(new SecureRandom().nextInt(60));
        Animals Horse = new Horse().setAnimalsName("Horse").setSpeed(new SecureRandom().nextInt(75));
        List<Animals> animalList = Arrays.asList(Tiger, Dog, Horse);
        for (Animals animals : animalList) {
            System.out.println(animals.toString());
        }
        animalList.sort(new Comparator<Animals>() {
            @Override
            public int compare(Animals o1, Animals o2) {
                return o1.getSpeed() > o2.getSpeed() ? -1 : 1;
            }
        });
        System.out.println("The winner is : " + animalList.get(0).toString());
    }
}