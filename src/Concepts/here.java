package Concepts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class here {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int i = 1;
        int result;
        while ( i <= 10){
            result = N*i;
            System.out.println(N + " " + "X"+ " "  + i + " " + "=" + " " + result);
            i++;
        }


    }
}
