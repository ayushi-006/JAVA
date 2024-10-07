package questions;

import java.util.Scanner;

public class ga_1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum = 0;

            for(int i = 1; i <= n; i++) {
                int sumOfSquares = 0;
                for (int j = 1; j <= i; j++) {
                    sumOfSquares += j * j;
                }

                sum += sumOfSquares;
            System.out.println(sum);

        }
    }
}
