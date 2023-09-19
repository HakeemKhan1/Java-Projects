import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<CarEngine> engineList = new ArrayList<>();

        CarEngine car1 = new CarEngine("Tesla", 700, 7000, 101, 43, 0);
        CarEngine car2 = new CarEngine("Ford", 302, 7000, 24, 54, 4);
        CarEngine car3 = new CarEngine("Pagani", 823, 7000, 78, 43, 8);
        CarEngine car4 = new CarEngine("Lotus", 582, 7000, 42, 35, 6);
        CarEngine car5 = new CarEngine("BMW", 530, 7000, 54, 65, 6);

        engineList.add(car1);
        engineList.add(car2);
        engineList.add(car3);
        engineList.add(car4);
        engineList.add(car5);
        System.out.println("Hakeem Khan SN: 101233039");
        System.out.println("________________________________________________");
        printEngineDetails(engineList);

    }
    public static void printEngineDetails(ArrayList<CarEngine> engineList) {
        int i =0;
        for (CarEngine engine: engineList ) {
            System.out.println("Car " + i + ":");
            System.out.println("Company Name: " + engine.getCompanyName());
            System.out.println("Number of Cylinders: " + engine.getNumCylinders());
            System.out.println("Engine Displacement: " + engine.getEngineDisplacement() + " mm^3");
            System.out.println("Horsepower: " + engine.getHorsepower() + " HP");
            System.out.println("________________________________________________");
            i++;
        }
    }

}