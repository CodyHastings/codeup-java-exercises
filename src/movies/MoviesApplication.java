package movies;
import java.util.Scanner;

import static movies.Movie.getAllMovies;
import static movies.Movie.viewMoviesCategory;

public class MoviesApplication {

    public static String init(){
        System.out.println("What would you like to do?\n\n" +
                "0 - Exit Application\n" +
                "1 - view all Movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "\n" +
                "Enter your Choice: "
        );
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();

        return userInput;
    }



    public static void main(String[] args) {
//        System.out.println(findAll()[0].getName());

        String userInput = init();

        switch (userInput) {
            case "0":
                System.out.println("EXITING APPLICATION.....");
                break;
            case "1":
                getAllMovies();
                break;
            case"2":
                viewMoviesCategory("animated");
                break;
            case"3":
                viewMoviesCategory("drama");
                break;
            case"4":
                viewMoviesCategory("horror");
                break;
            case"5":
                viewMoviesCategory("scifi");
                break;

        }





    }
}
