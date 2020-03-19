public class TwoDArrays {
    public static int maxValue(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[0].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];}
            }
        }
        return max;
    }
    public static int sumAll(int[][] arr){
        int sum = 0;
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[0].length; col++){
                sum += arr[row][col];
            }
        }
        return sum;
    }

    public static boolean isSquare(int[][] arr){
        boolean square = false;
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[0].length; col++){
                if (arr.length == arr[0].length)
                    return true;
                else
                    return false;
            }
        }
        return square;
    }

    public static void main(String[] args){
        int[][] arr = {{21, -4, 89}, {65, 33, 1}, {8, 3, 99}, {-2, 3, 1}};
        System.out.println(maxValue(arr));
        int[][] list = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(sumAll(list));
        int[][] arr1 = {{1, 2, 3, 4}, {6, 2, 5, 3}, {9, 0, 1, 7}, {3, 1, 8, 6}};
        System.out.println(isSquare(arr1));
        int[][] arr2 = {{1, 6, 4}, {6, 2, 1}};
        System.out.println(isSquare(arr2));
    }
}
