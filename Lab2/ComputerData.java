package Lab2;

import javax.swing.JOptionPane;

public class ComputerData {

    public static void main(String[] args) {

        String serialNo, processor ;
        double hdSpace, price;

        serialNo = JOptionPane.showInputDialog("Please enter the serial number");
        if(serialNo.equals("cr") && serialNo.equals("CR"))
            System.exit(0);
else {


    try {
        hdSpace = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the hard disk"));
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Invalid");
        }

    processor = JOptionPane.showInputDialog("Please enter the processor type");
    price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price"));

}


    }

}
