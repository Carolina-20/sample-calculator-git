package ec.edu.epn.git.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class CalculatorParametersTest {
    private int a,b,expected;
    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{5,3,8});
        objects.add(new Object[]{6,3,9});
        objects.add(new Object[]{1,1,2});
        objects.add(new Object[]{15,3,18});
        objects.add(new Object[]{3,7,10});
        return objects;
    }

    public CalculatorParametersTest(int a, int b, int expected){
        this.a = a;
        this.b = b;
        this.expected = expected;
    }


    @Test
    public void given_parameters_when_additon_then_sumation(){
        Calculator c = new Calculator();
        int actual = c.suma(a,b);
        assertEquals(expected,actual);
    }

}