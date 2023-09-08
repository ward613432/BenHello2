import java.util.Scanner;

public class BenHello {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        String userInput;

        System.out.println("Hello world!\nDo you gorge?");
        userInput = consoleInput.nextLine().toLowerCase();

        if (userInput.contentEquals("yes")) {
            System.out.println("good i gorge too");
        }
        else if (userInput.contentEquals("no")) {
            System.out.println("unfortunate");
        }
        else {
            System.out.println("i do not understand i need 20 years to think about this");
        }
    }
}