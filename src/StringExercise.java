public class StringExercise {
    public static void main(String[] args) {

        String theWall = "We don't need no education \nWe don't need no thought control";
        System.out.println(theWall);

        String string2 = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(string2);

        String string3 = "In windows, the main drive is usually C:\\";
        System.out.println(string3);

        String string4 = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";
        System.out.println(string4);



        String superString = "We don't need no education \n We don't need no thought control" +
                 "Check \"this\" out!, \"s inside of \"s! \n" +
                 "In windows, the main drive is usually C:\\ \n" +
                 "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";

        System.out.println(superString);
    }

}