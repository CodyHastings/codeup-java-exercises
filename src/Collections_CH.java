import java.util.ArrayList;
import java.util.HashMap;

public class Collections_CH {
    public static void main(String[] args) {

//        COLLECTIONS


//        Array Lists

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(20);
        numbers.add(0, 21);
        numbers.add(22);
        numbers.add(20);
        numbers.add(4, 42);

//        System.out.println(numbers.size());
//        System.out.println(numbers.get(2));
//
//        System.out.println("numbers.indexOf(20) = " + numbers.indexOf(20));
//        System.out.println("numbers.indexOf(\"cat\") = " + numbers.indexOf("cat"));
//
//        System.out.println(numbers);

        ArrayList<String> roasts = new ArrayList<>();

        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");
//        System.out.println(roasts);
//
//        System.out.println("roasts.contains(\"dark\") = " + roasts.contains("dark")); // true
//        System.out.println("roasts.contains(\"espresso\") = " + roasts.contains("espresso"));
//        System.out.println("roasts.lastIndexOf(\"medium\") = " + roasts.lastIndexOf("medium"));
//        System.out.println("roasts.isEmpty() = " + roasts.isEmpty());

        ArrayList<String> emptyList = new ArrayList<>();

//        System.out.println("emptyList.isEmpty() = " + emptyList.isEmpty());

        roasts.remove("espresso"); // false
        roasts.remove("medium"); // true
//        System.out.println(roasts);

        roasts.remove(2); // "dark"
//        System.out.println(roasts);


//        Hash Maps

//        HashMap<String, String> usernames = new HashMap<>();


//        usernames.put("Ryan", "ryanorsinger");
//        usernames.put("Zach", "zgulde");
//        usernames.put("Fernando", "fmendozaro");
//        usernames.put("Justin", "jreich5");
//
//        System.out.println(usernames);

        HashMap<String, String> MattsHashMap = new HashMap<>();

        MattsHashMap.put("Matt", "matt123");
        MattsHashMap.put("Matt", "matt321");
        MattsHashMap.put("Matt", "matt425");

//        System.out.println("MattsHashMap = " + MattsHashMap);

//        System.out.println("usernames.get(\"Ryan\") = " + usernames.get("Ryan"));
//        System.out.println("usernames.get(\"Phillip\") = " + usernames.get("Phillip"));
//        System.out.println("usernames.getOrDefault(\"Jason\", \"gocodeup\") = " + usernames.getOrDefault("Jason", "gocodeup"));
//        System.out.println("usernames.containsKey(\"Justin\") = " + usernames.containsKey("Justin"));
//        System.out.println("usernames.containsValue(\"fmendozaro\") = " + usernames.containsValue("fmendozaro"));
        HashMap<String, String> usernames = new HashMap<>();
        usernames.put("Ryan", "ryanorsinger");
        usernames.putIfAbsent("Zach", "zgulde");
        usernames.putIfAbsent("Zach", "coderdude24");

        System.out.println(usernames);

        usernames.remove("Zach");
        System.out.println(usernames);

        usernames.replace("Jim", "torvalds");
        System.out.println(usernames);

        usernames.clear();

        System.out.println("usernames.isEmpty() = " + usernames.isEmpty());

    }
}
