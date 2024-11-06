//implement a simple class Calculator which has the member variables as two integer
//number. write three (defult, one input, two input) different constructors by using the concept
//of constructor oveloading. Finally implemnt another funnction to print the values.


package oppe_1_practise;

public class const_overloading_3 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Calculator c1 = new Calculator(2);
        Calculator c2 = new Calculator(2, 4);
        c.print();
        c1.print();
        c2.print();
    }
}

class Calculator{
    int num1;
    int num2;
    Calculator(){
        this.num1 = 0;
        this.num2 = 0;
    }
    Calculator(int num1){
        this.num1 = num1;
        this.num2 = 0;
    }
    Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void print(){
        System.out.println("default:" );
        System.out.println("one input: " + num1);
        System.out.println("two input: " + num2);
    }
}
