package oppe_1_practise;

import java.util.Scanner;

public class Test_CQ_1 {
    public static String getMax(Stud[] stud){
        String max_Stud = " ";                 //iniialization
        double max_marks = 0.0;
        for(Stud i : stud){
            double total_marks = i.findTotal();
            if(total_marks > max_marks){
                max_Stud = i.getName();
                max_marks = total_marks;
            }
        }
        return max_Stud;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stud[] arr = new Stud[3];
        for(int i = 0; i < 3; i++){
            String name = sc.next();
            double[] m = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};
            arr[i] = new Stud(name, m);
        }
        System.out.println(getMax(arr));
    }
}
//Add your code for Class Student here
class Stud{
    String name;
    private double marks [];
    private Stud(String name , double[] marks){
        this.name = name;
        this.marks = marks;
    }
    public String getName(){
        return(this.name);
    }

    public double findTotal(){
        double total = 0.0;
        for(double i: this.marks){
            total = total+i;
        }
        return (total);
    }
}
