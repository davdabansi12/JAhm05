import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Deque<Integer> dqueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Function to get numbers from the user and add to the deque
        while (dqueue.size() < 5) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Check if the number is greater than 50
            if (number > 50) {
                dqueue.add(number);
                System.out.println("Number " + number + " added to the deque.");
            } else {
                System.out.println("Number not added. Please enter a number greater than 50.");
            }
        }

        // Print the final dequeue
        System.out.println("Final deque: " + dqueue);

        // Close the scanner
        scanner.close();
    }
}
