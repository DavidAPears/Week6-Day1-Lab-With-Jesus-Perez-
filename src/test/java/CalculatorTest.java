import org.junit.Before;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator myCalculator;

    @Before
    public void before(){
        myCalculator = new Calculator( 5.03, 2.01);
    }

    @Test
    public void add(){
        assertEquals(7.04, myCalculator.add(), 0.01);
    }

    @Test
    public void subtract(){
        assertEquals(3.02, myCalculator.subtract(), 0.01);
    }

    @Test
    public void multiply(){
        assertEquals(10.1103, myCalculator.multiply(), 0.01);
    }

    @Test
    public void divide(){
        assertEquals(2.5024, myCalculator.divide(),0.01 );
    }
}
