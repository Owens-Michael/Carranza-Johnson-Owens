/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireswamp;
import byui.cit260.fireswamp.Character;
import byui.cit260.fireswamp.FlameSpurtTypeScene;
import byui.cit260.fireswamp.LightningSandsTypeScene;
import byui.cit260.fireswamp.Game;
import byui.cit260.fireswamp.Item;
import byui.cit260.fireswamp.Map;
import byui.cit260.fireswamp.Scene;

/**
 *
 * @author kellyjohnson
 */
public class FireSwamp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Character characterOne= new Character();  
characterOne.setName("Dayana");
characterOne.setDescription("collegeStudent");
characterOne.setCoordinates(87.00);
String characterInfo= characterOne.toString();
System.out.println(characterInfo);

FlameSpurtTypeScene flameSpurtTypeSceneOne = new FlameSpurtTypeScene();
flameSpurtTypeSceneOne.setOutcomeTrue("True");
String flameSpurtTypeSceneInfo= flameSpurtTypeSceneOne.toString();
System.out.println(flameSpurtTypeSceneInfo);

Scene sceneOne = new Scene();
sceneOne.setDescription("Tarpits");
String sceneInfo= sceneOne.toString();
System.out.println(sceneInfo);


LightningSandsTypeScene lightningSandsTypeSceneOne = new LightningSandsTypeScene();
lightningSandsTypeSceneOne.setOutcomeTrue("true");
String lightningSandsTypeSceneInfo= lightningSandsTypeSceneOne.toString();
System.out.println(lightningSandsTypeSceneInfo);
    }
    
}
