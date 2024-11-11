package oppe_1_practise;

import java.util.Scanner;

public class Reflectors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point<Integer> p1 = new Point<Integer>(sc.nextInt(), sc.nextInt());
        Point<Double> p2 = new Point<Double>(sc.nextDouble(), sc.nextDouble());
        Point<Double> p3 = p1.mid(p2);
        System.out.println(p3);
    }

}
class Point<T extends Number>{
    T x;
    T y;
    public Point(T x,T y){
        this.x = x;
        this.y = y;
    }
    public Point<Double> mid(Point p){

        Point<Double> q = new Point<Double>(0.0, 0.0);
        q.x  = (p.x.doubleValue() + this.x.doubleValue())/2;
        q.y = (p.y.doubleValue() + this.y.doubleValue())/2;
        return q;
    }
    public String toString(){
    return "(" +x +  " , " +y + ")";
}
}






