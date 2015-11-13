/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.control;

import byui.cit260.trailOfSpace.model.Player;
import trailofspace.TrailOfSpace;

/**
 *
 * @author landonwright
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** createPlayer function called ***");

        if (playersName == null) {
            return null;
        }

        Player player = new Player();
        player.setName(playersName);

        TrailOfSpace.setPlayer(player);

        return player;

    }

    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame stub function called ***");
    }

    public void startNewGame() {

    }

    public void initialize() {

    }

    public void saveGame() {

    }

    public void loadGame() {

    }

    public void createNewPlayer() {

    }
}
