package ec.edu.epn.git.calculator;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;



public class CalculatorTest {
    Calculator c;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass()");
    }

    @Before
    public void setUp(){
        System.out.println("SetUp()");
        c = new Calculator();
    }
    @Test
    public void given_two_doubles_when_add_then_ok(){
        System.out.println("Test 1");
        assertEquals(12, c.suma(10, 2));
    }
    @Test
    public void given_two_doubles_when_substraction_then_ok(){
        System.out.println("Test 2");
        assertEquals(8,c.resta(10,2));
    }



    @Test
    public void given_two_doubles_when_multiplication_then_ok(){
        System.out.println("Test 4");
        assertEquals(20,c.multiplicacion(10,2));
    }

    @Test
    public void given_two_doubles_when_division_then_ok(){
        System.out.println("Test 3");
        assertEquals(5,c.division(10,2), 0);
    }
    @After
    public void tearDown(){
        System.out.println("TearDown()");
        c.setRespuesta(0);
    }
    @AfterClass
    public static void tearDownClass(){
        System.out.println("tearDownClass()");
    }


}