import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase();
        boolean isPangram = checkIfPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        } 
        
        scanner.close();
    }
    
    public static boolean checkIfPangram(String input) {
        boolean[] isPresent = new boolean[26];
        
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a';
                isPresent[index] = true;
            }
        }
        
        for (boolean present : isPresent) {
            if (!present) {
                return false;
            }
        }
        
        return true;
    }
}

