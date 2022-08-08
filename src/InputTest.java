import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input newInput = new Input();
        newInput.getString();
        if(newInput.yesNo()){
            System.out.println("Thank you for the positivity");
        } else {
            System.out.println("Nope");
        }

        newInput.getInt(1,10);
        newInput.getDouble(1.0, 10.5);

    }
}
