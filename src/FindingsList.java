import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingsList {
    
    public FindingsList() throws InterruptedException {
        Thread.sleep(500);

        System.out.println("Welcome back!");
        ArrayList<String> rockList = new ArrayList<String>();

        rockList.add("Rock");
        rockList.add("Weird rock");
        rockList.add("Smooth rock");
        rockList.add("Not rock");

        System.out.println("Rock's have been downloaded.");
        System.out.println(rockList);
        System.out.println("ERROR! One of these items is not a rock! Please remove it.");

        rockList.remove("Not rock");

        System.out.println("\nPerfect.");
        System.out.println(rockList);

        Thread.sleep(1000);

        HashMap<String, String> fossils = new HashMap<>();

        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight.");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped, it implies there was once water.");
        fossils.put("Tooth Fossil", "The tooth from an unknown fossil.");

        System.out.println("\nFossil data downloaded.");
        System.out.println("\nWhich of the fossils would you like the learn more about? (Bird Fossil, Fish Fossil, or Tooth Fossil?)");

        Scanner input = new Scanner(System.in);

        String fossilChoice = input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird Fossil")) {
            System.out.println("Fossil: " + fossilChoice 
            + "\nDescription: " + fossils.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Fish Fossil")) {
            System.out.println("Fossil: " + fossilChoice 
            + "\nDescription: " + fossils.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Tooth Fossil")) {
            System.out.println("Fossil: " + fossilChoice
            + "\nDescription: " + fossils.get(fossilChoice));
        }

        Thread.sleep(700);

        HashSet<String> specialSupplies = new HashSet<>();


        specialSupplies.add("Medical Bag");
        specialSupplies.add("DNA Anylizer");
        specialSupplies.add("Laser");

        specialSupplies.remove("Laser");

        System.out.println(specialSupplies);
    }
    
    private void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
