package Lab8.exercise1;

public class Car extends Vehicle {
    private int maxPassengers;
    private String regNo;


    public Car(double price, double length, double height, double weight,
               String manufacturer, String model, int maxPassengers, String regNo){
        super(price, length, height, weight, manufacturer, model);
        setMaxPassengers(maxPassengers);
        setRegNo(regNo);
    }

    public  Car(){
        setMaxPassengers(0);
        setRegNo("Not Available");

    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String toString(){
        return super.toString() + "\nMax Passengers: " + getMaxPassengers() + "\nRegistration: " + getRegNo() + "\n";
    }
}
