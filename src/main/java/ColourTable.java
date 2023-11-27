
public class ColourTable {
    int numOfColours;
    public ColourTable(int numOfColours) {
        if (numOfColours <=1 || numOfColours >= 1025 || !isPowerOfTwo(numOfColours)) {
            throw new IllegalArgumentException();
        }
        this.numOfColours = numOfColours;
    }

    public int getNumOfColours() {
        return numOfColours;
    }

    public boolean isPowerOfTwo(int num) {
        return (int)(Math.ceil((Math.log(num) / Math.log(2))))
                == (int)(Math.floor(((Math.log(num) / Math.log(2)))));
    }
}
