/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.control;

import fireswamp.FireSwamp;
import byui.cit260.fireswamp.model.Character;
/**
 *
 * @author kellyjohnson
 */
public class GameControl {
    
    public static Character createCharacter(String name) {
        
        if (name == null) {
            return null;
         }
        
        Character character = new Character();
        character.setName(name);
        
        FireSwamp.setCharacter(character);
        
        return character;
        
    }
}
