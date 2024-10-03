public class swapping {
    public static void main(String[] args) {
        String name = "Akemi";
        name = hii(name);                             // Reassign 'name' to the value returned by 'hii'
        System.out.println(name );            // Now it will print "Meethi"
    }
    static String hii( String name) {
        name = "lily";                      // Change the local 'name' variable
        return name;                       // Return the new value
    }
}
