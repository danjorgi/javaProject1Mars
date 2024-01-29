import java.util.Scanner;

public class GuessingGame {

    public GuessingGame() {
        System.out.println("Greetings Earthling!");
        System.out.println("What's your name? (Type your name)");

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
    }

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
    }

}