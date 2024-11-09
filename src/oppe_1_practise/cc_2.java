package oppe_1_practise;

import java.util.Scanner;
class Stu{
    String name;
    String[] courses;
    public Stu(String n, String[] c) {
        name = n;
        courses=c;
    }
    //copy constructor

    public Stu(Stu s) {
        this.name = s.name;
        this.courses = new String[s.courses.length];
        for(int i = 0; i < courses.length; i++) {
            this.courses[i] = s.courses[i];
        }
    }
    public void setName(String n) {
        name = n;
    }
    public void setCourses(int indx, String c) {
        courses[indx] = c;
    }
    public String getName() {
        return name;
    }
    public String getCourses(int indx) {
        return courses[indx];
    }
}
public class cc_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] courses = {"Maths", "DL","DSA","DC"};
        Stu s1 = new Stu("Nandu", courses);
        Stu s2 = new Stu(s1);
        s2.setName(sc.next());
        s2.setCourses(1,sc.next());
        System.out.println(s1.getName() + ": "+ s1.getCourses(1));
        System.out.println(s2.getName() + ": " + s2.getCourses(1));
    }
}