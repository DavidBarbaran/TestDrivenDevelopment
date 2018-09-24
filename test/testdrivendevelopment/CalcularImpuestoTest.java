/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdrivendevelopment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dvid
 */
public class CalcularImpuestoTest {
    
    public CalcularImpuestoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcular method, of class CalcularImpuesto.
     */
    @Test
    public void testCalcular() {
        System.out.println("calcular");
        CalcularImpuesto instance = new CalcularImpuesto(205500);
        double expResult = 61650.0;
        double result = instance.calcular();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }   
}