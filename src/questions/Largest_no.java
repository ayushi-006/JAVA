package questions;

import java.util.Scanner;

public class Largest_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = 0;
        if (a > max) {
            max = a;
        }

        if (b> max){
            max = b;
        }

        if (c> max){
            max=c;
        }

        System.out.println(max);

        // Using MATH function

        //System.out.println(Math.max(c,(Math.max(a,b))));
    }

}
