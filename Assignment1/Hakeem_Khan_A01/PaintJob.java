import java.util.Scanner;
/*Author: Hakeem Khan
Date: 17 Jul 2023
Student ID: 101233039*/

public class PaintJob {
    public int numCans;
    public float coatCost,paintNeeded;
    private String projectName;
    private float height, width, length, area, budget, canPrice;
    private final float LITER_COVERS_SQUARE_FEET = 100;
    private float bankaccount;
    // default constructor - no input parameters
    public PaintJob(){
        numCans = 0;
        coatCost = 0;
        paintNeeded = 0;
        projectName = null;
        height= 0;
        width= 0;
        length= 0;
        area = 0;
        budget= 0;
        canPrice= 0;

    }
    //overloaded constructor which calculates and sets the room area
    public PaintJob (String Projectname,float height, float width, float length, float budget, float canPrice){
        this.height  = height;
        this.width = width;
        this.length = length;
        this.budget = budget;
        this.projectName = Projectname;
        this.canPrice = canPrice;

        coatCost = 0;
        paintNeeded = 0;
        numCans = 0;

        this.setArea(2 * ((height * width) + (height * length)));
    }


    public float getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(float bankaccount) {
        this.bankaccount = bankaccount;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public float getCanPrice() {
        return canPrice;
    }

    public void setCanPrice(float canPrice) {
        this.canPrice = canPrice;
    }

    public float getLITER_COVERS_SQUARE_FEET() {
        return LITER_COVERS_SQUARE_FEET;
    }

    //method cost calculated the cost of each coat of paint
    public void Cost (int numberofCoats){
         paintNeeded = (this.getArea() * numberofCoats/LITER_COVERS_SQUARE_FEET);
         numCans = (int) Math.ceil(paintNeeded/3.7);
         coatCost = numCans * canPrice;
         this.setBankaccount(budget - coatCost);

    }



}


