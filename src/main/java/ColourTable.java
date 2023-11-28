import java.util.HashSet;
import java.util.Set;
public class ColourTable {
    private final Set<Integer> colourSet;
    private final int numOfColours;
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

    private boolean isPowerOfTwo(int num) {
        return num !=0 && ((num & (num - 1)) == 0);
    }
    public void add(int red, int green, int blue) {
        if (!isValidColourValue(red) || !isValidColourValue(green) || !isValidColourValue(blue)){
            throw new IllegalArgumentException();
        }
        if (colourSet.size() < numOfColours) {
            int rgbValue = packRGB(red, green, blue);
            colourSet.add(rgbValue);
        }
        else {
            throw new IllegalStateException();
        }

    }
    private int packRGB(int red, int green, int blue) {
        return (red << 16) | (green << 8) | blue;
    }
    private boolean isValidColourValue(int val) {
        return val >= 0 && val <= 255;
    }
    public void removeColour(int red, int green, int blue) {
        int rgbValue = packRGB(red, green, blue);
        colourSet.remove(rgbValue);
    }
    public int getPaletteSize() {
        return colourSet.size();
    }
}
