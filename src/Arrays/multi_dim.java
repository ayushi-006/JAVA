package Arrays;

import java.util.Scanner;

public class multi_dim {
    public static void main(String[] args) {
        //        int[][] multi = new int[3][3];
//        int[][] multi_t = {
//                {3,3,3},
//                {4,4},
//                {5,5,5}
//        };

        Scanner in = new Scanner(System.in);
        int[][] arr = new int[4][4];
        System.out.println(arr.length); //no of rows

        for (int row = 0 ; row < arr.length ; row++) {
            //for each col in every row
            for (int col = 0; col<arr[col].length;col++){
                arr[row][col] = in.nextInt();
            }

        }
    }
}
