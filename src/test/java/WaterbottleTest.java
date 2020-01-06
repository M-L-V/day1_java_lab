import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterbottleTest {


    Waterbottle waterbottle;

    @Before
    public void before(){
        waterbottle = new Waterbottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterbottle.getVolume(), 0.01);
    }


}
