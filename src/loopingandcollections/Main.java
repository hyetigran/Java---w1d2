package loopingandcollections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Welcome to Lambda School's Java Day 2");

        Dog[] dogArr = new Dog[5]; // indexed 0 through 4
        dogArr[0] = new Dog("Springer", 50, false);
        dogArr[1] = new Dog("Bulldog", 45, true);
        dogArr[2] = new Dog("Collie", 45, false);
        dogArr[3] = new Dog("Chihuahua", 5, true);
        dogArr[4] = new Dog("Corgie", 35, true);
        System.out.println("Pointer: " + dogArr.toString());
        System.out.println(Arrays.toString(dogArr));
        System.out.println("\nNot Good for apartments");
        for (int i = 0; i < dogArr.length; i++) {
            if (dogArr[i].isApartment()) {
                continue;
            }
            System.out.print(dogArr[i]);
        }

        System.out.println("\nBreed 3 good for apartments: " + dogArr[3].isApartment());
        for (Dog d : dogArr) {
            System.out.print(d);
        }

        // int, boolean, double, char
        // Object -> String
        // Object -> Array
        // Object -> Collections -> List -> ArrayList

        System.out.println("\n\n*** Array Lists");
        List<Dog> dogArrayList = new ArrayList<>();
        dogArrayList.addAll(Arrays.asList(dogArr));
        dogArrayList.add(new Dog("Mutt", 15, true));

        for (Dog d : dogArrayList) {
            System.out.print(d);
        }

        System.out.println();
        for (Dog d : dogArrayList) {
            System.out.print(d.getBreed() + " are ");

            // 1, 2
            // 1.1 - 1.11, 1.111, 1.111
            switch (d.getAvgWeight()) {
                case 5:
                    System.out.print(d.getAvgWeight() + " very small");
                    break;
                case 15:
                    System.out.print(d.getAvgWeight() + " small");
                    break;
                case 25:
                    System.out.print(d.getAvgWeight() + " medium");
                    break;
                case 35:
                    System.out.print(d.getAvgWeight() + " big");
                    break;
                case 45:
                    System.out.print(d.getAvgWeight() + " very big");
                    break;
                default:
                    System.out.print(d.getAvgWeight() + " unknown size ");
            }
            System.out.println(" dogs");
        }
        System.out.println();
        if (dogArrayList.get(2).getBreed().equals("Turtle")) {
            System.out.println("Match!");
        } else {
            System.out.println("No Match");
        }

        System.out.println();
        dogArrayList.add(2, new Dog("Labrador", 75, false));
        for (Dog d : dogArrayList) {
            System.out.print(d);
        }

        System.out.println();
        dogArrayList.set(2, new Dog("Poodle", 50, false));
        for (Dog d : dogArrayList) {
            System.out.print(d);
        }

        System.out.println();
        dogArrayList.remove(3);

        System.out.println("\n*** Sort ArrayList - by weight largest to smallest");

        dogArrayList.sort(Comparator.comparing(o -> o.getAvgWeight(), Comparator.reverseOrder()));

        System.out.println();
        System.out.println("\n\n*** HashMaps");
        Map<Integer, Dog> dogsHashMap = new HashMap<>();
        int hashcount = 1;
        for (Dog d : dogArrayList) {
            dogsHashMap.put(hashcount, d);
            hashcount++;
        }
        System.out.println("Key of 3" + dogsHashMap.get(3));
        System.out.println("Size of HM" + dogsHashMap.size());
        System.out.println("Remove 3" + dogsHashMap.remove(3));

        // print hashmap
        for (HashMap.Entry mapElem : dogsHashMap.entrySet()) {
            System.out.print("Key is " + mapElem.getKey());
            System.out.println(" Value is " + mapElem.getValue());
        }
        // sort hashmap
        // hashmap strings as key
    }

}