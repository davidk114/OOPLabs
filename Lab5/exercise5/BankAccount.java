package Lab5.exercise5;

public class BankAccount {
    private String owner;
    private int number;
    private static double interestRate;
    private static int count;

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
        incrementCount();
        setNumber(count);
        setInterestRate(interestRate);
    }

    private static void incrementCount(){
        count++;
    }

    public BankAccount(){
        this("Owner not available", 0, 0);

    }

    public String toString(){
        return("\n\nOwner: " + getOwner() + " Number: " + getNumber() +
                " Interest Rate: " + getInterestRate());
    }



}
