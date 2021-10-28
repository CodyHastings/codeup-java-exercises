import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play some Hangman\nPlayer 1 Enter a word");
        String theWord = scanner.nextLine();
        int theWordLength = theWord.length();
        String display = "";
        for (int i = 0; i < theWordLength; i++){
            display = display + "-";
        }

        System.out.println(display);
        System.out.println("Player 2: Enter a letter to guess");
        String guess = scanner.next();



        if(theWord.contains(guess)){
            System.out.println("good guess");
            int guessIndex = theWord.indexOf(guess);
            System.out.println(guessIndex);
            char theGuessedChar = theWord.charAt(guessIndex);
            System.out.println(theGuessedChar);
        }



    }
//    public static String sayHello(String name) {
//        System.out.println("you called the function");
//        return String.format("Hello, %s!", name);
//    }
}
