/*
 * Mark Hewitt
 * mdh160430
 */
package poker;

/**
 *
 * @author hewit
 */
public class Card {
    private String suit;
    private int num;
    private boolean oneEye;
    
    public Card()
    {
        suit = "";
        num = 0;
        oneEye = false;
    }
    
    public void setSuit(String su)
    {
        suit = su;
    }
    
    public String getSuit()
    {
        return suit;
    }
    
    public void setNum(int nu)
    {
        num = nu;
    }
    
    public int getNum()
    {
        return num;
    }
    
    public void setOneEye(boolean tOrF)
    {
        oneEye = tOrF;
    }
    
    public boolean isOneEye()
    {
        return oneEye;
    }
}
