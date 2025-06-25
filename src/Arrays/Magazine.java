package Arrays;

// Magazine class implementing Printable
class Magazine implements Printable {
    String name;

    Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Magazine: " + name);
    }
}
