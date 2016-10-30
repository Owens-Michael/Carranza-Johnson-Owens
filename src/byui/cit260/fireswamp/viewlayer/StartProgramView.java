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
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))
                return;
            
            
            done = this.doAction(playersName);
            
        } while (!done);
            
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
