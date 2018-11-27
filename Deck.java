/*
 * Mark Hewitt
 * mdh160430
 */
package poker;

/**
 *
 * @author hewit
 */
public class Deck {
    private Card cards[] = new Card[52];
    
    public Deck()
    {
        for(int i = 0; i < 52; i++)
        {
            cards[i] = new Card();
        }
        int cardCount = 0;
        for(int i = 0; i < 5; i++)
        {
            for(int j = 2; j <= 14; j++)
            {
                switch(i)
                {
                    case 0:
                        cards[cardCount].setSuit("Club");
                        cards[cardCount].setNum(j);
                        break;
                    case 1:
                        cards[cardCount].setSuit("Diamond");
                        cards[cardCount].setNum(j);
                        if(j == 14)
                        {
                            cards[cardCount].setOneEye(true);
                        }
                        break;
                    case 2:
                        cards[cardCount].setSuit("Heart");
                        cards[cardCount].setNum(j);
                        if(j == 11)
                        {
                            cards[cardCount].setOneEye(true);
                        }
                        break;
                    case 3:
                        cards[cardCount].setSuit("Spade");
                        cards[cardCount].setNum(j);
                        if(j == 11)
                        {
                            cards[cardCount].setOneEye(true);
                        }
                        break;
                }
                cardCount++;
            }
        }
    }
    
    public void shuffle()
    {
        Card[] shuffledDeck = new Card[52];
        boolean[] visited = new boolean[52];
        
        for(int i = 0; i < 52; i++)
        {
            visited[i] = false;
        }
        
        int randomCard;
        for(int i = 0; i < 52; i++)
        {
            randomCard = (int) (Math.random() * 52);
            while(visited[randomCard] == true)
            {
                randomCard = (int) (Math.random() * 52);
            }
            visited[i] = true;
            shuffledDeck[i] = cards[randomCard];
        }
        cards = shuffledDeck;
    }
    
    public Card getCard(int i)
    {
        return cards[i];
    }
}
