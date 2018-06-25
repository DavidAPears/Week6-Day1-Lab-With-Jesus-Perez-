import org.junit.Before;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;


public class PrinterTest {

    Printer myPrinter;

    @Before
    public void before(){
        myPrinter = new Printer(100, 100);
    }

    @Test
    public void hasSheets(){
        assertEquals(100, myPrinter.getSheets());
    }


    @Test
    public void canPrint(){
        myPrinter.print(20, 4);
        assertEquals(20, myPrinter.getSheets());
        assertEquals(20, myPrinter.getToner());
    }

    @Test
    public void refillPaper(){
        assertEquals(100, myPrinter.refillPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(100, myPrinter.getToner());
    }
}
