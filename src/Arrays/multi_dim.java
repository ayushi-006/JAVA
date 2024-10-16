package Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
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
        int[][] arr = new int[3][3];

        System.out.println(arr.length); //no of rows

//input

        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        //output
//
//        for (int[] ints : arr) {
//            //for each col in every row
//            for (int col = 0; col < ints.length; col++) {
//                System.out.print(ints[col] + " ");
//            }
//            System.out.println();

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }


    }
    }


