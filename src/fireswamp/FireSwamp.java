/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireswamp;
import byui.cit260.fireswamp.Character;
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
    }
    
}
