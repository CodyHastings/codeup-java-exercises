import java.util.Arrays;

public class ArrayExercises {

//    public static String[] addPerson(String[] persons, Person person){
//
//        String[] biggerPersonsArray = {persons[0], persons[1], persons[2], person.firstName + " " + person.lastName};
////        System.out.println("the droids your looking for " + Arrays.deepToString( biggerPersonsArray));
//        return biggerPersonsArray;
//    }

    public static Person[] addPerson(Person[] persons, Person person){


        Person[] biggerPersonsArray = {
                persons[0],
                persons[1],
                persons[2],
                person
        };


        System.out.println("the droids your looking for " + Arrays.toString( biggerPersonsArray));

        for (Person row : biggerPersonsArray) {


            System.out.println(row.firstName);
        }

        return biggerPersonsArray;
    }

    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person person1 = new Person("Bob", "Bobberson");
        Person person2 = new Person("Jim", "Jimmerson");
        Person person3 = new Person("Jan", "Jannerson");

        String person1FullName = person1.firstName + " " + person1.lastName;
        String person2FullName = person2.firstName + " " + person2.lastName;
        String person3FullName = person3.firstName + " " + person3.lastName;

        String[] persons = {person1FullName, person2FullName, person3FullName};
        Person[] personsObjArr = {person1, person2, person3};



//        for(int i = 0; i < persons.length; i++) {
//            System.out.println(persons[i]);
//        }

//        addPerson(persons, person1);
        addPerson(personsObjArr, person1);
    }
}
