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
 * @author kellyjohnson
 */
public class Scene implements Serializable{
    // class instance variables
    private String description;
    private String displaySymbol;
    private Double blockedLocation;

    public Scene() {
    }

    
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    public Double getBlockedLocation() {
        return blockedLocation;
    }

    public void setBlockedLocation(Double blockedLocation) {
        this.blockedLocation = blockedLocation;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + Objects.hashCode(this.displaySymbol);
        hash = 53 * hash + Objects.hashCode(this.blockedLocation);
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", displaySymbol=" + displaySymbol + ", blockedLocation=" + blockedLocation + '}';
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.displaySymbol, other.displaySymbol)) {
            return false;
        }
        if (!Objects.equals(this.blockedLocation, other.blockedLocation)) {
            return false;
        }
        return true;
    }
     
    
}
