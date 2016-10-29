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
public class RousTypeScene implements Serializable {
    
    private double height;
    private String outcomeTrue;
    private String outcomeFalse;

    public RousTypeScene() {
    }

    
    

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getOutcomeTrue() {
        return outcomeTrue;
    }

    public void setOutcomeTrue(String outcomeTrue) {
        this.outcomeTrue = outcomeTrue;
    }

    public String getOutcomeFalse() {
        return outcomeFalse;
    }

    public void setOutcomeFalse(String outcomeFalse) {
        this.outcomeFalse = outcomeFalse;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.height) ^ (Double.doubleToLongBits(this.height) >>> 32));
        hash = 47 * hash + Objects.hashCode(this.outcomeTrue);
        hash = 47 * hash + Objects.hashCode(this.outcomeFalse);
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
        final RousTypeScene other = (RousTypeScene) obj;
        if (Double.doubleToLongBits(this.height) != Double.doubleToLongBits(other.height)) {
            return false;
        }
        if (!Objects.equals(this.outcomeTrue, other.outcomeTrue)) {
            return false;
        }
        if (!Objects.equals(this.outcomeFalse, other.outcomeFalse)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RousTypeScene{" + "height=" + height + ", outcomeTrue=" + outcomeTrue + ", outcomeFalse=" + outcomeFalse + '}';
    }
    
    
}
