import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            char nextChar = (i < s.length() - 1) ? s.charAt(i + 1) : ' ';

            switch (currentChar) {
                case 'I':
                    if (nextChar == 'V' || nextChar == 'X') {
                        result -= 1;
                    } else {
                        result += 1;
                    }
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    if (nextChar == 'L' || nextChar == 'C') {
                        result -= 10;
                    } else {
                        result += 10;
                    }
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    if (nextChar == 'D' || nextChar == 'M') {
                        result -= 100;
                    } else {
                        result += 100;
                    }
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().trim();

        int result = romanToInt(romanNumeral);
        System.out.println("Integer value of " + romanNumeral + " is: " + result);
        scanner.close();
    }
}
