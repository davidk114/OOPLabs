package Lab6.exercise1;

import javax.swing.*;

public class TestPerson {

    public static void main(String[] args) {
        String output="";

        Person p1 = new Person();

        output+="Calling the no argument constructor: " + p1.toString();

        Person p2 = new Person("Jack","Bolster");

        output+= "\n\nCalling the multi argument constructor: " +
                p2.toString();

        JOptionPane.showMessageDialog(null,output,"Data",JOptionPane.INFORMATION_MESSAGE);
    }

}
