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
public class Spaceship implements Serializable {

    private String description;
    private int shieldPoints;
    private int attackPoints;
    private String location;
    private final int width;
    private final int length;
    private final int height;
   

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getShieldPoints() {
        return shieldPoints;
    }

    public void setShieldPoints(int shieldPoints) {
        this.shieldPoints = shieldPoints;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Spaceship() {
        this.description = "\nThis will take you to different parts of the galaxy";
        this.width = 0;
        this.length = 0;
        this.height = 0;
    }

    @Override
    public String toString() {
        return "Spaceship{" + "description=" + description + ", shieldPoints=" + shieldPoints + ", attackPoints=" + attackPoints + ", location=" + location + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + this.shieldPoints;
        hash = 97 * hash + this.attackPoints;
        hash = 97 * hash + Objects.hashCode(this.location);
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
        final Spaceship other = (Spaceship) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.shieldPoints != other.shieldPoints) {
            return false;
        }
        if (this.attackPoints != other.attackPoints) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }

}
