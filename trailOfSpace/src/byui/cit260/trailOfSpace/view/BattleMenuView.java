/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.view;

import byui.cit260.trailOfSpace.control.BattleControl;
import static byui.cit260.trailOfSpace.control.BattleControl.characterAttack;
import java.util.Scanner;

/**
 *
 * @author animejedifreak
 */
public class BattleMenuView {

    BattleControl instance = new BattleControl();

    private final String MENU = "\n"
            + "\n-----------------------------------------------------"
            + "\n| Battle Menu                                          |"
            + "\n-----------------------------------------------------"
            + "\nA - Attack"
            + "\nD - Defend"
            + "\nP - Predict outcome"
            + "\n-----------------------------------------------------"
            + "\n"
            + "Enter your selection below";
    private GameMenuView New;

    public void displayMenu() {

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
            case 'A':
                BattleControl.characterAttack();
                break;
            case 'D':
                BattleControl.characterDefend();
                break;
            case 'P':
                BattleControl.battle();
                break;
            case ' ':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }
}
