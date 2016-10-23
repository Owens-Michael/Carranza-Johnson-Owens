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
    
    public double CalcHeightOfRous(double userAnswer, double length, double height, double potions){
        
       if (userAnswer > height) {
               return 1;
    }
       if (userAnswer < height && potions >= 1) {
               potions--;
           return 1;
       }
       if(userAnswer < height && potions < 1){
           return 0;
       }
       
        double rnglength = 1 + (int)(Math.random() * 15);
        double Height = (rnglength/2.0)+0.5;
        return Height;
        
    }
    
}
