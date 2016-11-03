/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.viewlayer;


import byui.cit260.fireswamp.model.Character;
import byui.cit260.fireswamp.viewlayer.HelpMenuView;
import byui.cit260.fireswamp.control.GameControl;

/**
 *
 * @author dayanacarranza
 */
public class MovementView {




    public void MovementView() {
        
        boolean done = false;
        
        do {
            String movementOption = this.getMovementOption();
            if(movementOption.toUpperCase().equals("Q"))
                return;
            
          done = this.doAction(movementOption);
          
        } while(!done);
       
    }
    private void displayBanner(){
        System.out.println(
        "\n There is 5 option for you to move. E = East, N = North, W = West, S = South, and B = return. ");
       
    }
    public boolean doAction(String movementOption){
        choice = choice.topUpperCase();
       switch (choice) {
         case "E":
             this.MoveEast();
             break;
         case "W":
             this.MoveWest();
             break;
         case "N":
             this.MoveNorth();
             break;
         case "S":
             this.MoveSouth();
             break;
         case "B":
             this.MoveBack();
             break;
       }
       return false;
    }

    private void startExitingGame(Character character) {
     System.out.println("\n Return to the game");
        }
    MainMenuView mainMenuView = new MainMenuView()
            mainMenuView.displayMainMenuView();  
}
