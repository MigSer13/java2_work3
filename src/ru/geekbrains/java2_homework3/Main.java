package ru.geekbrains.java2_homework3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //task 1
        String[] arrStr = {"Cat", "Dog","Book","Plate","Table","Cat","Spoon","Fork","Man","Dress",
                "Shirt", "Chair", "Cup", "Dog", "Spoon", "Cat", "Man"};

        HashMap<String, Integer> hmap = new HashMap<>();
        int numberOfDifferent = 0;
        for (int i = 0; i < arrStr.length; i++) {
            Integer value = hmap.get(arrStr[i]);
            if(value == null){
                numberOfDifferent++;
                hmap.put(arrStr[i], 1);
            } else {
                hmap.put(arrStr[i], ++value);
            }
        }
        System.out.println(hmap);
        System.out.println("Number of different words = " + numberOfDifferent);

        System.out.println("////////////////////////////////////////////");
        //task 2
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.addRecording("Ivanov", 456789423);
        phoneDirectory.addRecording("Ivanov", 456789423);
        phoneDirectory.addRecording("Petrov", 567894215);

        System.out.println();
        phoneDirectory.getNumbers("Ivanov");

    }
}
