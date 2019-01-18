package exercises.week3Traits.ex04MessageEncrypting;

import java.util.Scanner;

public class HackerApplication {
    public static void main(String[] args) {
        System.out.println("please write your Message!");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();

        Messenger messenger = new Messenger();
        String cipherText = messenger.sendMessage(message);
        System.out.println("------------ Encrypted Message ---------");
        System.out.println(cipherText);

        String text = messenger.receiveMessage(cipherText);
        System.out.println("-------- Decrypted Message --------");
        System.out.println(text);

    }
}
