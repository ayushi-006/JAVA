package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ok {
    public static void main(String[] args) {

//        String[] arr = new String[4];
//        System.out.println(arr[0]);
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];


//        int[] arr = new int[5];
        for (int i = 0 ; i < arr.length ; i++) {
             arr[i] = in.nextInt();
         }
        System.out.println(Arrays.toString(arr));
         //to modify


        System.out.println(Arrays.toString(arr));
//             System.out.print(arr[i] + " ");



    }






}
