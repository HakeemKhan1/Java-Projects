import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter project's title: ");
        String Project = s.next();
        System.out.println("Enter your budget: ");
        float  Budget = s.nextFloat();
        System.out.println("Enter wall height (feet): ");
        float Height = s.nextFloat();
        System.out.println("Enter wall width (feet): ");
        float Width = s.nextFloat();
        System.out.println("Enter wall length (feet): ");
        float Length = s.nextFloat();
        System.out.println("Enter the price of a can of paint: ");
        float CanPrice = s.nextFloat() ;
        System.out.println("******************************");
        PaintJob painter = new PaintJob(Project, Height, Width, Length);
        painter.setBudget(Budget);
        painter.setCanPrice(CanPrice);
        System.out.println("Project name: " + painter.getProjectName());
        System.out.println("Wall area: " + painter.getArea());
        System.out.println("******************************");
        for (int i = 1; i < 4; i += 1) {
            painter.Cost(i);
            System.out.println("Amount of paint needed: " + painter.paintNeeded);
            System.out.println("Number of paint cans needed: " + painter.numCans);
            System.out.println("The price of " + i + "coat(s) of paint: " + painter.coatCost);
            System.out.println("The amount of money left from the budget after a " + i + "coat(s): " + painter.getBankaccount());
            System.out.println("******************************");
        }
        }

    }

