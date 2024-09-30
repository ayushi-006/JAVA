import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the temperature in C:");

        float C = in.nextFloat();
        float F = (C * 9/5) + 32;
        System.out.println(F);
    }
}
