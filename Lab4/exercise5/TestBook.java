package Lab4.exercise5;

import javax.swing.*;

public class TestBook {

    public static void main(String[] args) {

        String output="";

        Book b1 = new Book();
        b1.setTitle(JOptionPane.showInputDialog("What is the title?"));
        b1.setPrice(Double.parseDouble(JOptionPane.showInputDialog("Please enter the price")));
        b1.setISBN(JOptionPane.showInputDialog("Please enter the ISBN"));
        b1.setPages(Integer.parseInt(JOptionPane.showInputDialog("Please enter amount of pages")));


        output+= "Calling the no argument Book constructor. The first book object details are " +
                "\n\n" + b1.toString();

        Book b2 = new Book();
        b2.setTitle(JOptionPane.showInputDialog("What is the title?"));
        b2.setPrice(Double.parseDouble(JOptionPane.showInputDialog("Please enter the price")));
        b2.setISBN(JOptionPane.showInputDialog("Please enter the ISBN"));
        b2.setPages(Integer.parseInt(JOptionPane.showInputDialog("Please enter amount of pages")));

        output+= "\n\nBook 2: " + b2.toString();


        JOptionPane.showMessageDialog(null, output, "Book Object Data", JOptionPane.INFORMATION_MESSAGE);



    }


}
