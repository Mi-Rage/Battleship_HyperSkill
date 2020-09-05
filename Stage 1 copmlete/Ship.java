import java.util.Arrays;

/**
 * Abstract ship class. Use it to create as many ships as we want. With individual parameters.
 */
public class Ship {
    final char SHIP_SYMBOL = 'O';
    int size;
    String name;
    char[] cells;
    boolean isPlaced = false;
    int rowBegin;
    int rowEnd;
    int columnBegin;
    int columnEnd;

    /**
     * Designer. Creating a ship with the specified size and name.
     * @param _size - int, size of ship on game filed.
     * @param _name - String, name of ship.
     */
    public Ship(int _size, String _name) {
        this.size = _size;
        this.name = _name;
        this.cells = new char[_size];
        Arrays.fill(this.cells, SHIP_SYMBOL);
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }

    /**
     * Check the given coordinates of the ship's location on the map.
     * If the coordinates do not contradict, we save them in the fields of the class instance.
     * @param _rowBegin - int, coordinates
     * @param _columnBegin - int, coordinates
     * @param _rowEnd - int, coordinates
     * @param _columnEnd - int, coordinates
     * @return -boolean, true if the coordinates meet the condition.
     */
    public boolean setCoordinates(int _rowBegin, int _columnBegin, int _rowEnd, int _columnEnd) {
        if(_rowBegin == _rowEnd || _columnBegin == _columnEnd) {
            if(_rowEnd - _rowBegin != this.size - 1 && _columnEnd - _columnBegin != this.size - 1) {
                System.out.printf("Error! Wrong length of the %s! Try again:\n", this.name);
                return false;
            }
        } else {
            System.out.println("Error! Wrong ship location! Try again:");
            return false;
        }
        this.rowBegin = _rowBegin;
        this.rowEnd = _rowEnd;
        this.columnBegin = _columnBegin;
        this.columnEnd = _columnEnd;
        this.isPlaced = true;

        return true;
    }

    public char[] getCells() {
        return cells;
    }

    public int getRowBegin() {
        return rowBegin;
    }

    public int getRowEnd() {
        return rowEnd;
    }

    public int getColumnBegin() {
        return columnBegin;
    }

    public int getColumnEnd() {
        return columnEnd;
    }

    public boolean isPlaced(){
        return isPlaced;
    }
}


