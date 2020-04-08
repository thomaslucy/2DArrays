public class MagicSquare {
    private int[][] grid;

    public MagicSquare(int[][] g) {
        grid = g;
    }


    public int rowSum(int row){
        int sum = 0;
        for (int i = 0; i < grid[row].length; i++)
            sum += grid[row][i];
        return sum;
    }


    public int colSum(int col) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++)
            sum += grid[i][col];
        return sum;
    }


    public int upDiagSum() {
        int sum = 0;
        int col = 0;
        int row = grid.length - 1;
        while (col < grid[0].length){
            sum += grid [row][col];
            row++;
            col++;
        }
        return sum;
    }


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


    public boolean isMagicSquare() {
        
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

