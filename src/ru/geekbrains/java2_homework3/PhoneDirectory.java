package ru.geekbrains.java2_homework3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class PhoneDirectory {
   private final HashMap<String, HashSet<Integer>> directory;

    public PhoneDirectory() {
        directory = new HashMap<>();
    }

    public void addRecording(String name, int numberPhone){
        HashSet<Integer> listPhoneNumbersByName = directory.get(name);
        if(listPhoneNumbersByName == null){
            HashSet<Integer> numbersPhone = new HashSet<>();
            numbersPhone.add(numberPhone);
            directory.put(name, numbersPhone);
        }else {
            //с выводом сообщения
//            Iterator<Integer> i = listPhoneNumbersByName.iterator();
//            boolean isNumder = false;
//            while (i.hasNext()){
//                if(numberPhone == i.next()){
//                    isNumder = true;
//                    break;
//                }
//            }
//            if(isNumder){
//                System.out.printf("Number %d is already in the directory.", numberPhone);
//            }else {
//                listPhoneNumbersByName.add(numberPhone);
//            }

            //без вывода сообщения
            listPhoneNumbersByName.add(numberPhone);
        }
    }

    public void getNumbers(String name){
        HashSet<Integer> phoneNumbers = directory.get(name);
        if(phoneNumbers == null){
            System.out.println("There is no information about " + name + " in the phone book.");
        }else {
            System.out.println(name + ":" + phoneNumbers);
        }
    }

}


