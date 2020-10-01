package Lab1;

import javax.swing.JOptionPane;

public class Exercise4 {

    public static void main(String[] args) {

        String name, numberAsString;
        int number;
        double amountDue;

        name = JOptionPane.showInputDialog("Please enter your name");
        numberAsString = JOptionPane.showInputDialog("Please enter the number of km cycled");
        number = Integer.parseInt(numberAsString);

        if(number < 10) {
            amountDue = number * 1.75;
        }else{
            amountDue = ((number - 10) * 2.50) + 17.5;
        }

        JOptionPane.showMessageDialog(null,
                "Name: " + name + "\nDistance: " + number +
                "\nSponsorship amount due: " + amountDue, "Receipt", JOptionPane.INFORMATION_MESSAGE);



    }

}
