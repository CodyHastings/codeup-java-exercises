package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString(){
        System.out.println("String Input: ");
        return scanner.nextLine();
    }

//    public Boolean yesNo(){
//        System.out.println("Boolean Input: \n");
//        return scanner.nextBoolean();
//    }

    public Boolean yesNo(){
        System.out.println("Yes or no?");
        String response = scanner.nextLine();
        return response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max){
        System.out.println("Enter an integer between " + min + " and " + max);
        int userInt = scanner.nextInt();
    if(userInt >= min && userInt <= max){

    } else {
        getInt(min, max);
    }
        return userInt;
    }

    public int getInt(){
        try{
            return Integer.parseInt(getString());
        } catch (NumberFormatException e){
            System.out.println("Given input cannot be parsed as an int");
            System.out.println("Enter an integer");
//			e.printStackTrace();
            return getInt();
        }
    }

//    public int getInt(){
//        return scanner.nextInt();
//    }

public double getDouble(){
    try{
        return Double.parseDouble(getString());
    } catch (NumberFormatException e){
        System.out.println("Given input cannot be parsed as an double");
        e.printStackTrace();
        return getDouble();
    }
}
//    public double getDouble(){
//        return scanner.nextDouble();
//    }

    public double getDouble(double min, double max){
        System.out.println("Enter a number with a decimal between " + min + " and " + max);
        double userDouble = scanner.nextDouble();
        if(userDouble >= min && userDouble <= max){

        } else {
            getDouble(min, max);
        }
        return userDouble;
    }

}
