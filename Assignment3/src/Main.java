import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * This class provides a simple program to manage shipping container details using manual input or RFID scanning.
 */
public class Main {
    public static void main(String[] args) {
        ShippingContainerRFID test = new ShippingContainerRFID(10);
        String input2; // Store the user input
        String[] options = {"M", "R", "Q", "P"};
        List<String> optionsList = Arrays.asList(options);
        test.containerContentList();
        int num = 100;
        Scanner s = new Scanner(System.in); // Scanner
        boolean loop = true;
        s.useDelimiter("\\n");
        ArrayList<ShipContainer> container = new ArrayList<>();

        do {
            System.out.println();
            System.out.println("Choose type of details entering method: ");
            System.out.println("    M)anual container entry. ");
            System.out.println("    R)FID container entry ");
            System.out.println("    P)rint Shipping container's details. ");
            System.out.println("    Q)uit ");
            System.out.print("Choice:");
            String optionInput = s.next().toUpperCase();

            // Validate the user input against available options
            if (!optionsList.contains(optionInput)) {
                System.out.println("Invalid option, please try again");
            }

            if (optionInput.equals("M")) {
                System.out.print("Enter the container contents: ");
                String contents = s.next();
                ManualContentList object = new ManualContentList(num); // Create an object in a list to add to the array.
                object.setContents(contents);
                container.add(object);
                object.setContainerID(num);
                num++;

            }
            if (optionInput.equals("R")) {
                ShippingContainerRFID rfid = new ShippingContainerRFID(num);
                do {
                    System.out.print("Scan an RFID (Enter the container contents): ");
                    String contents = s.next(); // Contents to add to the container
                    rfid.setContents(contents);
                    if (!container.contains(rfid)) {
                        container.add(rfid);
                    }
                    System.out.print("Would you like to scan another RFID (Y/N) ");
                    String type = s.next().toUpperCase(); // Get the input to either add another content or leave the program
                    input2 = type;
                } while (input2.equals("Y"));
                rfid.setContainerID(num);
                num++;
            }
            if (optionInput.equals("P")) {
                System.out.println("******* Shipping Container's details *******");
                for (int i = 0; i < container.size(); i++) {
                    container.get(i).printContent();
                }
            }
            if (optionInput.equals("Q")) {
                loop = false;
            }
        } while (loop);
    }
}