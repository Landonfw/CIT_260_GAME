/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.control;

import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 *
 * @author animejedifreak
 */
public class BattleControlTest {
    
    public BattleControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcOutcome method, of class BattleControl.
     */
    @org.junit.Test
    public void testCalcOutcome() {
        System.out.println("calcOutcome");
        
        //Test case 1
        System.out.println("Test Case 1");
        int characterHealth = 100;
        int characterAttack = 30;
        int enemyHealth = 70;
        int enemyAttack = 15;
        BattleControl instance = new BattleControl();
        int expResult = -4;
        int result = instance.calcOutcome(characterHealth, characterAttack, enemyHealth, enemyAttack);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //Test case 2
        System.out.println("Test Case 2");
        characterHealth = -200;
        characterAttack = 45;
        enemyHealth = 53;
        enemyAttack = 23;
        expResult = -1;
        result = instance.calcOutcome(characterHealth, characterAttack, enemyHealth, enemyAttack);
        assertEquals(expResult, result);
        
        //Test case 3
        System.out.println("Test Case 3");
        characterHealth = 1;
        characterAttack = 499;
        enemyHealth = 1;
        enemyAttack = 499;
        expResult = -5;
        result = instance.calcOutcome(characterHealth, characterAttack, enemyHealth, enemyAttack);
        assertEquals(expResult, result);
        
        
    }
    
}
