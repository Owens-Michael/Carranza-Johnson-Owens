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
public class Map implements Serializable{
    
    private String rowCount;
    private String columnCount;

    public Map() {
    }

    /**
     *
     * @return
     */
    public String getRowCount() {
        return rowCount;
    }

    public String getColumnCount() {
        return columnCount;
    }

    public void setRowCount(String rowCount) {
        this.rowCount = rowCount;
    }

    public void setColumnCount(String columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.rowCount);
        hash = 23 * hash + Objects.hashCode(this.columnCount);
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.rowCount, other.rowCount)) {
            return false;
        }
        return Objects.equals(this.columnCount, other.columnCount);  
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }

 
}    