/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trailofspace;

import byui.cit260.trailOfSpace.model.Battle;
import byui.cit260.trailOfSpace.model.Player;
import byui.cit260.trailOfSpace.model.Character;
import byui.cit260.trailOfSpace.model.Game;
import byui.cit260.trailOfSpace.model.Location;
import byui.cit260.trailOfSpace.model.MathTrap;
import byui.cit260.trailOfSpace.model.inventory;
import byui.cit260.trailOfSpace.model.Spaceship;
import byui.cit260.trailOfSpace.view.StartProgramView;

/**
 *
 * @author animejedifreak
 */
public class TrailOfSpace {

    private static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        TrailOfSpace.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        TrailOfSpace.player = player;
    }
    private static Player player = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();

    }

}
