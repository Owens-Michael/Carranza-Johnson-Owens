/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.control;

import static java.lang.Math.PI;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author michaelowens
 */
public class FlameControlTest {
    
    public FlameControlTest() {
    }

    /**
     * Test of CylinderCalc method, of class FlameControl.
     */
    @Test
    public void testCylinderCalc() {
        System.out.println("CylinderCalc");
        double radius = 7.0;
        double height = 3.0;
        double pi = PI;
        FlameControl instance = new FlameControl();
        double expResult = 461.81;
        double result = instance.CylinderCalc(radius, height, pi);
        assertEquals(expResult, result, 0.01);
     
        System.out.println("\tTest 2");
    
        radius = 5;
        
        height = -4;
        
        pi = PI;
        
        expResult = -1.0;
        
        result = instance.CylinderCalc(radius, height, pi);
        assertEquals(expResult, result, 0.01);
        
        System.out.println("\tTest 3");
    
        radius = -9;
        
        height = 7;
        
        pi = PI;
        
        expResult = -1.0;
        
        result = instance.CylinderCalc(radius, height, pi);
        assertEquals(expResult, result, 0.01);
        
        System.out.println("\tTest 4");
    
        radius = 12;
        
        height = 5;
        
        pi = PI;
        
        expResult = -1.0;
        
        result = instance.CylinderCalc(radius, height, pi);
        assertEquals(expResult, result, 0.01);
        
        System.out.println("\tTest 5");
    
        radius = 0;
        
        height = 0;
        
        pi = PI;
        
        expResult = -1.0;
        
        result = instance.CylinderCalc(radius, height, pi);
        assertEquals(expResult, result, 0.01);
        
        System.out.println("\tTest 6");
    
        radius = 11;
        
        height = 10;
        
        pi = PI;
        
        expResult = -1.0;
        
        result = instance.CylinderCalc(radius, height, pi);
        assertEquals(expResult, result, 0.01);
    }
    
}
