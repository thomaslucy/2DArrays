/**
 * @author Lucy Thomas
 * @since 4/7/20
 * This program tells you if the 2D array is a magic square,
 * meaning all rows, columns, and diagonals are the same.
 */
public class MagicSquare {
    private int[][] grid;

    /**
     * Initializes the class
     * @param g
     */
    public MagicSquare(int[][] g) {
        grid = g;
    }

    /**
     * Finds the sum of a row
     * @param row
     * @return the sum of the row
     */
    public int rowSum(int row){
        int sum = 0;
        for (int i = 0; i < grid[row].length; i++)
            sum += grid[row][i];
        return sum;
    }

    /**
     * Finds the sum of a column
     * @param col
     * @return the sum of the column
     */
    public int colSum(int col) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++)
            sum += grid[i][col];
        return sum;
    }

    /**
     * Finds the sum of an upward facing diagonal
     * @return the sum of the upward facing diagonal
     */
    public int upDiagSum() {
        int sum = 0;
        int col = 0;
        int row = grid.length - 1;
        while (col < grid[0].length){
            sum += grid [row][col];
            row--;
            col++;
        }
        return sum;
    }

    /**
     * Finds the sum of the downward facing diagonal
     * @return the sum of the downward facing diagonal
     */
    public int downDiagSum() {
        int sum = 0;
        int col = 0;
        int row = 0;
        while (col < grid.length){
            sum += grid [row][col];
            row++;
            col++;
        }
        return sum;
    }

    /**
     * Finds the sum of every row, column, and diagonals, and checks if they're the same
     * @return if it's a magic square or not
     */
    public boolean isMagicSquare() {
        for (int i = 0; i < grid.length; i++){
            if ( rowSum(i) != colSum(i))
                return false;
            else if (rowSum(i) != upDiagSum())
                return false;
            else if (rowSum(i) != downDiagSum())
                return false;
        }
        return true;
    }


    /**
     * This method is complete. You do not need to provide additional
     * comments here.
     */
    public void printGrid() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println("");
        }
    }
}

