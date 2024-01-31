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
        sleep(1000);

        System.out.println("\nWhat is your name?");

        String name = input.nextLine();
        
        System.out.println("\nHello, " + name + ". Welcome to the Expedition prep program.\n" 
            + " Are you ready to head out into the new world?\n" 
            + "(Type Y or N)");

        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("Yes")) {
            System.out.println("\nI knew you would say that. You are a team leader for a reason.");
        } else {
            System.out.println("\nToo bad, you are team leader, you have to go.");
        }

        System.out.println("\nHow many people do you want on your team?");

        int teamMembers = input.nextInt();
        input.nextLine();

        if (teamMembers > 2) {
            System.out.println("\nThat's way too many people. We can only send 2 more members.");
            teamMembers = 2;
        } else if (teamMembers < 2) {
            System.out.println("\nThat's not enough people. We need you and 2 more members.");
            teamMembers = 2;
        } else if (teamMembers == 2) {
            System.out.println("\nThat's a perfect sized team. Good job.");
        }

        System.out.println("\nYou are allowed to bring one snack with you."
            + "\nWhat do you want to bring?");

        String snack = input.nextLine();

        System.out.println("\nNice choice, you will be bringing " + snack + " with you.");
        System.out.println("\nYou have the choice of 3 vehicles"
            + "\nA: A Mars Rover"
            + "\nB: A Chevy Silverado" 
            + "\nC: A Honda Civic"
            + "\n(Choose A, B, or C)");

        String vehicleChoice = input.nextLine();

        if (vehicleChoice.equalsIgnoreCase("A")) {
            vehicleChoice = "a Mars Rover";
        } else if (vehicleChoice.equalsIgnoreCase("B")) {
            vehicleChoice = "a Chevy Silverado";
        } else if (vehicleChoice.equalsIgnoreCase("C")) {
            vehicleChoice = "a Honda Civic";
        } else {
            vehicleChoice = "your feet";
        }

        System.out.println("\nYour expedition team is as follows:"
            + "\nLed by: " + name + " with " + teamMembers + " teammates."
            + "\nTo explore the surface of Mars using " + vehicleChoice + "."
            + "\nExploration team heads out in");
        System.out.println("5...");
        sleep(1000);
        System.out.println("4...");
        sleep(1000);
        System.out.println("3...");
        sleep(1000);
        System.out.println("2...");
        sleep(1000);
        System.out.println("1...");
        sleep(1000);
        System.out.println("GO GO GO!!!");
    }

    private void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
