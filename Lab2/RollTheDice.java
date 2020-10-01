package Lab2;

import javax.swing.JOptionPane;

public class RollTheDice {

    public static void main(String[] args) {

        int gamesPlayed=0,computerWin=0, playerWin=0, draws=0;
        double die1, die2, sum1, die3, die4, sum2;
        String menu = "yes";
        menu = JOptionPane.showInputDialog("Would you like to play a gane of dice(yes or no)");

        while(!menu.equals("no")){

        die1 = 1 + (Math.random() * 6);
        die2 = 1 + (Math.random() * 6);
        sum1 = die1 + die2;

        JOptionPane.showMessageDialog(null,"The computer roll generate value " + String.format("%.0f", sum1));

        die3 = 1 + (Math.random() * 6);
        die4 = 1 + (Math.random() * 6);
        sum2 = die3+die4;

        JOptionPane.showMessageDialog(null,"The player roll generate value " + String.format("%.0f", sum2));


            if(sum1 > sum2){
            computerWin++;
        }else if(sum2 > sum1){
            playerWin++;
        }else{
            draws++;
        }

        gamesPlayed++;

        JOptionPane.showMessageDialog(null,"Games played: " + gamesPlayed + "\nComputer wins: " + computerWin +
                "\nPlayer Wins: " + playerWin + "\nDraws: " + draws, "Game Info", JOptionPane.INFORMATION_MESSAGE);



            menu = JOptionPane.showInputDialog("Would you like to play another gane of dice(yes or no)");


        }

        JOptionPane.showMessageDialog(null,"Thanks for playing the game!", "Farewell", JOptionPane.INFORMATION_MESSAGE);



    }

}
