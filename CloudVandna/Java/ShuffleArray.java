import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input size from the user.
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        List<Integer> originalList = new ArrayList<>();

        // Enter array values from the user.
        System.out.println("Enter the array values:");
        for (int i = 0; i < size; i++) {
            originalList.add(scanner.nextInt());
        }

        // Shuffle the list
        Collections.shuffle(originalList);

        // Output
        System.out.println("Shuffled array: " + originalList);

        scanner.close();
    }
}
