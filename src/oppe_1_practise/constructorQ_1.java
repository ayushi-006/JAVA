// create a class with three variables: an int variable, a String variable,
//and a double variable. Initialize these variables using a constructor. Additionally, define a method (e.g., print) to display the initialized
//values. Finally cal the print method to show the values stored in different variables.
//
//Make sure that the constructor properly assigns the values passed as arguments, and the print method outputs the values of the
//variables in a clear format.


package oppe_1_practise;

public class constructorQ_1 {
    public static void main(String[] args) {
        MyyClass obj;
        obj = new MyyClass(10 , "ayushi" , 54.5);
        obj.print();
    }
}
class MyyClass {
    int num;
    String name;

    double val;
     //constructor
    public MyyClass(int a , String n , double d){
        System.out.println("Constructor called...");
        num = a;
        name = n;
        val = d;
    }
    //print values
    public void print(){
        System.out.println("number: " + num +" , " + "name : " + name + " , " + "value : " + val);
    }
}