package Lab5.exercise3;

import javax.swing.*;

public class TestThermometer {

    public static void main(String[] args) {
        String output="*******Thermometer Testing*******\n\n";

        Thermometer t1 = new Thermometer(35,35,35);

        output+= "Calling the single argument constructor.. setting temperature of the first thermometer to 35C\n" +
                t1.toString();


        Thermometer t2 = new Thermometer();

        output+= "\n\nCalling the no argument constructor... \n" +
                t2.toString();

        Thermometer t3 = new Thermometer();
        t3.setCurrTemp(Integer.parseInt(JOptionPane.showInputDialog("Please enter the current temperature")));





        JOptionPane.showMessageDialog(null,output,"Thermometer Testing", JOptionPane.INFORMATION_MESSAGE);

    }


}
