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
public class inventory implements Serializable{
    
    private int quantity;
    private String itemType;
    private int itemPoints;
    private int inventoryLimit;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getItemPoints() {
        return itemPoints;
    }

    public void setItemPoints(int itemPoints) {
        this.itemPoints = itemPoints;
    }

    public int getInventoryLimit() {
        return inventoryLimit;
    }

    public void setInventoryLimit(int inventoryLimit) {
        this.inventoryLimit = inventoryLimit;
    }

    @Override
    public String toString() {
        return "inventory{" + "quantity=" + quantity + ", itemType=" + itemType + ", itemPoints=" + itemPoints + ", inventoryLimit=" + inventoryLimit + '}';
    }

    public inventory() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.quantity;
        hash = 97 * hash + Objects.hashCode(this.itemType);
        hash = 97 * hash + this.itemPoints;
        hash = 97 * hash + this.inventoryLimit;
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
        final inventory other = (inventory) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        if (this.itemPoints != other.itemPoints) {
            return false;
        }
        if (this.inventoryLimit != other.inventoryLimit) {
            return false;
        }
        return true;
    }
            
    
}
