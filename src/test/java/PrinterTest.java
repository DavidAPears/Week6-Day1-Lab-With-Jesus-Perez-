import org.junit.Before;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;


public class PrinterTest {

    Printer myPrinter;

    @Before
    public void before(){
        myPrinter = new Printer(100);
    }

    @Test
    public void hasSheets(){
        assertEquals(100, myPrinter.getSheets());
    }




    @Test
    public void canPrint(){
        myPrinter.print(20, 4);
        assertEquals(20, myPrinter.getSheets());
    }









//    @Test
//    public void paperLeft(){
//        assertEquals(20, myPrinter.paperLeft());
//    }
//
//    @Test
//    public void canPrint(){
//        assertEquals(true, myPrinter.readyToPrint());
//    }
//
//    @Test
//    public void cannotPrint(){
//        Printer myPrinter = new Printer(100, 120);
//        assertEquals(false, myPrinter.readyToPrint());
//    }

}
