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
public class FlameSpurtTypeScene implements Serializable{
    
    //class instant variables
    private String flameFormula;
    private String outcomeTrue;
    private String outcomeFalse;
    private String attribute;

    public FlameSpurtTypeScene() {
    }
    
    

    public String getFlameFormula() {
        return flameFormula;
    }

    public void setFlameFormula(String flameFormula) {
        this.flameFormula = flameFormula;
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
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.flameFormula);
        hash = 41 * hash + Objects.hashCode(this.outcomeTrue);
        hash = 41 * hash + Objects.hashCode(this.outcomeFalse);
        hash = 41 * hash + Objects.hashCode(this.attribute);
        return hash;
    }

    @Override
    public String toString() {
        return "FlameSpurtTypeScene{" + "flameFormula=" + flameFormula + ", outcomeTrue=" + outcomeTrue + ", outcomeFalse=" + outcomeFalse + ", attribute=" + attribute + '}';
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
        final FlameSpurtTypeScene other = (FlameSpurtTypeScene) obj;
        if (!Objects.equals(this.flameFormula, other.flameFormula)) {
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
