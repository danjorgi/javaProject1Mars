import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public GuessingGame() {
        System.out.println("Greetings Earthling!");
        System.out.println("What's your name? (Type your name)");

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        System.out.println("Alright " + name + ", I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess what it is? (Type a number.)");

        Random rand = new Random();
        int number = rand.nextInt(100);
        int tries = 0;

        while (true) {
            int guess = input.nextInt();
            
            tries = tries + 1;

            if (guess < number) {
                System.out.println("Your guess is too low, try again.");
            } else if (guess > number) {
                System.out.println("Your guess is too high, try again.");
            } else {
                System.out.println("Well done " + name);
                System.out.println("You found my number in " + tries + " tries!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
    }

}