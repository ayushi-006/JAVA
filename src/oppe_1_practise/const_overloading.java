package oppe_1_practise;

public class const_overloading {
    public static void main(String[] args) {
        Student s1 = new Student(4);
        Student s2 = new Student(4, "ayushi");
        Student s3 = new Student(4, "ayushi", 12);
        //we can choose which fields to print
        s1.print();
        s2.print();
        s3.print();
    }
}

class Student{
    int roll;
    String name;
    int division;
    Student(int roll){
        this.roll = roll;
        this.name = null;
        this.division = 0;
    }
    Student(int roll , String name){
        this.roll = roll;
        this.name =name;
        this.division = 0;
    }
    Student(int roll , String name , int division){
        this.roll = roll;
        this.name = name;
        this.division = division;
    }

    public void print(){
        System.out.println("roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Division: " + division);
    }

}


