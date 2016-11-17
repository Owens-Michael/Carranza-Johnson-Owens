/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireswamp;
import byui.cit260.fireswamp.model.Game;
import byui.cit260.fireswamp.model.Character;
import byui.cit260.fireswamp.viewlayer.StartProgramView;
/**
 *
 * @author kellyjohnson
 */
public class FireSwamp {
   
    private static Game currentGame = null;
    private static Character character = null;
    
    public static Game getCurrentGame() {
        return currentGame;
    }
    public static void setCurrentGame(Game currentGame) {
        FireSwamp.currentGame = currentGame;
    }
    public static void setCharacter(Character character) {
        FireSwamp.character = character;
    }
    public static Character getCharacter() {
        return FireSwamp.character;
    }
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
    }
}
