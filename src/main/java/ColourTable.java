import java.util.HashSet;
import java.util.Set;
public class ColourTable {
    Set<Integer> colourSet;
    int numOfColours;
    public ColourTable(int numOfColours) {
        this.numOfColours = numOfColours;
        if (numOfColours <=1 || numOfColours >= 1025 || !isPowerOfTwo(numOfColours)) {
            throw new IllegalArgumentException();
        }
        this.colourSet = new HashSet<>();
    }

    public int getNumOfColours() {
        return numOfColours;
    }

    public boolean isPowerOfTwo(int num) {
        return num !=0 && ((num & (num - 1)) == 0);
    }
    public void addColour(int red, int green, int blue) {
        int rgbValue = packRGB(red, green, blue);
        colourSet.add(rgbValue);
    }
    public int packRGB(int red, int green, int blue) {
        return (red << 16) | (green << 8) | blue;
    }
}
