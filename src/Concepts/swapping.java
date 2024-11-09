package Concepts;

public class swapping {
    public static void main(String[] args) {
//        String name = "Akemi";
//        hii(name);
//        System.out.println(name);
//    }
//    static void hii(String nam) {
//    nam = "lily";


                String name = "Akemi";
                name = hii(name);                      // Reassign 'name' to the value returned by 'hii', this is the diff
                System.out.println(name );            // Now it will print "Meethi"
            }
            static String hii( String name) {
                name = "lily";                      // Change the local 'name' variable
                return name;                           // Return the new value



    }
}
