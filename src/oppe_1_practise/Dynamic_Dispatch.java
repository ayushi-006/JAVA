package oppe_1_practise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Dynamic_Dispatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Vehicle(" ");
        vehicles[1] = new car(sc.nextLine());
        vehicles[2] = new bicycle(sc.nextLine());

         for(Vehicle v: vehicles){
             v.display();
         }
        sc.close();
    }
}
class Vehicle{
    private String name;
    public Vehicle (String n){
         name = n;
    }
    public String getName(){
        return name;
    }
    public void display(){
        System.out.println("this is generic vehicle");
    }
}

class car extends Vehicle{
    public car(String n){
        super(n);
    }
    public void display(){
        System.out.println("This is a car named " + getName() + ".");
    }
}

class bicycle extends Vehicle{
    public bicycle(String n){
        super(n);
    }
    public void display() {
        System.out.println("This is a bicycle named " + getName() + ".");
    }
}


