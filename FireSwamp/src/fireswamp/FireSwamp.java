/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireswamp;
import CITtwosixtyFireSwamp.Character;
/* I am commenting these out due to netbeans saying they are unused. Perhaps they will be useful in the future so I am keeping the code
*import CITtwosixtyFireSwamp.FlameSpurtTypeScene;
*import CITtwosixtyFireSwamp.LightningSandsTypeScene;
*import CITtwosixtyFireSwamp.Game;
*import CITtwosixtyFireSwamp.Item;
*import CITtwosixtyFireSwamp.Map;
*import CITtwosixtyFireSwamp.Scene;
*/
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
