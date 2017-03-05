package com.example;

import java.util.*;
import java.time.*;


public class WereWolf {
    /* This program is for those terrified of werewolves who want to
    know what nights to stay inside and load their shotguns with silver
    pellets.
     */
    public static void main(String args[]){

        int MINUTES_BETWEEN = 42524; // minutes between full moons (average 29 days, 12 hours, 44 minutes)

        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
        String textToday = today.format(formatter);
        System.out.println("Today's date is: " + textToday);
        // setting as base the first full moon of 2017
        LocalDateTime base = LocalDateTime.of(2017, 1, 12, 5, 35);

        //initializing the next full moon to base
        LocalDateTime next = base;

        //loop till next full moon is determined
        while(today.isAfter(next)) {
            // add minutes until the next full moon is determined
            next = next.plusMinutes(MINUTES_BETWEEN);
        }

        String textNext = next.format(formatter);
        System.out.println("The next full moon will be: " + textNext);
        LocalDateTime ends = next.plusDays(3);
        String textEnds = ends.format(formatter);
        System.out.println("Wear silver or stay inside at night until " + textEnds);






    }
}

