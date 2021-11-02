package movies;
import static movies.MoviesArray.findAll;

public class Movie {

    private String name;
    private String category;

    public Movie(String name, String category){
        this.name = name;
        this.category = category;

    }
    public String getName(){
        return this.name;
    }

    public String getCategory(){
        return this.category;
    }
    public void setCategory(String newCategory){
        this.name = newCategory;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public static void itteration(){
        int i = 0;

        i += 1;

        System.out.println(i);

    }

    public static void getAllMovies(){
        for (int i = 0; i < findAll().length; i++) {
            System.out.println(findAll()[i].getName());
        }
    }


    public static void viewMoviesCategory(String category){
        for (int i = 0; i < findAll().length; i++) {
            if(findAll()[i].getCategory() == category){
                System.out.println(findAll()[i].getName());
            }

        }

    }

    public static void main(String[] args) {


        Movie matrix = new Movie("TheMatrix", "Sci-fi");

        System.out.println(matrix.getName());
        matrix.setName("not the matrix anymore");
        System.out.println(matrix.getName());

        itteration();
        itteration();
        itteration();
        itteration();
        itteration();
    }
}
