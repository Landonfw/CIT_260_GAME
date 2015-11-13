/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.control;

/**
 *
 * @author animejedifreak
 */
public class BattleControl {

    public static void battle() {

        int characterHealth;
        int characterAttack;
        int enemyHealth;
        int enemyAttack;
        int result = this.calcOutcome(characterHealth, characterAttack, enemyHealth, enemyAttack);

        switch (result) {
            case -1:
                System.out.println("Health is out of bounds");
                break;
            case -2:
                System.out.println("Attack is out of bounds");
                break;
            case -4:
                System.out.println("Character will win the battle!");
                break;
            case -5:
                System.out.println("The enemy will win the battle!");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

    }

    public static void characterAttack() {
       // int health = enemy.getHealth();
        // int attack = hero.getAttack(;
        // health -= attack;
        //enemy.setHealth(health); 

    }

    public static void characterDefend() {

       // health += increaseAmount;
        // return health;
    }

    public static int enemyAttack(int health, int attack) {

        health -= attack;
        return health;
    }

    public static int enemyDefend(int health, int increaseAmount) {

        health += increaseAmount;
        return health;
    }

    public static int calcOutcome(int characterHealth, int characterAttack, int enemyHealth, int enemyAttack) {

        if ((characterHealth > 999 || enemyHealth > 999) || (characterHealth < 1 || enemyHealth < 1)) {

            return -1; // health for character or enemy is out of bounds
        }
        if ((characterAttack > 499 || enemyAttack > 499) || (characterAttack < 1 || enemyAttack < 1)) {

            return -2; //attack for character or enemy is out of bounds
        }

        if (characterAttack != (int) characterAttack || characterHealth != (int) characterHealth || enemyAttack != (int) enemyAttack || enemyHealth != (int) enemyHealth) { //validate input

            return -3;
        }

        int outcome = ((enemyHealth / characterAttack) - (characterHealth / enemyAttack));

        if (outcome < 0) {

            return -4; //player's character will win the battle
        }
        if (outcome == 0) {
            return -5;
        } else {
            return -6; //enemy will win the battle
        }

    }

}
