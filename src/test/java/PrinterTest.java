import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 10);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.paperAmount());
    }

    @Test
    public void printIfEnoughPaper(){
        printer.print(10,2);
        assertEquals(80, printer.paperAmount());
    }

    @Test
    public void printIfNotEnoughPaper(){
        printer.print(150, 2);
        assertEquals(100, printer.paperAmount());
    }

    @Test
    public void hasTonerVolume(){
        assertEquals(10, printer.tonerVolume());
    }
}
