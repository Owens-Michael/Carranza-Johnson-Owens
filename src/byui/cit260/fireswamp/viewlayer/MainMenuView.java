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
public MainMenuView extends View () {

    super("\n"
                + "\n-------------------------------"
                + "\n-------------------------------"
                + "\n| Survive the Fire Swamp      |"
                + "\n-------------------------------"
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - Help"
                + "\nS - Save game"
                + "\nQ - Quit"
                + "\n-------------------------------");
    }
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();

        switch (value) {
            case "N":
                this.startNewGame();
                break;
            case "G":
                this.getSavedGame();
                break;
            case "H":
                this.help();
                break;
            case "S":
                this.saveGame();
                break;
            case "Q":
                this.quit();
                break;
            }
            return false;
        }
        private void loadSavedGame () {
           System.out.println("*** loadSavedGame() function called");
           
           System.exit(0);
        }
        private void startNewGame() {
            GameControl gc = new GameControl();
            gc.createNewGame(FireSwamp.getCharacter());
            GameMenuView gameMenu = new GameMenuView();
            game.display();
}
}