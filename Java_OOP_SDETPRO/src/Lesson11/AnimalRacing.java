package Lesson11;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AnimalRacing {
    private static final int MAX_SPEED = 100;

    public static void main(String[] args) {
        AnimalRacing animalRacing = new AnimalRacing();

        Dog Dog = new Dog().setAnimalsName("Dog").setSpeed(new SecureRandom().nextInt(MAX_SPEED));
        Horse Horse = new Horse().setAnimalsName("Horse").setSpeed(new SecureRandom().nextInt(MAX_SPEED));
        Falcon Falcon = new Falcon().setAnimalsName("Falcon").setSpeed(new SecureRandom().nextInt(MAX_SPEED));
        Butterfly Butterfly = new Butterfly().setAnimalsName("Butterfly").setSpeed(new SecureRandom().nextInt(MAX_SPEED));
        Leopard Leopard = new Leopard().setAnimalsName("Leopard").setSpeed(new SecureRandom().nextInt(MAX_SPEED));
        Lion Lion = new Lion().setAnimalsName("Lion").setSpeed(new SecureRandom().nextInt(MAX_SPEED));
        Tiger Tiger = new Tiger().setAnimalsName("Tiger").setSpeed(new SecureRandom().nextInt(MAX_SPEED));
        Bird Bird = new Bird().setAnimalsName("Bird").setSpeed(new SecureRandom().nextInt(MAX_SPEED));
        Owl Owl = new Owl().setAnimalsName("Owl").setSpeed(new SecureRandom().nextInt(MAX_SPEED));

        List<MoveAbleInterface> animalList = Arrays.asList(Dog, Tiger, Lion, Bird, Owl, Leopard, Horse, Falcon, Butterfly);
        List<MoveAbleInterface> animalWalk = new ArrayList<>();

        System.out.println("=====LIST ANIMALS=====");
        for (MoveAbleInterface animals : animalList) {
            System.out.println(animals.toString1());
        }
        System.out.println("\n=====RACING WITHOUT WINGS=====");

        for (MoveAbleInterface animals : animalList) {
            if (animals.moveAble() == true) {
                animalWalk.add(animals);
            }
        }
        for (MoveAbleInterface animals : animalWalk) {
            System.out.println(animals.toString());
        }
        animalWalk.sort(new Comparator<MoveAbleInterface>() {
            @Override
            public int compare(MoveAbleInterface o1, MoveAbleInterface o2) {
                return o1.Speed() > o2.Speed() ? -1 : 1;
            }
        });
        System.out.println("\n===>The animal winner is : " + animalWalk.get(0).toString());
    }
}