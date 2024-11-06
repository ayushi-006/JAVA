package oppe_1_practise;

public class question_1 {
    public static void main(String[] args) {
        MyClass obj;
        obj = new MyClass(10);
        obj.print();
    }
}

class MyClass{
    int num;
    //constructor
    public MyClass(int a){
        System.out.println("Constructor called...");
        num = a;
    }
    // print the values
    public void print(){
        System.out.println("Number :" + num);
    }
}
