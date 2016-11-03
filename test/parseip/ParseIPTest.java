/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parseip;

import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author d.sinyatkin
 */
public class ParseIPTest {
    
    public ParseIPTest() {
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
     * Test of getPairWithIP method, of class ParseIP.
     */
    @Test
    public void testGetPairWithIP() {
        System.out.println("getPairWithIP");
        ParseIP instance = new ParseIP();
        
        String splitStr = " fgfg      \n    "
                                                    + "        192.168.101.122 INIT PVM\n     123.123.123.123 fgfdghffggfg\n dsfsdfdsfsdfds";
 
        
       // Map<String, String> expResult = null;
        Map<String, String> testmap = instance.getPairWithIP(splitStr);
        assertTrue(testmap.containsKey("192.168.101.122") );
        assertTrue(testmap.containsValue("INIT PVM"));
        assertTrue(testmap.size()==2);
    }

    /**
     * Test of splitInputToLines method, of class ParseIP.
     */
    
}
