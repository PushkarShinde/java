package StaticMembers;

public class Main {
    public static void main(String[] args) {
        Human pushkar=new Human("Pushkar", 22, 2000000, false);
        Human anuj=new Human("Anuj", 18, 1500000, false);
        Human alka=new Human("Alka", 51, 1500000, true);
        Human kanchan=new Human("Kanchan", 58, 1500000, true);
        System.out.println(pushkar.population);
        System.out.println(anuj.population);
    }
}
/*
* The static keyword in Java is used to indicate that a member (variable, method, or block)
* belongs to the class itself rather than to instances (objects) of the class.
* This means it is shared across all instances of the class and can be accessed without
* creating an object.
* */