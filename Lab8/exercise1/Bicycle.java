package Lab8.exercise1;

public class Bicycle extends Vehicle {

    private int gearCount;
    private boolean hasBell;

    public Bicycle(double price, double length, double height, double weight,
                   String manufacturer, String model, int gearCount, boolean hasBell){
        super(price, length, height, weight, manufacturer, model);
        setGearCount(gearCount);
        setHasBell(hasBell);

    }

    public Bicycle(){
        setGearCount(0);
        setHasBell(false);
    }

    public boolean isHasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }

    public boolean getHasBell(){
       return hasBell;

    }


    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }


    public String toString(){
        String bellStr ="";
        if(hasBell==true)
            bellStr = "Yes";
        else
            bellStr ="No";

        return super.toString() + "\nGear Count: " + getGearCount() + "\nHas Bell?: " + bellStr + "\n";
    }

}
