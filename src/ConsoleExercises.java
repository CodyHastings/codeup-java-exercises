import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Exercises
//        For the following exercises, create a new class named ConsoleExercises with a main method like the one in your HelloWorld class.
//
//        Copy this code into your main method:
//
//
        double pi = 3.14159;
//        Write some Java code that uses the variable pi to output the following:
        System.out.format("The value of pi is approximately %.2f \n", pi);
//
//        The value of pi is approximately 3.14.
//                Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.
//
//        Explore the Scanner Class.
//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//        System.out.format("Enter an integer please: ");
//        int myInt = scanner.nextInt();

//        System.out.println(myInt);
//        What happens if you input something that is not an integer?
//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        System.out.format("Enter a word please: ");
        String firstWord = scanner.nextLine();

        System.out.format("Another word: ");
        String secondWord = scanner.nextLine();

        System.out.format("And Another word: ");
        String thirdWord = scanner.nextLine();

        System.out.printf("Your first word entered was %s. Your second word was %s. Also your third word was %s", firstWord, secondWord, thirdWord);
//                What happens if you enter less than 3 words?
//                What happens if you enter more than 3 words?
//                Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//
//        do you capture all the words?
//                Rewrite the above example using the nextLine method.
//
//                Calculate the perimeter and area of Codeup's classrooms.
//        Prompt the user to enter values of length and width of a classroom at Codeup.
//
//                Use the nextLine method to get user input and parse the resulting string to a numeric type.
//
//        Assume that the rooms are perfect rectangles.
//                Assume that the user will enter valid numeric data for length and width.
//                Display the area and perimeter of that classroom.
//
//                The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
//
//                Bonuses
//        In your perimeter/area calculator: - Accept decimal entries. - Calculate the volume of the rooms in addition to the area and perimeter.
//
//        The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimiter method. Add the following line of code to your application after you have created a scanner (assuming the variable holding the Scanner is named scanner):
//
//
//        scanner.useDelimiter("\n");
//        How does this change the way your program operates?
//
//        Rewrite your classroom program to use nextInt method. If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.
//
    }
}
