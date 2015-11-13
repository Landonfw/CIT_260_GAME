/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.view;

import java.util.Scanner;

/**
 *
 * @author landonwright
 */
public abstract class View implements ViewInterface {

    private String promptMessage;

    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    @Override
    public void display() {

        char selection = ' ';
        do {
            System.out.println(promptMessage);

            String input = this.getInput();
            selection = input.charAt(0);

            this.doAction(selection);

        } while (selection != 'Q');

    }

    @Override
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

    // implement display and getInput functions in this superclass
}
