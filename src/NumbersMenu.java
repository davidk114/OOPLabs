import javax.swing.JOptionPane;

public class NumbersMenu {

    public static void main(String[] args) {
        int counter=1, number;
        String numberAsString, choice;



        do{

            numberAsString = JOptionPane.showInputDialog("---Iteration " + counter + "---" +
                    "\n\nPlease enter any whole number:");


            choice = JOptionPane.showInputDialog(null,"What would you like to do?\n\n1. Determine if number is odd or even" +
                    "\n2. Find the factorial of the number\n3. Quit the program");
            number = Integer.parseInt(numberAsString);

            switch(choice) {

                case "1":
                    if(number % 2 == 0)
                        JOptionPane.showMessageDialog(null,"The number you entered is even", "Number Data", JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null,"The number you entered is odd", "Number Data", JOptionPane.INFORMATION_MESSAGE);
                    break;


                case "2":
                    int total = 1, num;

                    if(number>0) {
                        for (int i = 0; i < numberAsString.length(); i++){


                            num = Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
                            total = num * total;



                        }

                        JOptionPane.showMessageDialog(null,"Factorial of this is " + total,"Factorial", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null,"Negative Numbers dont have  factorial", "Invalid", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;

                case "3":

                    break;

            }

            counter++;

        }while(counter >= 10);

    }

}
