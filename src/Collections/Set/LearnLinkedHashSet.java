package Collections.Set;
import java.util.LinkedHashSet;
public class LearnLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> userLogins = new LinkedHashSet<>();

        // Adding user logins
        userLogins.add("User1");
        userLogins.add("User2");
        userLogins.add("User1"); // Duplicate, ignored
        userLogins.add("User3");
        System.out.println("User logins in order: " + userLogins); // [User1, User2, User3]

        // Removing a user
        userLogins.remove("User2");
        System.out.println("After removing User2: " + userLogins); // [User1, User3]
    }
}
