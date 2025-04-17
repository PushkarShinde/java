package Collections.Set;
import java.util.HashSet;
import java.util.Arrays;
public class LearnHashSet {
    public static void main(String[] args) {
        // Create a list with duplicates
        String[] emails = {"alice@example.com", "bob@example.com", "alice@example.com"};
        System.out.println("Original emails: " + Arrays.toString(emails));

        // Use HashSet to remove duplicates
        HashSet<String> uniqueEmails = new HashSet<>(Arrays.asList(emails));
        System.out.println("Unique emails: " + uniqueEmails); // [alice@example.com, bob@example.com]
    }
}
