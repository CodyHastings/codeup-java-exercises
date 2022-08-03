import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleIO_CH {
    public static void main(String[] args) {
//        String name = "codeup";
//        String anotherName = "Cody";
//        System.out.printf("Hello there, %s. Nice to see you.", name);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();


        System.out.println("You entered: --> \"" + userInput + "\" <--");

        int parsedString = parseInt(userInput);
        System.out.println("parsedString = " + parsedString);
//        double pi = 3.14159;
//
//        if(pi == 3.14159){
//
//        }
    }

}
