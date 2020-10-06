package Lab5.exercise4;

public class BankAccount {
    private String owner;
    private int number;
    private double interestRate;

    public String getOwner(){
        return owner;
    }
    public int getNumber(){
        return number;
    }
    public double getInterestRate(){
        return interestRate;
    }

    public void setOwner(String owner){
        this.owner=owner;
    }
    public void setNumber(int number){
        this.number=number;
    }
    public void setInterestRate(double interestRate){
        this.interestRate=interestRate;
    }

    public BankAccount(String owner, int number, double interestRate){
        setOwner(owner);
        setNumber(number);
        setInterestRate(interestRate);
    }

    public BankAccount(){
        this("Owner not available", 0, 0);

    }

    public String toString(){
        return("Owner: " + getOwner() + " Number: " + getOwner() +
                " Interest Rate: ");
    }



}
