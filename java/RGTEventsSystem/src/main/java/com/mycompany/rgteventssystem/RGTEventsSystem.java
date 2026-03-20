/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rgteventssystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class RGTEventsSystem {


public static boolean isDuplicate(ArrayList<String> nameStrings, String name) {
    for (String attendee : nameStrings) {
        if (attendee.equalsIgnoreCase(name)) {
            return true;
        }
    }
    return false;
}




    public static boolean validatenames(String name){
        int len = name.length();
        if (name.isEmpty() || len > 40) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            char c = name.charAt(i);
            if (!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }
        return true;
    }



    public static String formatName(String name) {
        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 || chars[i - 1] == ' ') {
                chars[i] = Character.toUpperCase(chars[i]);
            } else {
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }
        return new String(chars);
    }
    
    public static void main(String[] args) {
        final int MAX_WORKSHOP = 30;
        final int MAX_SPORTS = 50;
        final int MAX_ORIENT = 100;
        final String COORDINATOR = "Ms. Dlamini";
        final String SYSTEM_NAME = "RGT Events System";
        String[] eventnames = { "Java workshop", "sports day", "Orientation Evening" };
        String[] eventdates = { "2025-08-10", "2025-08-15", "2025-08-20" };
        int[] eventcapacities = { MAX_WORKSHOP, MAX_SPORTS, MAX_ORIENT };
        ArrayList<String> event1 = new ArrayList<>();
        ArrayList<String> event2 = new ArrayList<>();
        ArrayList<String> event3 = new ArrayList<>();

        {
            event1.addAll(Arrays.asList("alice johnson", "bob smith", "carla nkosi"));
        }

        {
            event2.addAll(Arrays.asList("grace white", "frank mokoena", "emily pate", "david lee"));
        }

        {
            event3.addAll(Arrays.asList("henry tan", "isla brooks"));
        }

        System.out.println("==================================");
        System.out.println(SYSTEM_NAME);

        for (int i = 0; i < eventnames.length; i++) {
            System.out.println("==================================");
            System.out.println("Event Name: " + eventnames[i]);
            System.out.println("Event Date: " + eventdates[i]);
            System.out.println("Event Capacity: " + eventcapacities[i]);
            System.out.println("Event coordinator: " + COORDINATOR);
            System.out.println("Attendees: ");

            switch (i) {
                case 0 -> {
                    for (int j = 0; j < event1.size(); j++) {
                        System.out.println(formatName(event1.get(j)));
                    }
                }
                case 1 -> {
                    for (int j = 0; j < event2.size(); j++) {
                        System.out.println(formatName(event2.get(j)));
                    }
                }
                case 2 -> {
                    for (int j = 0; j < event3.size(); j++) {
                        System.out.println(formatName(event3.get(j)));
                    }
                }
            }
        }
        System.out.println("==================================");
        Scanner scr = new Scanner(System.in);

        System.out.println(
                "Do you want to 1 add an attendee to the list, 2 remove an attendee from the list or 3 to search the list?");

        int answer = scr.nextInt();
        if (answer == 1 || answer == 2 || answer == 3) {
            System.out.println("please enter the atendents name");

            scr.nextLine();
            /* this is were the user input for the name of the attendee so we
            1 add it to an event 2 remove it from an event or search it from the */
            String name = scr.nextLine();
            switch (answer) {
                case 1 -> {

                    if (validatenames(name) == true) {
                        System.out.println(
                                "==================================\nWhat event would you like to add this attendent too");
                        System.out.println(
                                " enter 1 for " + eventnames[0] + "\n enter 2 for " + eventnames[1] + "\n enter 3 for "
                                        + eventnames[2]);
                        int answer2 = scr.nextInt();
                        switch (answer2) {
                            case 1 -> {
                                if (isDuplicate(event1, name)) {
                                    System.out.println("DUPLICATE — reject");
                                } else {
                                    name = name.toLowerCase();
                                    event1.add(name);
                                    System.out.println("Registered");

                                }

                            }
                            case 2 -> {
                                if (isDuplicate(event2, name)) {
                                    System.out.println("DUPLICATE — reject");
                                } else {
                                    name = name.toLowerCase();
                                    event2.add(name);
                                    System.out.println("Registered");
                                }
                                break;
                            }

                            case 3 -> {
                                if (isDuplicate(event3, name)) {
                                    System.out.println("DUPLICATE — reject");
                                } else {
                                    name = name.toLowerCase();
                                    event3.add(name);
                                    System.out.println("Registered");
                                }
                                break;
                            }
                        }
                    }
                    break;
                }
                case 2 -> {
                    System.out.println("==================================");
                    System.out.println("From which event would you like to remove an attendee?");
                    System.out.println("1. " + eventnames[0]);
                    System.out.println("2. " + eventnames[1]);
                    System.out.println("3. " + eventnames[2]);

                    int eventChoice = scr.nextInt();
                    scr.nextLine(); // Clear buffer

                    ArrayList<String> selectedList;
                    switch (eventChoice) {
                        case 1 -> selectedList = event1;
                        case 2 -> selectedList = event2;
                        case 3 -> selectedList = event3;
                        default -> {
                            System.out.println("Invalid selection.");
                            return;
                        }
                    }

                    // We use case-insensitive matching for the removal
                    boolean removed = false;
                    for (int i = 0; i < selectedList.size(); i++) {
                        if (selectedList.get(i).equalsIgnoreCase(name)) {
                            selectedList.remove(i);
                            removed = true;
                            System.out.println(formatName(name) + " has been removed.");
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Attendee not found in this event.");
                    }
                    break;
                }
                case 3 -> {
                    boolean found = false;
                    for (int i = 0; i < eventnames.length; i++) {
                        ArrayList<String> currentList = (i == 0) ? event1 : (i == 1) ? event2 : event3;
                        if (isDuplicate(currentList, name)) {
                            System.out.println(formatName(name) + " is registered for: " + eventnames[i]);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Attendee not found in any event.");
                    }
                    break;
                }
            }
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}