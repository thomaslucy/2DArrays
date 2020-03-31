public class ArrayCalculations {
    public static int rowSum(int[][] arr, int row) {
        int total = 0;
        if(row > arr.length || row < 0)
            return -1;
        else{
            total = 0;
            for (int i = 0; i < arr[row].length; i++)
                total += arr[row][i];
        }
        return total;
    }

    public static int columnSum(int[][] arr, int col) {
        int total = 0;
        if (col > arr[0].length || col < 0)
            return -1;
        else{
            total = 0;
            for(int i = 0; i < arr.length; i++)
                total += arr[i][col];
        }
        return total;
    }

        public static void main(String[] args){
        int[][] arr = {{1, 2, 3, 4}, {9, 7, 4, 3}, {0, 2, 5, 1}};
        System.out.println(rowSum(arr, 1));
        int[][] list = {{1, 2, 3, 4}, {9, 7, 4, 3}, {0, 2, 5, 1}};
        System.out.println(columnSum(list, 0));

        }
}
