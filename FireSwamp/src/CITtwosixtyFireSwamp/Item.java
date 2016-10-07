/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITtwosixtyFireSwamp;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author dayanacarranza
 */
public class Item implements Serializable{
   
    
    private String inventoryType;
    private Double quantityInStock;
    private Double requireAmount;

    public Item() {
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public Double getQuantityInStock() {
        return quantityInStock;
    }

    public Double getRequireAmount() {
        return requireAmount;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public void setQuantityInStock(Double quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public void setRequireAmount(Double requireAmount) {
        this.requireAmount = requireAmount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.inventoryType);
        hash = 37 * hash + Objects.hashCode(this.quantityInStock);
        hash = 37 * hash + Objects.hashCode(this.requireAmount);
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
        final Item other = (Item) obj;
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (!Objects.equals(this.quantityInStock, other.quantityInStock)) {
            return false;
        }
        return Objects.equals(this.requireAmount, other.requireAmount);
    }

    @Override
    public String toString() {
        return "Item{" + "inventoryType=" + inventoryType + ", quantityInStock=" + quantityInStock + ", requireAmount=" + requireAmount + '}';
    }
            
    
}
