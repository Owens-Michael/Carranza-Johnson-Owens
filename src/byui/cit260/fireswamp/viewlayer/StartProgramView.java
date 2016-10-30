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
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name: ";
        this.displayBanner();
        
        
    }

    private void displayBanner() {
        System.out.println(
                "\nThe fire swamp of Florin is famous for being deadly to all who enter. You are being\n" +"\n" +"pursued by enemies and they have driven you toward the fire swamp. You have no choice but\n" +"\n" +"to take your chances in the swamp in order to escape. The swamp is dark and musty, with no\n" +
"\n" +"visible path. As you enter, you feel your heart beat faster with fear.\n" +
"\n" +"This game recreates the fire swamp on a grid, with hazards on some squares and helpful items\n" +"\n" +"on others, placed randomly. As you travel through the swamp, you can pick up helpful items,\n" +"\n" +"and when you land on a square with a hazard, you will have to answer a math question to pass\n" +"\n" +"through safely. If you do not answer the question correctly, you will need to have a helpful item\n" +
"\n" +"in your inventory that matches the hazard in order to be safe. If you do not, you will perish in\n" +"\n" +"the fire swamp."
        );
    }

    
    public void displayStartProgramView() {
        
        boolean done = false;
    
        do {
            String charactersName = this.getCharactersName();
            if (charactersName.toUpperCase().equals("Q"))
                return;
            
            
            done = this.doAction(charactersName);
            
        } while (!done);
            
    }

    private String getCharactersName() {
        
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\nInvlaid value: can not be blank");
                continue;
            }
            break;
        }
        return value;
    }

    private boolean doAction(String name) {
        if (name.length() <2){
            System.out.println("\nInvalid players name: " + "The name must be greater than one character in length");
            return false;
        }
        Character character = GameControl.createCharacter(name);
        if (character == null {
            System.out.println("\n*** doAction() called ***");
            return false;
        }
       this.displayNextView(character);
       return true;
    }
public boolean doAction(String choice) {
    choice = choice.toUpperCase();
    switch (choice) {
        case "N":
            break;
        case "G":
            this.startExistingGame();
            break;
        case "H":
            this.displayHelpMenu();
            break;
        case "S":
            this.saveGame();
        default:
            system.out.println("\n*** Invalid selection *** Try again***");
            break;
    }
    return false;
}
    private void displayNextView(Character character) {
        System.out.println("\n==============="
        + "\n Welcome to the game "
        + "\n We hope you have a lot of fun!"
        + "\n=============");
        
        MainMenuView mainMenuView = new MainMenuView()
        mainMenuView.displayMainMenuView();

    }
    
    
}
