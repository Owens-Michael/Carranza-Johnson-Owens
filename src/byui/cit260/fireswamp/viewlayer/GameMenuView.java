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
public class GameMenuView {

    private String menu;

    public GameMenuView() {
        this.menu = "\n"
                + "\n------------------"
                + "\n| Game Menu      |"
                + "\n------------------"
                + "\n MORE OPTIONS HERE"
                + "\nQ - Quit"
                + "\n-----------------";
    }

    public void display() {  // displays start program view

        boolean done = false;

        do {
            System.out.println("\n" + this.menu);

            String value = this.getInput();

            done = this.doAction(value);
        } while (!done);
    }

    public String getInput() {

        Scanner in = new Scanner(System.in);  // get infile for keyboard 
        String input = " ";  // value to be returned 
        boolean validInput = false;  // initialize to not valid 

        while (!validInput) {  // loop while an invalid value is enter 

            input = in.nextLine();  // get next line typed on keyboard 
            input = input.trim();  // trim off leading and trailing blanks 
            input = input.toUpperCase();  // converts input to upper case

            if (input.length() < 1) {  // value is blank 
                System.out.println("\nInvalid value: You must enter a character.");
            } else {
                validInput = true;
            }
        }

        return input;  // return the value entered
    }

    public boolean doAction(String input) {
        
        char value = input.charAt(0);
        
        switch(value) {
            case 'N':
                
                break;
            case 'Q':
                return true;
        }
        
        return false;
    }
    
}
