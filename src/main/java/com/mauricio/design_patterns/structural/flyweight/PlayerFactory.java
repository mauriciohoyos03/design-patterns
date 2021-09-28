package com.mauricio.design_patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Objects;

// Class used to get a player using HashMap (Returns
// an existing player if a player of given type exists.
// Else creates a new player and returns it.
public class PlayerFactory {

    /* HashMap stores the reference to the object
       of Terrorist(TS) or CounterTerrorist(CT).  */
    private static HashMap<PlayerType, Player> mapPlayers = new HashMap<>();

    public static Player getPlayer(PlayerType playerType) {
        Player player = mapPlayers.get(playerType);
         /* If an object for TS or CT has already been
           created simply return its reference */
        if (Objects.isNull(player)) {
            /* create an object of TS/CT  */
            switch (playerType) {
                case TERRORIST:
                    player = new Terrorist();
                    break;
                case COUNTER_TERRORIST:
                    player = new CounterTerrorist();
                    break;
                default:
                    System.out.println("Unreachable code!");
            }
            // Once created insert it into the HashMap
            mapPlayers.put(playerType, player);
        }

        return player;
    }
}
