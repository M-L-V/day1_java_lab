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

    @Test
    public void drink(){
        waterbottle.drink();
        assertEquals(90, waterbottle.getVolume(), 0.01);
    }

    @Test
    public void empty(){
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume(), 0.01);
    }

    @Test
    public void fill(){
        waterbottle.drink();
        waterbottle.drink();
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume(), 0.01);
    }


}
