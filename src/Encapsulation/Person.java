package Encapsulation;

public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        setName(name); // Use setter for validation
        setAge(age);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}
