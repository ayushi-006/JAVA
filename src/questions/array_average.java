package questions;

import java.util.Scanner;
import java.util.Scanner;
public class array_average {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int[] input = new int[6];
            int sum = 0;
            for ( int i =0; i < 6 ; i++ ) {
                input[i] = in.nextInt();
                sum = sum + input[i];

            }
            System.out.println("Average is : " + sum / 6.0);
        }

}
