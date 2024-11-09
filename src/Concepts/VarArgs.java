package Concepts;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
////        fun(2,4,54,67,33,4,2,1);                    //input, any number of arguments
//      multiple(2,3,"AKEMI","LILY","AUTUMN");
//    }
//    static void multiple(int a, int b, String ...v){
//     static void fun(int ...v){             //store it in an array


        // FUNCTION-OVERLOADIING


////        fun(43);
//        fun("akemi");
//    }
//
//        static void fun(int a){
//            System.out.println("first ans");
//            System.out.println(a);
//        }
//        static void fun(String name){
//            System.out.println("second ans");
//            System.out.println(name);
//
//        }


        demo("lily");
    }
        static void demo(int ...a){
            System.out.println(Arrays.toString(a));
        }
        static void demo(String ...a){
            System.out.println(Arrays.toString(a));
        }
    }

