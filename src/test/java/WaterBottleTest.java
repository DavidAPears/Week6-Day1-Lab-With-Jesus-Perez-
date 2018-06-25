import org.junit.Before;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle myWaterBottle;

    @Before
    public void before(){
        myWaterBottle = new WaterBottle(100);
    }

    @Test
    public void drink(){
        assertEquals(90, myWaterBottle.drink());
    }

    @Test
    public void empty(){
        assertEquals(0, myWaterBottle.empty());
    }

    @Test
    public void fill(){
        assertEquals(100, myWaterBottle.fill());
    }
}
