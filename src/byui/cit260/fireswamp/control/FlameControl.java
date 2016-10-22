/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.control;

/**
 *
 * @author mnowe
 */
public class FlameControl {
    
    public double CylinderCalc( double radius, double height, double pi) {
        
        if (radius <= 0) {
            return -1;
        }
        
        if (radius > 10) {
            return -1;
        }
        
        if (height < 0) {
            return -1;         
        }
        
        if (height > 15) {
            return -1;
        }
        
        double cylinderVol = (Math.PI * Math.pow(radius, 2) * height);
        return cylinderVol;
    }
}
