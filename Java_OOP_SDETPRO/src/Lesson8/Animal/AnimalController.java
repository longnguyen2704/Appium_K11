package Lesson8.Animal;

import java.util.*;

public class AnimalController {
    public static void main(String[] args) {
        boolean result = true;
        while (result) {
            Animals animals = new Animals();
            int totalHorse;
            int totalTiger;
            int totalDog;
            List<Animals> animalsList;
            HashMap<String, Integer> totalList;
            System.out.print("Enter the total of horse: ");
            totalHorse = new Scanner(System.in).nextInt();
            System.out.print("Enter the total of tiger: ");
            totalTiger = new Scanner(System.in).nextInt();
            System.out.print("Enter the total of dog: ");
            totalDog = new Scanner(System.in).nextInt();
            totalList = new HashMap<>();
            totalList.put("Horse", totalHorse);
            totalList.put("Tiger", totalTiger);
            totalList.put("Dog", totalDog);

            animalsList = AnimalController.generateAnimal(totalList);

            result = AnimalController.raceCompetition(animalsList);
        }
    }

    public static List<Animals> generateAnimal(HashMap<String, Integer> totalAnimal) {
        List<Animals> animalList = new ArrayList<>();
        for (int horseIndex = 0; horseIndex < totalAnimal.get("Horse"); horseIndex++) {
            animalList.add(new Horse("Horse " + (horseIndex + 1)));
        }
        for (int tigerIndex = 0; tigerIndex < totalAnimal.get("Tiger"); tigerIndex++) {
            animalList.add(new Tiger("Tiger " + (tigerIndex + 1)));
        }
        for (int dogIndex = 0; dogIndex < totalAnimal.get("Dog"); dogIndex++) {
            animalList.add(new Dog("Dog " + (dogIndex + 1)));
        }
        return animalList;
    }

    public static boolean raceCompetition(List<Animals> animalList) {
        if (animalList.isEmpty()) {
            System.out.println("The is no any animal for this race, please retry again!");
            return true;
        }
        Collections.sort(animalList, (a1, a2) -> a1.getSpeed() > a2.getSpeed() ? -1 : 1);
        for (int index = 0; index < animalList.size(); index++) {
            if (index == 0) {
                System.out.printf("Winner is: %s, with speed: %d km/h\n"
                        , animalList.get(index).getAnimalsName(), animalList.get(index).getSpeed());
            } else {
                System.out.printf("The position number %d is %s, with speed: %d km/h\n"
                        , (index + 1), animalList.get(index).getAnimalsName(), animalList.get(index).getSpeed());
            }
        }
        return false;
    }
}