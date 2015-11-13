/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.view;

import byui.cit260.trailOfSpace.control.BattleControl;
import byui.cit260.trailOfSpace.control.GameControl;
import byui.cit260.trailOfSpace.model.Player;
import java.util.Scanner;

/**
 *
 * @author animejedifreak
 */
public class StartProgramView {

    private String playersName;

    public void startProgram() {

        //display the banner screen
        this.displayBanner();

        //prompt the player to enter their name and retrieve the name
        String playersName = this.getPlayersName();

        //create and save the player object
        Player player = GameControl.createPlayer(playersName);

        //display the welcome message
        this.displayWelcomeMessage(player);

        //display the main menu 
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();

        BattleControl battleController = new BattleControl();
    }

    private void displayBanner() {
        System.out.println("\n\n*************************************************************************************************************");

        System.out.println(".___________..______          ___       __   __           ______    _______         _______..______      ___       ______  _______ \n"
                + "|           ||   _  \\        /   \\     |  | |  |         /  __  \\  |   ____|       /       ||   _  \\    /   \\     /      ||   ____|\n"
                + "`---|  |----`|  |_)  |      /  ^  \\    |  | |  |        |  |  |  | |  |__         |   (----`|  |_)  |  /  ^  \\   |  ,----'|  |__   \n"
                + "    |  |     |      /      /  /_\\  \\   |  | |  |        |  |  |  | |   __|         \\   \\    |   ___/  /  /_\\  \\  |  |     |   __|  \n"
                + "    |  |     |  |\\  \\----./  _____  \\  |  | |  `----.   |  `--'  | |  |        .----)   |   |  |     /  _____  \\ |  `----.|  |____ \n"
                + "    |__|     | _| `._____/__/     \\__\\ |__| |_______|    \\______/  |__|        |_______/    | _|    /__/     \\__\\ \\______||_______|");
        System.out.println("");
        System.out.println("Welcom to Trail of Space, the space exploration game!");

        System.out.println("\n\n*************************************************************************************************************");

    }

    public String getPlayersName() {

        boolean valid = false;
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);

        while (!valid) {

            System.out.println("Enter the player's name:");

            playersName = keyboard.nextLine();
            playersName = playersName.trim();

            if (playersName.length() < 2) {
                System.out.println("Invalid name - name must not be blank");
                continue;

            }
            break;

        }
        return playersName;
    }

    public void displayWelcomeMessage(Player player) {

        System.out.println("\n\n=============================================");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tWe hope you have a lot of fun!");
        System.out.println("=============================================");

    }

}
