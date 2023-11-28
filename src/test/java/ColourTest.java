import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ColourTest {
    @Test
    public void testColourTableConstructor() {
        int numOfColours = 2;
        ColourTable ct =  new ColourTable(numOfColours);
        assertNotNull(ct);
        assertEquals(numOfColours, ct.getNumOfColours());
    }

    @Test
    public void testColourTableParameter() {
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(1));
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(1025));
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(5));
    }

    @Test
    public void testValidPaletteSize() {
        assertDoesNotThrow(() -> new ColourTable(2));
        assertDoesNotThrow(() -> new ColourTable(256));
    }
    @Test
    public void testAddMethod() {
        ColourTable ct2 = new ColourTable(8);
        ct2.addColour(255,0,0);
        ct2.addColour(0,0,255);
        assertEquals(2,ct2.colourSet.size());
    }
    @Test
    public void testInvalidValuesToAdd() {
        ColourTable ct3 = new ColourTable(2);
        assertThrows(IllegalArgumentException.class, () -> ct3.addColour(256, 0, 0));
        assertThrows(IllegalArgumentException.class, ()-> ct3.addColour(0,-1,0));
    }
}
