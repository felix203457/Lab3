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
}
