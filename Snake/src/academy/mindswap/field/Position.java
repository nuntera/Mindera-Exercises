package academy.mindswap.field;

public class Position {
    private int col;
    private int row;

    public Position(int row, int col) {
        this.col = col;
        this.row = row;
    }


    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
}
