/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.viewlayer;

import byui.cit260.fireswamp.model.Character;
import byui.cit260.fireswamp.viewlayer.GameMenuView;
import byui.cit260.fireswamp.control.GameControl;

/**
 *
 * @author kellyjohnson
 */
public class HelpMenuView extends View{

    public HelpMenuView() {
    super("\n"
                  + "\n------------------"
                  + "\n| Help Menu      |"
                  + "\n------------------"
                + "\nM - How to move"
                + "\nI - Purpose of items"
                + "\nC - Clues to discover dangers"
                + "\nD - Description of obsticales"
                + "\nR - Return to game"
                + "\n-----------------");
    }
    
    private void startNewGame() {
        GameControl.createNewGame(FireSwamp.getCharacter());

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    public void displayMainMenuView() {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) {
                return;
            }

            done = this.doAction(menuOption);
        } while (!done);
    }

    private String getMenuOption() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean doAction(String menuOption) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

