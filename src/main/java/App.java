
import java.util.Scanner;


public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean programRunning = true;
        while(programRunning) {
            System.out.println("Welcome to Ceaser Cipher\n" +
                    "------------------------------------------------\n" +
                    "Choose:\n 1 for Encryption\n 2 for Decryption\n # to Exit");
            String selection = sc.nextLine();
            if (selection.equals("1")) {
                System.out.println("-----------------------------------------------");
                System.out.println("Enter the text to encrypt:");
                String text = sc.nextLine();
                System.out.println("Enter the encryption Key:");
                String stringKey = sc.nextLine();
                int intKey = Integer.parseInt(stringKey);
                System.out.println("-----------------------------------------------");
                Cipher cipherText = new Cipher(text, intKey);
                System.out.println("Your encrypted text is:" + cipherText.encryptText());
                System.out.println("-----------------------------------------------");
            } else if (selection.equals("2")) {
                System.out.println("-----------------------------------------------");
                System.out.println("Enter the text to decrypt:");
                String text = sc.nextLine();
                System.out.println("Enter the decryption Key:");
                String stringKey =sc.nextLine();
                int intKey = Integer.parseInt(stringKey);
                System.out.println("-----------------------------------------------");
                Decipher decipherText = new Decipher(text, intKey);
                System.out.println("Your decrypted text is:" + decipherText.decryptText());
                System.out.println("-----------------------------------------------");
                ;
            } else if (selection.equals("#")) {
                programRunning = false;
                System.exit(0);
            } else {
                System.out.println("Invalid input!!!!");
            }
        }

    }
}
