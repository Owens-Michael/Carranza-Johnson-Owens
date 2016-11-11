/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.viewlayer;

import java.util.Scanner;

/**
 *
 * @author kellyjohnson
 */
public class GameMenuView extends View {

    private final String menu

   = "\n"
                + "\n------------------"
                + "\n| Game Menu      |"
                + "\n------------------"
                + "\n MORE OPTIONS HERE"
                + "\nQ - Quit"
                + "\n-----------------";
    
    
    @Override
    public boolean doAction(String input) {
        
        char value = input.charAt(0);
        
        switch(value) {
            case 'N':
                
                break;
            case 'Q':
                return true;
        }
        
        return false;
    }
    
}
