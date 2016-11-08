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
public class LightningSandControl implements Serializable {

    public double CalcCircleSize(double diameter, double pi) {

        if (diameter <= 0) {
            return -1;
        }

        if (diameter > 20) {
            return -1;
        }

        double radius = diameter / 2;
        double surfaceArea = (Math.PI * Math.pow(radius, 2) / 2);
        return surfaceArea;

    }

}
