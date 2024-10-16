package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class three_d_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int three_d[] [] [] = new int [3][4][5];
        int i,j,k;
//        three_d[i][j][k]= in.nextInt();


        for( i=0 ; i <3 ; i++)
            for(j=0 ; j<4 ; j++)
                for(k = 0 ; k<5 ; k++)
//                    three_d[i][j][k]= in.nextInt();
                     three_d[i][j][k] = i*j*k;
//
//        for( i=0 ; i <3 ; i++) {
//            for (j = 0; j < 4; j++) {
//                for (k = 0; k < 5; k++)
//                    System.out.println(three_d[i][j][k] + " ");
//                System.out.println();
//            }
//            System.out.println();

        for (int[][] a : three_d) {
                System.out.println(Arrays.toString(a));
            }




    }
}
