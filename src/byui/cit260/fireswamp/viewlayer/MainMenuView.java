/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.viewlayer;
import byui.cit260.fireswamp.model.Character;
/**
 *
 * @author kellyjohnson
 */
public class MainMenuView {
    public void displayMainMenuView() {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
        } while (!done);
        }

    private String getMenuOption() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean doAction(String menuOption) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

    private String menu;
    
    public MainMenuView() {
        this.menu = "\n"
                  + "\n------------------"
                  + "\n| Main Menu      |"
                  + "\n------------------"
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - get help on how to play the game"
                + "\nS - Save game"
                + "\nQ - Quit"
                + "\n-----------------";
    }
   private void displayMainMenuView() {
        System.out.println("\n============="
        + "\n Welcome to the game " + character.getName()
        + "\n We hope you have a lot of fun!"
        + "\n================"
        );
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }
    
}
