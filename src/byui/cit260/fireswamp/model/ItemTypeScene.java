/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.fireSwamp.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author michaelowens
 */
public class ItemTypeScene implements Serializable{
    
    private String typeOfItems;

    public ItemTypeScene() {
    }

    public String getTypeOfItems() {
        return typeOfItems;
    }

    public void setTypeOfItems(String typeOfItems) {
        this.typeOfItems = typeOfItems;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.typeOfItems);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemTypeScene other = (ItemTypeScene) obj;
        if (!Objects.equals(this.typeOfItems, other.typeOfItems)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ItemTypeScene{" + "typeOfItems=" + typeOfItems + '}';
    }
    
    
    
}
