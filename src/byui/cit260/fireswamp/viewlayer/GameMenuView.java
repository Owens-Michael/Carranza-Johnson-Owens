/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.viewlayer;

import byui.cit260.fireswamp.model.Map;
import fireswamp.FireSwamp;
import java.util.Scanner;
import outcome.Lose;
/**
 *
 * @author kellyjohnson
 */
public class GameMenuView extends View {

    public GameMenuView() {

                super("\n**************************"
                + "\n------------------"
                + "\n| Game Menu                  *"
                + "\n| Q - Quit                     *"
                + "\n| V - View map                 *"
                + "\n| O - look                    *"
                + "\n| Q - Listen                   *"
                + "\n| M - Smell                    *"
                + "\n| T - Take Item                *"
                + "\n| N - Move North               *"
                + "\n| E - Move East                *"
                + "\n| S - Move South               *"
                + "\n| W - Move West                *"
                + "\n| G - Save Game                *"
                + "\n| H - Help                     *"
                + "\n| B - Back                     *"
                + "\n|******************************"
                + "\n\n Enter command: ");
    
    }
    @Override
    public boolean doAction(String choice) {
        
        choice  = choice.toUppercase();
        
        switch(choice) {
            case 'V':
                this.displayMap();
                break;
            case 'Q':
                this.look();
                break;
            case 'L':
                this.listen();
                break;
            case 'M':
                this.smell();
                break;
            case 'T':
                this.takeItem();
                break;
            case 'N':
                this.moveNorth();
                break;
            case 'E':
                this.moveEast();
                break;
            case 'S':
                this.moveSouth();
                break;
            case 'W':
                this.moveWest();
                break;
            case 'G':
                this.saveGame();
                break;
            case 'H':
                this.help();
                break;
            case 'B':
                this.back();
                break;
        }
        
        return false;
    }
        
    
    private void displaymap() {
        Map map =  FireSwamp.getCurrentGame().getGameMap();
        for(int row = 0; row < Map.ROWS; row++) {
            for(int col = 0; col < Map.COLUMNS; col++) {
                char locationType = map.getLocationAt(row, col).getLocationType().toString().charAt(0);
       // fix this         map[row][col];
                System.out.print(locationType);
                if(map.getLocationAt(row, col).getItem() != null) {
                    System.out.print(map.getLocationAt(row, col.getItem().getItemName().charAt(0)));
                }
              System.out.print("  ");
            }
            System.out.println("");
        }
    }
            
            // 1:17:40
            System.out.println("");
          }
        }
    private void look() {
        
        System.out.println("*** look() function called");
    }
        private void listen() {
        System.out.println("*** listen() function called");
    }
    private void smell() {
        System.out.println("*** smell() function called");
    }
    private void takeItem() {
        System.out.println("*** takeItem() function called");
    }
    private void moveNorth() {
        MoveControl moveControl = new MoveControl();
        if(moveControl.moveNorth(FireSwamp.getGame()) == false) {
            console.println("Sorry, try another direction");
            throw new LoseGame("After all that?! Try again. Never give up. Never surrender!");
    }
    private void moveEast() {
        MoveControl moveControl = new MoveControl();
        if(moveControl.moveEast(FireSwamp.getGame()) == false) {
            console.println("That move is illegal. If you try that again I'll send the Rodents of unusual size after you.");
        }
    }
    private void moveSouth() {
        MoveControl moveControl = new MoveControl();
        if(moveControl.moveSouth(FireSwamp.getGame()) == false) {
            console.println("That move is illegal. If you try that again He really will cut the rope you and send you too your doom off the clifs of Insanity.");
        }
    }
    private void moveWest() {
        MoveControl moveControl = new MoveControl();
        if(moveControl.moveWast(FireSwamp.getGame()) == false) {
            console.println("That move is illegal. If you try that again I'll make sure the shreeking eels are hungry this time");
        }
    }
    private void saveGame() {
        System.out.println("*** saveGame() function called");
    }
    private void help() {
        System.out.println("*** help() function called");
    }
    private void displayMap(){
        console.println(FirewSwamp.getGame().getMap().getMapString());
}
    private void back() {
        System.out.println("*** back() function called");
    }
    
}
