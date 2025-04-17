package Collections.Set;
import java.util.TreeSet;
public class LearnTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        // Adding scores
        scores.add(85);
        scores.add(90);
        scores.add(95);
        System.out.println("Scores in sorted order: " + scores); // [85, 90, 95]

        // Navigation methods
        System.out.println("Smallest score >= 88: " + scores.ceiling(88)); // 90
        System.out.println("Largest score < 90: " + scores.lower(90)); // 85

        // Removing an element
        scores.remove(90);
        System.out.println("After removing 90: " + scores); // [85, 95]
    }
}
