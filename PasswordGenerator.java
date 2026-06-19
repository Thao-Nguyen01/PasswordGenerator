import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Characters that can be used in the password
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*";

        // Combine everything together
        String allCharacters = letters + numbers + symbols;

        // Ask user for password length
        System.out.print("Enter password length: ");
        int length = input.nextInt();

        // Store generated password
        String password = "";

        Random random = new Random();

        // Generate password one character at a time
        for (int i = 0; i < length; i++) {

            int randomIndex = random.nextInt(allCharacters.length());

            password = password + allCharacters.charAt(randomIndex);
        }

        // Display result
        System.out.println("\nGenerated Password:");
        System.out.println(password);

        input.close();
    }
}