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
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n------------------"
                + "\n| Main Menu      |"
                + "\n------------------"
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - get help on how to play the game"
                + "\nS - Save game"
                + "\nQ - Quit"
                + "\n-----------------");
    }
    @Override
    public boolean doAction(String input) {
        
        char value = input.charAt(0);
        
        switch(value) {
            case 'N':
                newGame();
                break;
            case 'Q':
                return true;
        }
        
        return false;
    }

    private void newGame() {
        GameMenuView gmv = new GameMenuView();
        gmv.display();
    }
    
}
