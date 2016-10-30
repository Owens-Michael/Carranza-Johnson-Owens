/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.viewlayer;

/**
 *
 * @author kellyjohnson
 */
public class WelcomeView {
    public String PromptMessage;
        public WelcomeView (){
            this.PromptMessage= "\nPlease enter your name";
            this.displayBanner();
    }

    private void displayBanner() {
        System.out.println("\nThe fire swamp of Florin is famous for being deadly to all who enter. You are being\n" +
"\n" +
"pursued by enemies and they have driven you toward the fire swamp. You have no choice but\n" +
"\n" +
"to take your chances in the swamp in order to escape. The swamp is dark and musty, with no\n" +
"\n" +"visible path. As you enter, you feel your heart beat faster with fear.\n" +
"\n" +"This game recreates the fire swamp on a grid, with hazards on some squares and helpful items\n" +"\n" +"on others, placed randomly. As you travel through the swamp, you can pick up helpful items,\n" +"\n" +"and when you land on a square with a hazard, you will have to answer a math question to pass\n" +"\n" +"through safely. If you do not answer the question correctly, you will need to have a helpful item\n" +
"\n" +"in your inventory that matches the hazard in order to be safe. If you do not, you will perish in\n" +
"\n" +"the fire swamp.");
    }
/**
 * displays the start program view
 */
    public void displayWelcomView() {
        
        boolean done = false; // set flag to not done
        /*
        do {
            // prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // user wants to quit
                // do the requested action and display the next view 
                done = this.doAction(playersName);
        } while (!done);
      */
    System.out.println("\nwelcomeView()function called");
    }

    private String getPlayersName() {
       System.out.println("\n*** getPlayersName() called ***");
       return "Joe";
    }

    private boolean doAction(String playersName) {
        System.out.println("\n*** doAction() called ***");
        return true;
    }
}
