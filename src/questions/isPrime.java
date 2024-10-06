package questions;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c*c <= n) {                          //to save time and half the computation
            if (n % c == 0) {
                return false;
            }
            c = c + 1;
        }
        return c*c>n;
    }
}

