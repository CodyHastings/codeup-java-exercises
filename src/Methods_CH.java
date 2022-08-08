import java.util.Scanner;

public class Methods_CH {
    public static void main(String[] args) {

//        sayHello(3);
//        System.out.println(sayHello("Ashley"));

//        sayHello("Midlyn");
//        sayHello("yoyoyo", "Midlyn");

//        System.out.println(returnThree());
//        String changeMe = "hello codeup!";
//
//        changeString(changeMe);
//
//        System.out.println(changeMe);

//        count(5);



    }


    public static void changeString(String s) {
        s = "Wub a lub a dub dub";
//        System.out.println(s);
    }

    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }










//    public static void sayHello(String name) {
//        System.out.printf("hello, %s!", name);
////        return String.format("Hello, %s!", name);
//    }

//    public static int returnThree() {
//        return 3;
//    }
//
//
//    // version 1
//    public static void sayHello(int times) {
//        for (int i = 0; i < times; i += 1) {
//            sayHello();
//        }
//    }
//    // version 2
//    public static void sayHello() {
//        sayHello("Hello", "World");
//    }
//    // version 3
//    public static void sayHello(String name) {
//        sayHello("Hello", name);
//    }
//    // version 4
//    public static void sayHello(String greeting, String name) {
//        System.out.println(greeting + ", " + name + "!");
//    }

}
