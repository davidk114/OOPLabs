package Lab1;

import javax.swing.JOptionPane;

public class Exercise3 {
    public static void main(String[] args) {
        String name, course, snacksAsString;
        int snacks, price;

        name = JOptionPane.showInputDialog("Please enter your name:");
        course = JOptionPane.showInputDialog("Please enter your course:");
        snacksAsString = JOptionPane.showInputDialog("How many snacks would you like?");
        snacks = Integer.parseInt(snacksAsString);

        price = snacks * 2;

        String result = "Name: " + name + "\nCourse: " + course + "\nSnacks: " + snacks + "\nPrice: " + price;

        JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.PLAIN_MESSAGE);



    }

}
