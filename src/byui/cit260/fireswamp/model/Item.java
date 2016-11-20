/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author dayanacarranza
 */
public class Item implements Serializable{

    private static String Rope;
    private static String Potion;
    private static String Extinguisher;
    
    private String inventoryType;
    private Double quantityInStock;
   

    public Item() {
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public Double getQuantityInStock() {
        return quantityInStock;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public void setQuantityInStock(Double quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

 

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.inventoryType);
        hash = 37 * hash + Objects.hashCode(this.quantityInStock);
       
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
        return Objects.equals(this.quantityInStock, other.quantityInStock);
    }
    
    @Override
    public String toString() {
        return "Item{" + "inventoryType=" + inventoryType + ", quantityInStock=" + quantityInStock +'}';
    }
    public static void main(String[] arg) {
       
       ArrayList<String> Item;
        Item = new ArrayList<>();
            Item.add(Potion);
            Item.add(Rope);
            Item.add(Extinguisher);
          System.out.println("My Items: ");
          Item.forEach((i) -> {
              System.out.println(i);
        });  
                 
    }       

    public void setItemDescription(String a_heal_all_Potion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setItemName(String potion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setQuantity(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
