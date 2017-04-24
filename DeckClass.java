import hsa.Console;
import java.awt.*;
import java.util.*;

class DeckClass
{
    Vector deck = new Vector (52, 1);
    //CardClass [] card = new CardClass[52];

    public boolean isEmpty ()
    {
	return deck.isEmpty ();
    }


    public void addCard (CardClass card)
    {
	deck.add (card);
    }


    public void addCardToPosition (CardClass card, int pos)
    {
	if (pos < 52 && pos > -1)
	{
	    deck.add (pos, card);
	}
    }


    public void removeCard ()
    {
	if (!isEmpty ())
	{
	    deck.remove (0);
	}
    }


    public void removeCardFromPosition (int pos)
    {
	if (!isEmpty ())
	{
	    deck.remove (pos);
	}
    }


    public CardClass deal ()
    {
	if (!isEmpty ())
	{
	    return (CardClass) (deck.remove (0));
	}
	else
	{
	    return null;
	}
    }


    public CardClass dealFromPosition (int pos)
    {
	if (!isEmpty ())
	{
	    return (CardClass) (deck.remove (pos));
	}
	else
	{
	    return null;
	}
    }


    public void shuffle ()
    {
	for (int i = 0 ; i < deck.capacity () ; i++)
	{
	    deck.add ((int) (Math.random () * 51), deal ());
	}
    }
}
