/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.control;

import java.io.Serializable;

/**
 *
 * @author mnowe
 */
public class RousTypeSceneControl implements Serializable {

    public double calcHeightOfRous(double length) {

        if (length <= 0 || length >= 10) {
            return -1;
        }
        
        double height = (length / 2.0) + 0.5;
        return height;

    }

}
