package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Pushkar", 22);
        System.out.println(person.getName()); // Output: Pushkar
        System.out.println(person.getAge());  // Output: 22

        // This will throw an exception
        try {
            person.setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Output: Age cannot be negative
        }
    }
}

