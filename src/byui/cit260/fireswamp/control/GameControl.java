/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.control;
import fireswamp.FireSwamp;
import byui.cit260.fireswamp.model.Character;
import byui.cit260.fireswamp.model.Map;
import byui.cit260.fireswamp.model.Game;
import byui.cit260.fireswamp.model.Item;
import byui.cit260.fireswamp.model.Location;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameControl {

    public void createNewGame(Character character) {
        Game currentGame = new Game();
        currentGame.setGameCharacter(character);
        Map map = new Map();
        map.init();
        currentGame.setGameMap(map);
        
        createAndAssignItems(map);
        
        FireSwamp.setCurrentGame(currentGame);
    
}
private void createAndAssignItems(Map map) {
    List<Item> items = new ArrayList<>();
    
    Item rope = new Item();
    rope.setItemDescription("a strong rope");
    rope.setItemName("rope");
    rope.setQuantity(1);
    items.add(rope);
    
    Item kidneyStone = new Item();
    kidneyStone.setItemDescription("a kidney stone from a goat to heal near death experiences");
    kidneyStone.setItemName("kidneyStone");
    kidneyStone.setQuantity(1);
    items.add(kidneyStone);
    
    Random rand = new Random();
    
    for(Item item : items) {
        boolean placed = false;
        while(!placed) {
            int randomRow = rand.nextInt(Map.ROWS);
            int randomCol = rand.nextInt(Map.COLUMNS);

            Location location = map.getLocationAt(randomRow, randomCol);
            if(location.getItem() == null) {
                location.setItem(item);
                placed = true;
            }
        }   
    }
}
/**
 *
 * @author kellyjohnson
 */
    
    public static Character createCharacter(String name) {
        
        if (name == null) {
            return null;
         }
        
        Character character = new Character();
        character.setCharacterName(name);
        
        FireSwamp.setCharacter(character);
        
        return character;
        
    }
    
    public static void createNewGame(String characterName) {
        System.out.println("\n createNewGame() function called ***");
    }
    
}
