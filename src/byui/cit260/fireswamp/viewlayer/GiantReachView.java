/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.viewlayer;

import byui.cit260.fireswamp.control.GiantReachControl;
import java.util.Scanner;

/**
 *
 * @author kellyjohnson
 */
public class GiantReachView {
    
    private double diameter;
    
    
    
    @Override
    public void display() {
        // randomly generate value or grab it from player's current locaiton
    
    Random r = new Random();
    diameter = r.nextInt(5) + 5;    
        // display problem to user
        System.out.println("You have met the Giant."
                + "\nOnce he reaches you he never lets go."
                + "\n He can reach up to"+ diameter +"5 feet."
                + "\n How far do you need to circle him to make it safely around?");
        
        //collect input
        String input = getInput();
        
        //validate input
        boolean isCorrect = doAction(input);
        //present user with results
               if(isCorrect) {
                   System.out.println("you made it!.");
                } else {
                   System.err.println("you got captured");
    }
    @Override
    public String getInput() {

        Scanner in = new Scanner(System.in);  // get infile for keyboard 
        String input = " ";  // value to be returned 
        boolean validInput = false;  // initialize to not valid 

        while (!validInput) {  // loop while an invalid value is enter 

            input = in.nextLine();  // get next line typed on keyboard 
            input = input.trim();  // trim off leading and trailing blanks 
            input = input.toUpperCase();  // converts input to upper case
            try {
                Double.parseDouble(input);
                validInput = true;
            
            } catch (Exception e) {
                System.out.println("\nInvalid value: You must enter a number.");
            }

            
         } 

        return input;  // return the value entered
    }

    
    public boolean doAction(String value) {
        double input = Double.parseDouble(value);
        
        GiantReachControl grc = new GiantReachControl();
        double actualAnswer = grc.calcGiantReach(diameter);
        return (int)acutalAnswer == (int)input;
        }
    }
    
    
    
    
    
}
