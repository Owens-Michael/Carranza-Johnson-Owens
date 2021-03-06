/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author dayanacarranza
 */
public class Game implements Serializable{
   
    
    private String totalTime;
    private String noPeople;

    public Game() {
    }

    public String getTotalTime() {
        return totalTime;
    }

    public String getNoPeople() {
        return noPeople;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public void setNoPeople(String noPeople) {
        this.noPeople = noPeople;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.totalTime);
        hash = 47 * hash + Objects.hashCode(this.noPeople);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.totalTime, other.totalTime)) {
            return false;
        }
        return Objects.equals(this.noPeople, other.noPeople);
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", noPeople=" + noPeople + '}';
    }
    
    
}
