package Lab8.exercise2;

public class Car extends Vehicle {
    private int maxPassengers;
    private String registrationNo;


    public Car(double price, double length, double height, double weight,
               String manufacturer, String model, int maxPassengers, String registrationNo){
        super(price, length, height, weight, manufacturer, model);
        setMaxPassengers(maxPassengers);
        setRegistrationNo(registrationNo);
    }

    public  Car(){
        setMaxPassengers(0);
        setRegistrationNo("Not Available");

    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String reg) {
        if(Validator.isValidRegNo(reg))
            registrationNo = reg;
        else
            registrationNo="Invalid Registration Number";
    }




    public String toString(){
        return super.toString() + "\nMax Passengers: " + getMaxPassengers() + "\nRegistration: " + getRegistrationNo() + "\n";
    }
}
