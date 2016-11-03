/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.viewlayer;

import java.util.Scanner;
import byui.cit260.fireswamp.model.Character;
import byui.cit260.fireswamp.control.GameControl;

/**
 *
 * @author kellyjohnson
 */
public class StartCluesView {
    
    public void displayCluesView() {
        
        boolean done = false; 
        
        do {
            String clueOption = this.getClueOption();
            if (clueOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            done = this.doAction(clueOption);
            
        } while (!done);
}

    public boolean doAction(String clueOption) {
        choice = choice.toUpperCase();
        switch (choice) {
            case "N":
                break;
            case "E":
                this.useEyesability();
                break;
            case "L":
                this.useListenability();
                break;
            case "S":
                this.useSmellability();
                break;
            case "B":
                this.showMainMenuView();
                break;
        }
        return false;
    }
    private void displayNextView(Character character) {
        System.out.println("\n==============="
        + "\n Welcome to the clue menu "
        + "\n cChoose wisely!"
        + "\n=============");
        
        MainMenuView mainMenuView = new MainMenuView()
        mainMenuView.displayMainMenuView();

    }