import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CarEngineTest {
    private static CarEngine car;

    private static int count = 0;

    @BeforeAll
    private static void setUp() {
        car = null;
    }

    @AfterEach
    private void summary() {
        count += 1;
        System.out.println(count + " Tests ran.");
    }
    @AfterAll
    private static void tearDown() {
        System.out.println("All tests are done");

    }
    @Test
    public void test_setCompanyName(){
        car = new CarEngine();
        car.setCompanyName(null); // test if company name is not passed
        assertEquals("Unknown",car.getCompanyName());

        car.setCompanyName("Tesla"); // test if company name is passed
        assertEquals("Tesla",car.getCompanyName());
    }
    @Test
    public void test_setNumCylinders(){
        car = new CarEngine();
        car.setNumCylinders(9);// test if more than 8 cylinders
        assertEquals(0,car.getNumCylinders());

        car.setNumCylinders(6);// test if car has 6 cylinders
        assertEquals(6,car.getNumCylinders());
    }
    @Test
    public void test_setBoreSize(){
        car = new CarEngine();
        car.setBoreSize(101);//test if greater than 100
        assertEquals(0,car.getBoreSize());
        car.setBoreSize(-200);
        assertEquals(0,car.getBoreSize());

    }
    @Test
    public void test_setEngineDisplacement(){
        car = new CarEngine();
        car.setBoreSize(80);
        car.setStroke(90);
        car.setNumCylinders(1);
        car.setEngineDisplacement();
        assertEquals(452160.0,car.getEngineDisplacement());

        car.setBoreSize(100);//testing to ensure the limits are working
        car.setStroke(101);
        car.setNumCylinders(8);
        car.setEngineDisplacement();
        assertEquals(0,car.getEngineDisplacement());

    }
    @Test
    public void test_setHorsePower(){
        car = new CarEngine();
        car.setTorque(100);
        car.setSpeed(500);
        car.setHorsepower(false);
        assertEquals(9.520182609558105 ,car.getHorsepower());

        car.setTorque(-100);
        car.setSpeed(500);
        car.setHorsepower(false);
        assertEquals(0 ,car.getHorsepower());


    }


}