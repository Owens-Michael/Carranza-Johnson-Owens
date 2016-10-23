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
 * @author mnowe
 */
public class LightningSandControlTest {
    
    public LightningSandControlTest() {
    }

    /**
     * Test of CalcCircleSize method, of class LightningSandControl.
     */
    @Test
    public void testCalcCircleSize() {
        System.out.println("CalcCircleSize");
        
        double diameter = 8.0;
        double pi = PI;
        LightningSandControl instance = new LightningSandControl();
        double expResult = 25.13;
        double result = instance.CalcCircleSize(diameter, pi);
        assertEquals(expResult, result, 0.01);
        
    
        System.out.println("\tTest 2");
    
        diameter = -8.0;
        
        pi = PI;
        
        expResult = -1.0;
        
        result = instance.CalcCircleSize(diameter, pi);
        assertEquals(expResult, result, 0.01);
        
    
        System.out.println("\tTest 3");
    
        diameter = -9.0;
        
        pi = PI;
        
        expResult = -1.0;
        
        result = instance.CalcCircleSize(diameter, pi);
        assertEquals(expResult, result, 0.01);
        
    
        System.out.println("\tTest 4");
    
        diameter = 18.0;
        
        pi = PI;
        
        expResult = 127.23;
        
        result = instance.CalcCircleSize(diameter, pi);
        assertEquals(expResult, result, 0.01);
        
    
        System.out.println("\tTest 5");
    
        diameter = 0.0;
        
        pi = PI;
        
        expResult = -1.0;
        
        result = instance.CalcCircleSize(diameter, pi);
        assertEquals(expResult, result, 0.01);
        
    
        System.out.println("\tTest 6");
    
        diameter = 20.0;
        
        pi = PI;
        
        expResult = 157.07;
        
        result = instance.CalcCircleSize(diameter, pi);
        assertEquals(expResult, result, 0.01);
        
    }
    
        
    
    
    
}
