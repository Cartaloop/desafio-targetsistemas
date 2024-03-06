package reverseString;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string para inverter: ");
        String input = scanner.nextLine();

        String reversedString = reverseString(input);


        System.out.println("String invertida: " + reversedString);

        scanner.close();
    }

    public static String reverseString(String input) {
        input.toLowerCase();
        char[] characters = input.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }

        return new String(characters);
    }
}
