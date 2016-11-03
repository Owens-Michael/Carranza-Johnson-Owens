/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.viewlayer;


import byui.cit260.fireswamp.model.Character;
import byui.cit260.fireswamp.viewlayer.HelpMenuView;
import byui.cit260.fireswamp.control.GameControl;
import byui.cit260.fireswamp.model.Scene;
/**
 *
 * @author dayanacarranza
 */
public class InventoryManagementView {
    
    public void displayInventoryManagementView(){
        boolean done = false;
        do {
            
            String inventoryOption = this.getInventoryOption();
            if (inventoryOption.toUpperCase().equals("Q"))
                    return;
            
            done = this.doAction(inventoryOption);
        }while (!done);
        
    }
    private void displayBanner(){
        System.out.println(
        "\n Hear Ye Hear Ye The banner of answers");
        
    }
    public boolean doAction(String InventoryOption){
        choice = choice.toUpperCase();
       switch(choice){
           case "L":
                this.lookingForItems();
                break;
           case "G":
               this.gettingItems();
               break;
           case "U":
               this.usingItems();
               break;
           case "B":
                this.returnExistingGame();
                break;
       }
       return false;
       
    }
private void displayNextView(Character character) {
    System.out.println("\n Management your invemtory");
    
    MainMenuView mainMenuView = new MainMenuView();
    
    mainMenuView.displayMainMenuView();
            
}   


    
