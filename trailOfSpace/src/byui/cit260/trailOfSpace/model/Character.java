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
 * @author animejedifreak
 */
public enum Character implements Serializable{
    
    Explorer("He is the space explorer.");
    
    private final String type;
    private final int health;
    private final int attack;
    private final String description;
    private final Point coordinates
    
    

    public Character(String description) {
                this.description = description;
                coordinates = new Point(1,1);
    }

     
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getDescription() {
        return description;
}

    public Point getCoordinates() {
        return coordinates;
}

    

    @Override
    public String toString() {
        return "Character{" + "type=" + type + ", name=" + name + ", health=" + health + ", attack=" + attack + '}';
    }
    
}
