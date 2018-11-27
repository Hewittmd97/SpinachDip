/*
 * Mark Hewitt
 * mdh160430
 */
package poker;

import javax.swing.JOptionPane;

/**
 *
 * @author hewit
 */
public class Poker {

    public int chicago()
    {
        String[] options = {"High", "Low", "None"};
        return JOptionPane.showOptionDialog(null, "Would you like high Chicago, low Chicago, or no Chicago?", "Choose", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
    }
    
    public int tH()
    {
        String[] options = {"Yes", "No"};
        return JOptionPane.showOptionDialog(null, "Do you want to play Texas Hold'em?", "Choose", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
    }
    public int studOrDraw()
    {
        String[] options = {"Stud", "Draw"};
        return JOptionPane.showOptionDialog(null, "Would you like to play stud or draw?", "Choose", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
    }
    
    public static void main(String[] args) {
        Deck deck = new Deck();
        Poker main = new Poker();
        main.tH();
        main.chicago();
        main.studOrDraw();
//        for(int i = 0; i < 52; i++)
//        {
//            System.out.println(deck.getCard(i).getNum() + " of " + deck.getCard(i).getSuit() + "s");
//        }
//        deck.shuffle();
//        System.out.println("Now shuffle.");
//        for(int i = 0; i < 52; i++)
//        {
//            System.out.println(deck.getCard(i).getNum() + " of " + deck.getCard(i).getSuit() + "s");
//        }
        
    }
    
}
