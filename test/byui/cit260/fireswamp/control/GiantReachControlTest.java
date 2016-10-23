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
 * @author kellyjohnson
 */
public class GiantReachControlTest {
    
    public GiantReachControlTest() {
    }

    /**
     * Test of CalcCircleSize method, of class GiantReachControl.
     */
    @Test
    public void testCalcCircleSize() {
        System.out.println("CalcCircleSize");
        
        double diameter = 4.0;
        double pi = PI;
        GiantReachControl instance = new GiantReachControl();
        double expResult = 12.57;
        double result = instance.CalcCircleSize(diameter, pi);
        assertEquals(expResult, result, 0.01);
        
    
        System.out.println("\tTest 2");
    
        diameter = -4.0;
        
        pi = PI;
        
        expResult = -1.0;
        
        result = instance.CalcCircleSize(diameter, pi);
        assertEquals(expResult, result, 0.01);
        
    
        System.out.println("\tTest 3");
    
        diameter = 0.0;
        
        pi = PI;
        
        expResult = -1.0;
        
        result = instance.CalcCircleSize(diameter, pi);
        assertEquals(expResult, result, 0.01);
        
    
        System.out.println("\tTest 4");
    
        diameter = 18.0;
        
        pi = PI;
        
        expResult = 56.55;
        
        result = instance.CalcCircleSize(diameter, pi);
        assertEquals(expResult, result, 0.01);
        
    
        System.out.println("\tTest 5");
    
        diameter = 10.0;
        
        pi = PI;
        
        expResult = 62.83;
        
        result = instance.CalcCircleSize(diameter, pi);
        assertEquals(expResult, result, 0.01);
        
    
        System.out.println("\tTest 6");
    
        diameter = 90.0;
        
        pi = PI;
        
        expResult = -1;
        
        result = instance.CalcCircleSize(diameter, pi);
        assertEquals(expResult, result, 0.01);
        
    }
    
        
    
    
    
}
