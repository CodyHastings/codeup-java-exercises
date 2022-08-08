public class Person {

private String name;
    public String getName(){
     return name;
    }

    public Person(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("hello, " + name);
    }

    public static void main(String[] args) {
        Person newPerson = new Person("Bob");
        System.out.println(newPerson.name);
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }

//    Create a static method named addPerson.
//    It should accept an array of Person objects, as well as a single person object to add to the passed array.
//
//    It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.




}
