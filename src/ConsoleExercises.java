import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {

    public static void main(String args[]) {

//        double pi = 3.14159;
//
//        System.out.printf("The value of pi is approximately: ");
//        System.out.format("%.2f%n", pi);
//
//        //---------
//
//        //Prompt 1
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter an integer: ");
//
//        String userInput = scanner.nextLine();
//
//        System.out.printf("You entered %s \n", userInput);
//
//
//        //Prompt 2
//
//        scanner.nextLine();
//
//        System.out.print("Enter three words: ");
//
//        String firstWord = scanner.next();
//
//        String secondWord = scanner.next();
//
//        String thirdWord = scanner.next();
//
//        System.out.printf("You entered %s %s %s \n", firstWord, secondWord, thirdWord);
//
//
//        //Prompt 3
//
//        scanner.nextLine();
//
//        System.out.print("Enter a sentence: ");
//
//        String fullSentence = scanner.nextLine();
//
//        System.out.printf("You entered: %s \n", fullSentence);
//
//
//        //Calculate perimeter
//
//        scanner.nextLine();
//
//        System.out.print("Enter a width and length: ");
//
//        String width = scanner.nextLine();
//
//        int number1 = parseInt(width);
//
//        String height = scanner.nextLine();
//
//        int number2 = parseInt(height);
//
//        int total = number1 * number2;
//
//        System.out.printf("The perimeter: %d \n", total);



//        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [y/N] ");
//        String userInput = sc.next();
//
////        boolean confirmation = userInput.equals("y");
//        boolean confirmation = userInput == "y";
//        System.out.println("confirmation = " + confirmation);
//

//        int caseSwitch = 1;
//
//        switch (caseSwitch) {
//            case 1:
//                System.out.println("Case 1");
//                // Fall through!
//            case 2:
//                System.out.println("Case 2");
//                break;
//            default:
//                System.out.println("Default case");
//                break;
//        }

//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
////            i = i + 1;
////            i += 1;
//        }

//        for(int i = 0; i < 10; i += 1) {
//            System.out.println("i is " + i);
//        }

        // print the numbers 1 through 5

//        for(int i = 1; i < 100; i++) {
//            System.out.println(i);
//            if (i == 5) {
//                break; // --------------+
//            } //                        |
//        } //                            |
//// <----------------------------+

//        for(int i = 1; i <= 10; i++) { // <--+
//            if(i % 2 == 1) { //              |
//                continue; // ----------------+
//            }
//            System.out.println(i);
//        }

        String myString = "we learnin to code yo";

        char myChar = myString.charAt(5);

        System.out.println("myChar = " + myChar);

        int myIndex = myString.indexOf("c");

        System.out.println("myIndex = " + myIndex);


    }

}