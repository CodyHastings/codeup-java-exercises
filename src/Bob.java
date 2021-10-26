import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi I'm Bob. What's up?");

        String userInput = scanner.nextLine();

        if (userInput.contains("?")){

            System.out.println("Sure.....");

        }

        else if(userInput.contains("!")){
            System.out.println("Whoa! Chill out!");
        }

        else if(userInput.contains(" ")){
            System.out.println("Fine be that way");
        } else {
            System.out.println("Whatever..");
        }

    }
}
