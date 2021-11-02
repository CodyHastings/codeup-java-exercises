import java.util.Arrays;

public class Candy {

    public String name;
    public String size;
    public String[] descriptors;

    public Candy(String name){
        this.name = name;
        this.size = "2ish";
    }

    public Candy(String name, String size){
        this.name = name;
        this.size = size;
    }

    public Candy(String name, String size, String[] descriptors){
        this.name = name;
        this.size = size;
        this.descriptors = descriptors;


    }

    public static void printCandy(String name, String size){

        System.out.printf("Ahhh, a %s! I see that you got the %s of it. Sounds good! :)\n", name, size);

    }

    public static void printCandy(String name, String size, String[] descriptors){

        System.out.printf("Ahhh, a %s! I see that you got the %s of it. some noteable details include: %s :)\n", name, size, Arrays.toString(descriptors));

    }

    public static void main(String[] args) {
        Candy firstCandy = new Candy("Taffy", "12foot");

      firstCandy.printCandy(firstCandy.name, firstCandy.size);

      Candy anotherCandy = new Candy("AirHead");

      anotherCandy.printCandy(anotherCandy.name, anotherCandy.size);

      String[] descriptors = {"Very Sour", "Softish", "Really Sour"};

      Candy detailedCandy = new Candy("Sour Skittles", "regular", descriptors);

      detailedCandy.printCandy(detailedCandy.name, detailedCandy.size, detailedCandy.descriptors);

    }
}
