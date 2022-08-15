import java.util.Arrays;

public class ArrayExercises {

    public static Person[] addPerson(Person[] personArr, Person personToAdd){
        Person[] newPersonArr = Arrays.copyOf(personArr, personArr.length + 1);

        newPersonArr[newPersonArr.length - 1] = personToAdd;
        return newPersonArr;
    }

    public static void main(String[] args) {

        Person person1 = new Person("TinMan");
        Person person2 = new Person("Lion");
        Person person3 = new Person("ScareCrow");

        Person[] personArr = {person1, person2, person3};

        for(Person person : personArr){
            System.out.println(person.getName());
        }
        Person person4 = new Person("Dorothy");

        System.out.println("person4.getName() = " + person4.getName());

        Person[] myNewArray = addPerson(personArr,person4);

        for(Person person : myNewArray){
            System.out.println(person.getName());
        }

    }
}
