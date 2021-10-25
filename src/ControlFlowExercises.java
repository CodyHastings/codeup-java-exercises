import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Question 1
//        int i = 5;
//
//        while (i <= 15) {
//            System.out.println(i);
//            i += 1;
//        }
//        first do While
//        int i = 0;
//
//        do {
//            System.out.println(i);
//            i += 2;
//        } while(i <= 100);

//      Refactor to count backwards from 100 by 5s
//        int i = 100;
//
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while(i >= -10);
//        Refactor to print squares up to 1 million
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while(i <= 1000000);



//        for loop refactor

//        for (int i = 5; i <= 15; i++){
//            System.out.println(i);
//        }
//        for (int i = 0; i <= 100; i+= 2){
//            System.out.println(i);
//        }
//        for (int i = 100; i >= -10; i-= 5){
//            System.out.println(i);
//        }
//        for (long i = 2; i <= 1000000; i*= i){
//            System.out.println(i);
//        }

//        FIZZ BUZZ!!!!!!!

//        for (int i = 1; i <= 100; i+= 1){
//            if(i % 15 == 0){
////                System.out.println(i);
//                System.out.println("FizzBuzz!");
//            } else if(i % 3 == 0){
////                System.out.println(i);
//                System.out.println("Fizz");
//            }
//            else if(i % 5 == 0){
////                System.out.println(i);
//                System.out.println("Buzz");
//            } else
//            System.out.println(i);
//        }


//        3 Table of powers
//        System.out.print("What number would you like to go up to? ");
//        int maxInt = scanner.nextInt();
//        System.out.println("\nHere is your table! \n");
//        System.out.println("number | squared | cubed \n------ | ------- | ----- ");
//        for (int i = 0; i <= maxInt; i++){
//            int squared = i * i;
//            int cubed = i * i * i;
//
//            System.out.format("%-7d| %-8d| %-6d\n", i, squared, cubed);
//        }

        System.out.print("What number would you like to go up to? ");
        int maxInt = scanner.nextInt();
        System.out.println("\nHere is your table! \n");
        System.out.println("number | squared | cubed \n------ | ------- | ----- ");
        boolean continbuebool = false;
        do {
            for (int i = 0; i <= maxInt; i++){
                int squared = i * i;
                int cubed = i * i * i;

                System.out.format("%-7d| %-8d| %-6d\n", i, squared, cubed);

                System.out.print("Continue? y/n ");

            } String continuePrompt = scanner.nextLine();
            if (continuePrompt == "y"){
               boolean continuebool = true;
            } else{
                boolean continbuebool = false;
            }
        } while(continuebool);



    } //main

} //Class
