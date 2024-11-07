//Implement a student class with two member variables one
//is "name" and the other one is "marks" (an array of size n
//to store marks). In addition add a copy construtor to create
//a new object by copying an existing object.

package oppe_1_practise;

import java.util.Arrays;

public class copy_constructor_1 {
    public static void main(String[] args) {
        int[]marks = {32,45,54,55};
        Studentt st1 = new Studentt("ayushi", marks);
        Studentt st2 = new Studentt(st1);
        st1.print();
        st2.print();
    }
}

class Studentt{
    String name;
    int[]marks;
    Studentt(String name  , int[]marks){
        this.name = name;
        this.marks =Arrays.copyOf(marks, marks.length);
    }
    Studentt(Studentt other){
        this.name = other.name;
        this.marks = Arrays.copyOf(other.marks, other.marks.length);
    }

public void print(){
        System.out.println("Student 1: " + name + " " + "Marks: " + Arrays.toString(marks));
        System.out.println("Student 2: " + name + " " + "Marks: " + Arrays.toString(marks));
    }
}

