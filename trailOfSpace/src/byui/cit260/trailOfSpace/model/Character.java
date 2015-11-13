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
public class Character implements Serializable{
    
    private String type;
    private String name;
    private int health;
    private int attack;
    
    

    public Character() {
    }

    
    
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    

    @Override
    public String toString() {
        return "Character{" + "type=" + type + ", name=" + name + ", health=" + health + ", attack=" + attack + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.type);
        hash = 11 * hash + Objects.hashCode(this.name);
        hash = 11 * hash + this.health;
        hash = 11 * hash + this.attack;
        
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
        final Character other = (Character) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.health != other.health) {
            return false;
        }
        if (this.attack != other.attack) {
            return false;
        }
        
        return true;
    }
    
    
    
    
}
