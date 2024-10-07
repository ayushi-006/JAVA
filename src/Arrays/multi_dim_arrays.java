package Arrays;
import java.sql.SQLOutput;
import java.util.Scanner;
class multi_dim_arrays {
    public static void main(String[] args) {
        int two_d[][] = new int[4][5];
        int i,j,k =0;


        for (i=0 ; i<4; i++)
            for(j=0;j<5;j++){
                two_d[i][j] = k;
                k++;
            }
        for (i=0 ; i<4; i++){
            for(j=0;j<5;j++)
              System.out.println(two_d[i][j]+" ");
            System.out.println();


        }

        }
}






