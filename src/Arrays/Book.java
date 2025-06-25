package Arrays;

class Book implements Printable {
    String title;

    Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Book: " + title);
    }
}
