/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.viewlayer;

import byui.cit260.fireswamp.model.Map;
import fireswamp.FireSwamp;
import java.util.Scanner;

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
                System.out.print(locationType + map.getLocationAt(row, col).getItem().getItemName().charAt(0) + " ");
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
        System.out.println("*** moveNorth() function called");
    }
    private void moveEast() {
        System.out.println("*** moveEast() function called");
    }
    private void moveSouth() {
        System.out.println("*** moveSouth() function called");
    }
    private void moveWest() {
        System.out.println("*** moveWest() function called");
    }
    private void saveGame() {
        System.out.println("*** saveGame() function called");
    }
    private void help() {
        System.out.println("*** help() function called");
    }
    private void back() {
        System.out.println("*** back() function called");
    }
    
}
