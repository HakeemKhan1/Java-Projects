import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PaintJob painter = new PaintJob();
        Scanner s = new Scanner(System.in);
        String Project = painter.getProjectName();
        float Budget = painter.getBudget();
        float Height = painter.getHeight();
        float Width = painter.getWidth();
        float Length = painter.getLength();
        float CanPrice =  painter.getCanPrice();
        System.out.println("Enter project's title: ");
        Project = s.next();
        System.out.println("Enter your budget: ");
        Budget = s.nextFloat();
        System.out.println("Enter wall height (feet): ");
        Height = s.nextFloat();
        System.out.println("Enter wall width (feet): ");
        Width = s.nextFloat();
        System.out.println("Enter wall length (feet): ");
        Length = s.nextFloat();
        System.out.println("Enter the price of a can of paint: ");
        CanPrice = s.nextFloat() ;
        System.out.println("******************************");

        PaintJob painter2 = new PaintJob(Project, Height, Width, Length, Budget, CanPrice);
        System.out.println("Project name: " + painter2.getProjectName());
        System.out.println("Wall area: " + painter2.getArea());
        System.out.println("******************************");
        for (int i = 1; i < 4; i += 1) {
            System.out.println("Amount of paint needed: " + painter.paintNeeded);
            System.out.println("Number of paint cans needed: " + painter.numCans);
            System.out.println("The price of " + i + "coat(s) of paint: " + painter.coatCost);
            System.out.println("The amount of money left from the budget after a " + i + "coat(s): " + painter.getBankaccount());
            System.out.println("******************************");

        }

    }
}
