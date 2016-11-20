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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Comparator;

public class GameControl {

    /**
     *
     * @param character
     */
    public static void createNewGame(Character character) {
        Game game = new Game();
        game.setGameCharacter(character);
        Map gameMap = new Map();
        map.init();
        game.setMap(gameMap);
        character.setLocation(gameMap.getLocation(0, 0));
        
        createAndAssignItems(map);
        
        FireSwamp.setCurrentGame(game);
        
}
private void createAndAssignItems(Map map) {
    List<Item> items = new ArrayList<>();
    
    Item Rope;
        Rope = new Item();
    Rope.setItemDescription("a strong rope");
    Rope.setItemName("rope");
    Rope.setQuantity(1);
    items.add(Rope);
    
    Item Potion = new Item();
    Potion.setItemDescription("a heal all Potion");
    Potion.setItemName("Potion");
    Potion.setQuantity(1);
    items.add(Potion);
    
    Random rand = new Random();
    
    items.forEach((item) -> {
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
        });
}
/**
 *
 * @author kellyjohnson
 */
    
    public static Character createCharacter(String characterName) {
        
        if (characterName == null) {
            return null;
         }
        
        Character character = new Character();
        character.setCharacterName(characterName);
        
        FireSwamp.setCharacter(character);
        
        return character;
        
    }
    
    public static void createNewGame(String characterName) {
        System.out.println("\n createNewGame() function called ***");
    }
    
    public static void saveGame(String filePath) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(FireSwamp.getGame());
        } catch(Exception e) {
            ErrorView.display("GameControl", e.getMessage());
        }
    }
    
    public static void loadGame(String filePath) {
        Game game = null;
        
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            game = (Game)ois.readObject();
            
            FireSwamp.setGame(game);
            FireSwamp.setCharacter(game.getCharacter());
        } catch (Exception e) {
            ErrorView.display("GameControl", e.getMessage());
        }
    }
    Collections.sort(Item<I> list, Comparator<? super I> c);
    Collections.reverse(Item);
    System.out.println("These are the items:" + Item);
}
