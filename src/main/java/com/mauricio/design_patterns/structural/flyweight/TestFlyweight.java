package com.mauricio.design_patterns.structural.flyweight;

import java.util.Random;


/*
 * Flyweight design pattern is used when we need to create a lot of Objects of a class.
 *  Since every object consumes memory space that can be crucial for low memory devices,
 *  such as mobile devices or embedded systems, flyweight design pattern can be applied
 * to reduce the load on memory by sharing objects.
 */
public class TestFlyweight {
    private static String[] weapons =
            {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

    /* Assume that we have a total of 10 players
           in the game. */
    public static void main (String... arg) {
        for (int i = 0; i < 10; i++) {
            Player player = PlayerFactory.getPlayer(getRandPlayerType());
            player.assignWeapon(getRandWeapon());

            player.mission();
        }
    }

    private static PlayerType getRandPlayerType() {
         Random random  = new Random();
         if (random.nextBoolean()) {
             return PlayerType.TERRORIST;
         } else {
             return PlayerType.COUNTER_TERRORIST;
         }
    }

    private static String getRandWeapon() {
        Random random = new Random();
        int num = random.nextInt(weapons.length);
        return weapons[num];
    }
}
