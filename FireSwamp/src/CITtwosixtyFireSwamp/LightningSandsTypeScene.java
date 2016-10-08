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
public class LightningSandsTypeScene implements Serializable{
    
    // class instance variables
    private String lighteningFormula;
    private String outcomeTrue;
    private String outcomeFalse;
    private String attribute;

    public LightningSandsTypeScene() {
    }

    
    public String getLighteningFormula() {
        return lighteningFormula;
    }

    public void setLighteningFormula(String lighteningFormula) {
        this.lighteningFormula = lighteningFormula;
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

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.lighteningFormula);
        hash = 67 * hash + Objects.hashCode(this.outcomeTrue);
        hash = 67 * hash + Objects.hashCode(this.outcomeFalse);
        hash = 67 * hash + Objects.hashCode(this.attribute);
        return hash;
    }

    @Override
    public String toString() {
        return "LightningSandsTypeScene{" + "lightening=" + lighteningFormula + ", outcomeTrue=" + outcomeTrue + ", outcomeFalse=" + outcomeFalse + ", attribute=" + attribute + '}';
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
        final LightningSandsTypeScene other = (LightningSandsTypeScene) obj;
        if (!Objects.equals(this.lighteningFormula, other.lighteningFormula)) {
            return false;
        }
        if (!Objects.equals(this.outcomeTrue, other.outcomeTrue)) {
            return false;
        }
        if (!Objects.equals(this.outcomeFalse, other.outcomeFalse)) {
            return false;
        }
        if (!Objects.equals(this.attribute, other.attribute)) {
            return false;
        }
        return true;
    }
    
    
    
}
