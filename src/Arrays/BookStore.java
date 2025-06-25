package Arrays;

public class BookStore {
    public static void main(String[] args) {
        // Declare an array of interface type Printable
        Printable[] items = new Printable[3];

        // Store objects of different classes that implement Printable
        items[0] = new Book("The Great Gatsby");
        items[1] = new Magazine("National Geographic");
        items[2] = new Book("1984");

        // Iterate and call print() on each element
        for (Printable item : items) {
            item.print(); // Polymorphic behavior
        }
    }
}
