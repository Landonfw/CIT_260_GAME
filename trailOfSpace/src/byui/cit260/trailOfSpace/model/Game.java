/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.trailOfSpace.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author landonwright
 */
public class Game implements Serializable{
   
    private String totalTime;
    private long noPeople;
    private Spaceship spaceship;
    private InventoryItem[] inventory;
    private Player player;
    private String[] character;
    private MathTrap mathTrap;
    private Map map;

    public Game() {
    }
    
    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public long getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(long noPeople) {
        this.noPeople = noPeople;
    }

    public Spaceship getSpaceship() {
        return spaceship;
    }

    public void setSpaceship(Spaceship spaceship) {
        this.spaceship = spaceship;
    }
    
    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + '}';
    }

    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String[] getCharacter() {
        return character;
    }

    public void setCharacter(String[] character) {
        this.character = character;
    }

    public MathTrap getMathTrap() {
        return mathTrap;
    }

    public void setMathTrap(MathTrap mathTrap) {
        this.mathTrap = mathTrap;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.totalTime);
        return hash;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.totalTime, other.totalTime)) {
            return false;
        }
        return true;
    }
    
    
   public class GameControl {
       
       public static void createNewGame(Player player) {
           
           Game game = new Game();
           TrailOfSpace.setCurrentGame(game);
           
           game.setPlayer(player);
           
           InventoryItem[] inventoryList = GameControl.createInventoryList();
           game.setInventory(inventoryList);
           
           Ship ship = new Ship();
           game.SetShip(ship);
           
           Map map = MapControl.createMap();
           game.setMap(map);
           
           MapControl.moveCharacterToStartingLocation(map);
       }
   }
   private static Map createMap() {
       
       Map map = new Map(20, 20);
       
       Scene[] scenes = createScenes();
       
       GameControl.assignScenesToLocations(map, scenes);
       
       return map;
   }
   private static Scene[] createScenes() {
       Game game = TrailOfSpace.getCurrentGame();
       
       Scene[] scenes = new Scene[SceneType.values().length];
       startingScene.seDescription(
         "\nWelcome to the game. Explore and have fun.");
       startingScene.setMapSymbol(" ST ");
       startingScene.setBlocked(false);
       startingScene.setTravelTime(240);
       scenes[SceneType.start.ordinal()] = startingScene;
       
       Scene finishScene = new Scene();
       finishScene.setDescription(
                "\nCongrats you have traveled the galaxy."
              + "Return to earth!");
       finishScene.setMapSymbol(" FN ");
       finishScene.setBlocked(false);
       finishScene.setTravelTime(Double.POSITIVE_INFINITY);
       scenes[SceneType.finish.ordinal()] = finishScene;
           
   }
   
   private void viewInventory() {
       
       InventoryItem[] inventory = GameControl.getSortedInventoryList();
       
       System.out.println("\nList of Inventory Items");
       System.out.println("Description" + "\t" + 
                          "Required" + "\t" + 
                          "In Stock");
       
       for (InventoryItem inventoryItem : inventory) {
           
           System.out.println(inventoryItem.getDescription() + "\t    " +
                              inventoryItem.getRequiredAmount() + "\t   " +  
                              inventoryItem.getQuantityInStock());
       }
   }
   
   public static InventoryItem[] getSortedInventoryList() {
       System.out.println("\n*** getSortedInventoryList stub function called ***");
       return null;
   }
   
}
