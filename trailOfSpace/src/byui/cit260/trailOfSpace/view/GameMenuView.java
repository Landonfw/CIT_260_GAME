/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.view;

import java.util.Scanner;

/**
 *
 * @author animejedifreak
 */
public class GameMenuView {

    private final String MENU = "\n"
            + "\n-----------------------------------------------------"
            + "\n| Game Menu                                          |"
            + "\n-----------------------------------------------------"
            + "\nV - View Map"
            + "\nI - View list of items in inventory"
            + "\nS - View ship stats"
            + "\nP - View player stats"
            + "\nM - Move to new location"
            + "\nX - Exit ship"
            + "\nE - Re-enter ship"
            + "\nU - Upgrade ship"
            + "\nH - Help"
            + "\nQ - Quit"
            + "\n-----------------------------------------------------"
            + "\n"
            + "Enter your selection below";
    private GameMenuView New;

    public void display() {

        char selection = ' ';
        do {
            System.out.println(MENU);

            String input = this.getInput();
            selection = input.charAt(0);

            this.doAction(selection);

        } while (selection != 'Q');

    }

    public String getInput() {
        boolean valid = false;
        Scanner keyboard = new Scanner(System.in);

        String input = null;

        while (!valid) {

            input = keyboard.nextLine();
            input = input.toUpperCase();
            input = input.trim();

            if (input.length() < 1) {
                System.out.println("Invalid - please enter a valid letter");
                continue;

            }
            break;

        }
        return input;
    }

    public void doAction(char choice) {

        switch (choice) {
            case 'V':
                this.displayMap();
                break;
            case 'I':
                this.viewInventory();
                break;
            case 'S':
                System.out.println("");
                break;
            case 'P':
                System.out.println("");
                break;
            case 'M':
                System.out.println("");
                break;
            case 'X':
                System.out.println("");
                break;
            case 'E':
                System.out.println("");
                break;
            case 'U':
                System.out.println("");
                break;
            case 'H':
                System.out.println("");
                break;
            case 'Q':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    public void displayMap() {
        System.out.println("*** displayMap stub function called ***");
    }
}
