/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author landonwright
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    public void AddToInventory() {
        System.out.println("addToInventory");
        String inventoryItem = "health";
        int amount = 5;
        InventoryControl instance = new InventoryControl();
        instance.addToInventory(inventoryItem, amount);  
    }
    
    /**
     *
     */
    public void AddToInventory() {
        System.out.println("addToInventory");
        String inventoryItem = "health";
        int amount = 5;
        
          
    }
    
    public void RemoveFromInventory() {
        System.out.println("removeFromInventory");
        String inventoryItem = "health";
        int amount = 1; 
    }

    /**
     * Test of addToInventory method, of class InventoryControl.
     */
    @Test
    public void testAddToInventory() {
        System.out.println("addToInventory");
        String inventoryItem = null;
        int amount = 0;
        InventoryControl instance = new InventoryControl();
        instance.addToInventory(inventoryItem, amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFromInventory method, of class InventoryControl.
     */
    @Test
    public void testRemoveFromInventory() {
        System.out.println("removeFromInventory");
        String inventoryItem = null;
        int amount = 0;
        InventoryControl instance = new InventoryControl();
        instance.removeFromInventory(inventoryItem, amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInventoryList method, of class InventoryControl.
     */
    @Test
    public void testGetInventoryList() {
        System.out.println("getInventoryList");
        String inventoryItems = null;
        InventoryControl instance = new InventoryControl();
        //instance.getInventoryList(inventoryItems);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
