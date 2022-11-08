package Lesson9;

import java.security.SecureRandom;
import java.util.*;


public class AnimalRacing {

    public static void main(String[] args) {
        AnimalRacing animalRacing = new AnimalRacing();

        AnimalBuilder tiger = AnimalBuilder.builder().setName("Tiger").setSpeed(new SecureRandom().nextInt(100)).setWithWings(false).build();
        AnimalBuilder bird = AnimalBuilder.builder().setName("Bird").setSpeed(new SecureRandom().nextInt(25)).setWithWings(true).build();
        AnimalBuilder lion = AnimalBuilder.builder().setName("Lion").setSpeed(new SecureRandom().nextInt(100)).setWithWings(false).build();
        AnimalBuilder snake = AnimalBuilder.builder().setName("Snake").setSpeed(new SecureRandom().nextInt(100)).setWithWings(false).build();
        AnimalBuilder bee = AnimalBuilder.builder().setName("Bee").setSpeed(new SecureRandom().nextInt(15)).setWithWings(true).build();

        List<AnimalBuilder> animalList = Arrays.asList(tiger, bird, lion, snake, bee);
        for (AnimalBuilder animals : animalList) {
            System.out.println(animals.toString());
        }

        System.out.println("The winner is: " + animalRacing.printTheWinner(animalList));
    }

    public AnimalBuilder printTheWinner(List<AnimalBuilder> animalList) {
        AnimalBuilder winner = animalList.get(0);
        for (AnimalBuilder Animals : animalList) {
            if (!Animals.isWithWings()) {
                if (Animals.getSpeed() > winner.getSpeed()) {
                    winner = Animals;
                }
            }
        }
        return winner;
    }
}

