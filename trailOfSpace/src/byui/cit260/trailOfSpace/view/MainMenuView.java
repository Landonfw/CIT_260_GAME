/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.view;

import byui.cit260.trailOfSpace.control.GameControl;
import java.util.Scanner;
import trailofspace.TrailOfSpace;

/**
 *
 * @author animejedifreak
 */
public class MainMenuView extends View {

    HelpMenuView helpMenu = new HelpMenuView();

    public MainMenuView() {
        super("\n"
                + "\n-----------------------------------------------------"
                + "\n| Main Menu                                          |"
                + "\n-----------------------------------------------------"
                + "\nG - Start game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save Game"
                + "\n-----------------------------------------------------"
                + "\n"
                + "Enter your selection below");
    }
    private GameMenuView New;

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;

        value = value.toUpperCase();
        char choice = value.charAt(0);

        switch (choice) {
            case 'N':
                this.startNewGame();
                break;
            case 'G':
                this.startExistingGame();
                break;
            case 'H':
                helpMenu.displayMenu();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'E':
                return false;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return true;
    }

    private void startNewGame() {
        //create a new game
        GameControl.createNewGame(TrailOfSpace.getPlayer());

        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void saveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
