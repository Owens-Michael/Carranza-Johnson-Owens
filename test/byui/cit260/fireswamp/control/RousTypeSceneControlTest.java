/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.control;

import static java.lang.Math.random;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dayanacarranza
 */
public class RousTypeSceneControlTest {
    
    public RousTypeSceneControlTest() {
    }

    /**
     * Test of CalcHeightOfRous method, of class RousTypeSceneControl.
     */
    @Test
    public void testCalcHeightOfRous() {
        System.out.println("CalcHeightOfRous");
        double userAnswer = 2.5;
        double length = 4.0;
        double height = 2.5;
        double potions = 3.0;
        RousTypeSceneControl instance = new RousTypeSceneControl();
        String expResult = "correct";
        double result = instance.CalcHeightOfRous(userAnswer, length, height, potions);
        assertEquals(expResult, result, 1.0);
   
    
    System.out.println("\tTest 2");
    
        userAnswer = 10.00;
        
        length = 5.00;
        
        potions = 1.0;
        
        expResult = "incorrect";
        
        result = instance.CalcHeightOfRous(userAnswer, length, height, potions);
        assertEquals(expResult, result, 1.0);
        
    System.out.println("\tTest 3");
    
        userAnswer = 3.0;
        
        length = 8.0;
        
        potions = 0.0;
        
        expResult = "incorrect and you die";
        
        result = instance.CalcHeightOfRous(userAnswer, length, height, potions);
        assertEquals(expResult, result, 1.0);
        
        System.out.println("\tTest 4");
    
        userAnswer = 5.0;
        
        length = 9.0;
        
        potions = 5.0;
        
        expResult = "correct";
        
        result = instance.CalcHeightOfRous(userAnswer, length, height, potions);
        assertEquals(expResult, result, 1.0);
       
        System.out.println("\tTest 5");
    
        userAnswer = 2.0;
        
        length = 14.0;
        
        potions = 0.0;
        
        expResult = "incorrect and you die";
        
        result = instance.CalcHeightOfRous(userAnswer, length, height, potions);
        assertEquals(expResult, result, 1.0);
        
        System.out.println("\tTest 6");
    
        userAnswer = 6.5;
        
        length = 12.0;
        
        potions = 6.0;
        
        expResult = "correct";
        
        result = instance.CalcHeightOfRous(userAnswer, length, height, potions);
        assertEquals(expResult, result, 1.0);
       
}
}
