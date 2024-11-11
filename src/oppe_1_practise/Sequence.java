package oppe_1_practise;
public class Sequence {
    public static void main(String[] args) {
        Childd childInstance = new Childd( );
    }
}

class Parentt{
    Parentt() {
        System.out.println("Parent Constructor");
    }
}

class Childd extends Parentt {
    Childd() {
        super();
        System.out.println("Child Constructor");

    }
}