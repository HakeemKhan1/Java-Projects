import java.text.DecimalFormat;
public class CarEngine {
    private final int CC_FROM_HP = 15;
    private final int RADIANS_PER_SECOND = 5252;
    private float engineDisplacement;
    private float horsepower;
    private int numCylinders;
    private int stroke;
    private int boreSize;
    private int speed;
    private int torque;
    private String companyName;




    public CarEngine() {
        companyName = "Unknown";
        engineDisplacement = 0.0f;
        horsepower = 0.0f;
        numCylinders = 0;
        stroke = 0;
        boreSize = 0;
        speed = 0;
        torque = 0;
    }
    public CarEngine(String companyName, int itorque, int ispeed, int iboreSize, int istroke, int inumCylinders) {
        if (companyName == null){
            this.companyName = "Unknown";
        }
        if (inumCylinders > 8) {
            inumCylinders = 0;
        }
        if( istroke > 100){
            istroke = 0;
        }
        if (iboreSize > 100){
            iboreSize =0;
        }

        int[] val = {itorque,ispeed,iboreSize,istroke,inumCylinders};
        for (int i = 0; i <val.length;i++){
            if(val[i] < 0){
                val[i] = 0;
            }
        }
        this.companyName = companyName;
        torque = val[0];
        speed = val[1];
        boreSize = val[2];
        stroke = val[3];
        numCylinders = val[4];
        this.engineDisplacement = (float) 3.14 * (boreSize/2) * stroke * numCylinders;
        this.horsepower = (float) torque * ((float)speed/(RADIANS_PER_SECOND));

    }
    public int check(int iengine){ // method that ensures the integer values are greater than 0
        if (iengine<0){
            iengine = 0;
        }
        return iengine;
    }

    private float calculateHorsePowerFromTorque() {

        return (getTorque() * ((float) getSpeed()/ RADIANS_PER_SECOND)) ;


    }

    private float calculateEngineDisplacement() {
        return (float) (3.14 * ((float) Math.pow((boreSize/2),2)) * stroke * numCylinders);

    }

    private float calculateHorsepowerFromDisplacement(){
        return engineDisplacement/CC_FROM_HP;

    }

    public float getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement() {
        this.engineDisplacement = calculateEngineDisplacement();
    }

    public int getNumCylinders() {
        return numCylinders;
    }

    public void setNumCylinders(int numCylinders) {
        if (numCylinders <= 8) {
            this.numCylinders = check(numCylinders);
        } else {
            this.numCylinders = 0;
        }
    }


    public int getStroke() {
        return stroke;
    }

    public void setStroke(int stroke) {
        if (stroke>100){
            stroke = 0;
        }
        this.stroke = check(stroke);
    }

    public int getBoreSize() {
        return boreSize;
    }

    public void setBoreSize(int boreSize) {
        if (boreSize>100){
            boreSize = 0;
        }
        this.boreSize = check(boreSize);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = check(speed);
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = check(torque);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if (companyName == null){
            companyName = "Unknown";
        }
        this.companyName = companyName;
    }

    public float getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(boolean source) {
        if (source){
            this.horsepower = calculateHorsepowerFromDisplacement();
        }
        else {
            this.horsepower = calculateHorsePowerFromTorque() ;
        }

    }
}