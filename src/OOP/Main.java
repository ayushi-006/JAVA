package OOP;

class Main {                   // Main is the specified datatype  , DECLARATION
    double width;
    double height;
    double depth;
    double base;
}
class MainDemo {
    public static void main(String[] args) {
        Main mymain = new Main();  //creating an instance/ object of mymain
        Main mini = new Main();
        //  every Main object will contain its own copies of the instance variables width,
        // height, and depth.
        double vol;
        double area;

        //assigning the values
        mymain.width = 10;
        mymain.depth = 20;
        mymain.height = 20;

        mini.base = 20;
        mini.height= 10;

        //computing the volume
        area = (mini.base * mini.height) *0.5;
        System.out.println("Area is: " + area);

        vol = mymain.depth * mymain.height * mymain.width;
        System.out.println("Volumne is: " + vol);
    }
}