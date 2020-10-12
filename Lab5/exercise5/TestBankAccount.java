package Lab5.exercise5;

import javax.swing.*;

public class TestBankAccount {

    public static void main(String[] args) {

        String output = "";

        BankAccount ba1 = new BankAccount();

        output+="Calling the no argument constructor. Details: " +
                "\n\n" + ba1.toString();

        BankAccount ba2 = new BankAccount("Jack Bolster",2342343,0.75);

        output+="\n\nCalling the multi-argument constructor. Details: " +
                "\n\n" + ba2.toString();

        ba1.setInterestRate(0.5);
        output+="\n\nDetails changed\n\nFirst Account details: "+
                ba1.toString() + "\n\nSecond Account Details: " +
        ba2.toString();

        JOptionPane.showMessageDialog(null,output,"Data", JOptionPane.INFORMATION_MESSAGE);


    }

}
