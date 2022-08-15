import java.util.ArrayList;

public class Strings_CH {


    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(20);    // adding an element
        numbers.add(0, 21); // specifying an index
        numbers.add(22);

        System.out.println(numbers); // [21, 20, 22]

        numbers.size(); // 3
        numbers.get(2); // 22

        numbers.indexOf(20);    // 1
        numbers.indexOf("cat"); // -1




//
//        String myString = "we learnin to code yo";
//
//        char myChar = myString.charAt(5);
////
//        System.out.println("myChar = " + myChar);
////
//        int myIndex = myString.indexOf("c");
//
//        System.out.println("myIndex = " + myIndex);
    }

}
