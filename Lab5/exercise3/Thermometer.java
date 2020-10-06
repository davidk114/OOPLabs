package Lab5.exercise3;

public class Thermometer {

    private int currTemp;
    private int maxTemp;
    private int minTemp;

    public int getCurrTemp() {
        return currTemp;
    }
    public int getMaxTemp(){
        return maxTemp;
    }
    public int getMinTemp(){
        return minTemp;
    }

    public void setCurrTemp(int currTemp){
        this.currTemp=currTemp;
    }
    public void setMaxTemp(int maxTemp){
        this.maxTemp=maxTemp;
    }
    public void setMinTemp(int minTemp){
        this.minTemp=minTemp;
    }

    public Thermometer(int currTemp, int maxTemp, int minTemp){
        setCurrTemp(currTemp);
        setMaxTemp(maxTemp);
        setMinTemp(minTemp);
    }

    public Thermometer(){
        this(0, Integer.MAX_VALUE, Integer.MIN_VALUE);

    }

    public String toString(){
        return "Current Temperature: " + getCurrTemp() +
                "\nMax Temperature: " + getMaxTemp() +
                "\nMin Temperature: " + getMinTemp();


    }

}
