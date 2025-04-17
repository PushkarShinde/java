import java.util.Scanner;

public class DigitalLock {
    private int[] keys = new int[3];    // Single array for security keys
    private boolean[] matched = new boolean[2]; // Track match of last two digits
    private boolean open;               // Lock status
    private int count;                  // Track number of inputs
    private int[] inputs = new int[3];  // Store last 3 inputs

    public DigitalLock() {
        open = false;                   // Lock starts closed
        count = 0;                      // Initialize input counter
    }

    public void setKeys() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Set your lock (3 digits, one at a time):");
        for (int i = 0; i < 3; i++) {
            System.out.print("Key " + (i + 1) + ": ");
            keys[i] = sc.nextInt();
        }
        // Reset state
        open = false;
        count = 0;
        for (int i = 0; i < 2; i++) matched[i] = false;
    }

    public boolean tryDigit(int digit) {
        inputs[count % 3] = digit;      // Store input in circular buffer
        count++;

        if (count >= 3) {               // Check if we have 3 digits
            int d1 = inputs[(count - 3) % 3];
            int d2 = inputs[(count - 2) % 3];
            int d3 = inputs[(count - 1) % 3];

            // Update match status for last two digits
            matched[0] = (d1 == keys[0]); // First digit match
            matched[1] = (d2 == keys[1]); // Second digit match

            // Open if all three match
            if (matched[0] && matched[1] && d3 == keys[2]) {
                open = true;
                return true;            // Success
            }
        }
        return false;                   // Not unlocked yet
    }

    public static void main(String[] args) {
        DigitalLock lock = new DigitalLock();
        lock.setKeys();
        Scanner sc = new Scanner(System.in);
        boolean unlocked = false;

        System.out.println("Enter digits one at a time to unlock (0 to exit):");
        while (!unlocked) {
            System.out.print("Digit: ");
            int digit = sc.nextInt();

            if (digit == 0) {           // Exit option
                System.out.println("Exiting. Lock stays closed.");
                break;
            }

            unlocked = lock.tryDigit(digit);
            if (unlocked) {
                System.out.println("Unlocked!");
            } else {
                System.out.println("Um...okay, next!");
            }
        }
    }
}