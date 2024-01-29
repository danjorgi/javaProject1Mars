import java.util.Scanner;

public class MarsExpedition {
    
    public MarsExpedition() {
        Scanner input = new Scanner(System.in);

        System.out.println("System starting...");
        sleep(1000);
        System.out.println("Booting...");
        sleep(1000);
        System.out.println("Still booting...");
        sleep(1000);
        System.out.println("Almost there...");
        sleep(1000);
        System.out.println("This is taking forver...");
        sleep(1000);
        System.out.println("Done!");

        System.out.println("\nWhat is your name?");

        String name = input.nextLine();
        
        System.out.println("Hello, " + name + ". Welcome to the Expedition prep program.\n" 
            + " Are you ready to head out into the new world?\n" 
            + "(Type Y or N)");

        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("Yes")) {
            System.out.println("I knew you would say that. You are a team leader for a reason.");
        } else {
            System.out.println("Too bad, you are team leader, you have to go.");
        }

        System.out.println("How many people do you want on your team?");

        int teamMembers = input.nextInt();
        input.nextLine();

        if (teamMembers > 2) {
            System.out.println("That's way too many people. We can only send 2 more members.");
            teamMembers = 2;
        } else if (teamMembers < 2) {
            System.out.println("That's not enough people. We need you and 2 more members.");
            teamMembers = 2;
        } else if (teamMembers == 2) {
            System.out.println("That's a perfect sized team. Good job.");
        }

        System.out.println("You are allowed to bring one snack with you.\n"
            + "What do you want to bring?");

        String snack = input.nextLine();

        System.out.println("Nice choice, you will be bringing " + snack + " with you.");
    }

    private void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MarsExpedition expedition = new MarsExpedition();
    }
}
