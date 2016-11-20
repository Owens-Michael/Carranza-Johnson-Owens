/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Michael and Kelly
 */
public class Map implements Serializable{
    
    public static final int ROWS = 5;
    public static final int COLUMNS = 5;
    private Location[][] matrix = new Location[ROWS][COLUMNS];
    private Location mapEntrance;
    private Location mapExit;
    
    //private String rowCount;
    //private String columnCount;

    public Map() {
    }

    public void init() {
        Random rand = new Random();
            for(int row = 0; row < ROWS; row++) {
            for(int col = 0; col < COLUMNS; col++) {
               int randLocation = rand.nextInt(LocationType.values().length);
                Location location = new Location();
                location.setLocationColumn(col);
                location.setLocationRow(row);
                location.setLocationVisited(false);
                

                
                location.setLocationType(LocationType.values()[randLocation]);
                
                matrix[row][col] = location;
            }
        }
    }
    public Location getLocationAt(int row, int col) {
        return matrix[ro]
    }
    
    
    public Location getMapEntrance() {
        return mapEntrance;
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

 public class StartingLocation ()
}    