/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author michaelowens
 */
public class RousTypeSceneControlTest {
    
    public RousTypeSceneControlTest() {
    }

    /**
     * Test of calcHeightOfRous method, of class RousTypeSceneControl.
     */
    @Test
    public void testCalcHeightOfRous() {
        System.out.println("calcHeightOfRous");
        double length = 4.0;
        RousTypeSceneControl instance = new RousTypeSceneControl();
        double expResult = 2.5;
        double result = instance.calcHeightOfRous(length);
        assertEquals(expResult, result, 0.1);
        
        System.out.println("\tTest 2");
    
        length = 9;
        
        expResult = 5.0;
        
        result = instance.calcHeightOfRous(length);
        assertEquals(expResult, result, 0.01);
        
        System.out.println("\tTest 3");
    
        length = 0;
        
        expResult = -1.0;
        
        result = instance.calcHeightOfRous(length);
        assertEquals(expResult, result, 0.01);
        
        System.out.println("\tTest 4");
    
        length = 10;
        
        expResult = -1.0;
        
        result = instance.calcHeightOfRous(length);
        assertEquals(expResult, result, 0.01);
    
        System.out.println("\tTest 5");
    
        length = 5;
        
        expResult = 3.0;
        
        result = instance.calcHeightOfRous(length);
        assertEquals(expResult, result, 0.01);
    }
    
}
