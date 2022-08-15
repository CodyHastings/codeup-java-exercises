package shapes;

import util.Input;

public class CircleApp {
    private static int i = 1;

    public static void main(String[] args) {

        boolean keepGoing;

        do {

            System.out.println("Let's make a circle. Please input a Radius");

            Input userInput = new Input();

            Circle myCircle = new Circle(userInput.getDouble());

            System.out.println("area = " + myCircle.getArea());
            System.out.println("circumference = " + myCircle.getCircumference());
            System.out.println("would you like to make another circle?");

            userInput.getString();
            boolean yesNo = userInput.yesNo();

            if(yesNo){
                i++;
                keepGoing = true;
            } else{
                System.out.println("you made " + i + " circles");
                keepGoing = false;
            }

        }while(keepGoing);


    }
}
