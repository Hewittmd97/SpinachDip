/*
 * Mark Hewitt
 * mdh160430
 */
package poker;

/**
 *
 * @author hewit
 */
public class Poker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deck deck = new Deck();
        for(int i = 0; i < 52; i++)
        {
            System.out.println(deck.getCard(i).getNum() + " of " + deck.getCard(i).getSuit() + "s");
        }
        deck.shuffle();
        System.out.println("Now shuffle.");
        for(int i = 0; i < 52; i++)
        {
            System.out.println(deck.getCard(i).getNum() + " of " + deck.getCard(i).getSuit() + "s");
        }
    }
    
}
