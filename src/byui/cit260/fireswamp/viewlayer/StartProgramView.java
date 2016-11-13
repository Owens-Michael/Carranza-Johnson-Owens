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
public class StartProgramView extends View{

    private String promptMessage;

    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name: ";
        this.displayBanner();

    }

    public void displayBanner() {
        System.out.println( 
                    "\n*************************************************************************"
                   +"\n*                                                                       *"
                   +"\n* The fire swamp of Florin is famous for being deadly to all who enter. *"
                   +"\n* You are being pursued by enemies and they have driven you toward the  *"
                   +"\n* fire swamp. You have no choice but to take your chances in the swamp  *"
                   +"\n* in order to escape. The swamp is dark and musty, with no visible path.*"
                   +"\n* As you enter, you feel your heart beat faster with fear.              *"
                   +"\n*                                                                       *"         
                   +"\n* This game recreates the fire swamp on a grid, with hazards on some    *"
                   +"\n* squares and helpful items on others, placed randomly. As you travel   *"
                   +"\n* through the swamp, you can pick up helpful items, and when you land   *"
                   +"\n* on a square with a hazard, you will have to answer a math question to *"
                   +"\n* pass through safely. If you do not answer the question correctly, you *"
                   +"\n* will need to have a helpful item in your inventory that matches the   *"
                   +"\n* hazard in order to be safe. If you do not, you will perish in the     *"
                   +"\n* fire swamp.                                                           *"
                   +"\n*                                                                       *"
                   +"\n*************************************************************************"
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
                System.out.println("\nTry again. Your name isn't a secret, so feel free to share it or make one up for your player");
                continue;
            }
            break;
        }
        return value;
    }

    @Override
    public boolean doAction(String name) {
        if (name.length() < 2) {
            System.out.println("\nInvalid players name: " 
                    + "The name must be greater than one character in length");
            return false;
        }
        Character character = GameControl.createCharacter(name);
        
        if (character == null) {
            System.out.println("\nError creating the player.");
            return false;
        }
        this.displayNextView(character);
        
        return true;
    }

    private void displayNextView(Character character) {
        System.out.println(
                  "\n===================================="
                + "\n Welcome to the game " + character.getName()
                + "\n Watch your step in the Fire Swamp!"
                + "\n====================================");

        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.displayMainMenuView();

    }

}
