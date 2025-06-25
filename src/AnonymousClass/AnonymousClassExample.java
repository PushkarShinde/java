package AnonymousClass;

public class AnonymousClassExample {
    public static void main(String[] args) {
        // Simulate a button click listener using an anonymous inner class
        ClickListener listener = new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Button was clicked!");
            }
        };

        // Trigger the event
        simulateButtonClick(listener);
    }

    // Simulated button click function
    public static void simulateButtonClick(ClickListener listener) {
        System.out.println("Simulating button click...");
        listener.onClick();
    }
}
