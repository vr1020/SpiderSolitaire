import hsa.Console;
import java.awt.*;

class Foundations

{

    static Console c;

    public static void main (String[] args)
    {

	Console c = new Console (25, 150, "Spider Solitare - 1 Suit");
	int x = 200;
	int deckx = 0;
	int decky = 0;

	for (int i = 1 ; i < 7 ; i++)
	{
	    c.drawRect (x, 50, 75, 100);
	    x = x + 100;
	}


	StandardDeckClass deck = new StandardDeckClass ();
	CardClass card = new CardClass ();
	deck.shuffle ();

		card.setFaceUp (false);
		card.draw (c);
		card.delay (10);
	    
// so keep this "card back" as a placeholder, and then when somebody clicks, we can deal face-up cards to the piles. we can keep this up until the
// deck "isEmpty", so we'd have to add that as an exception to the if statement. replace the card back with an empty rectangle.

	/*
	for(inti=1;i < 53 ; i++)
	{

	    if (i < 52)
	    {
		card = deck.deal ();
		card.setFaceUp (false);
		card.draw (c);
		card.delay (10);
		card.erase (c);
	    }

	    else
	    {
		card = deck.deal ();
		card.setFaceUp (false);
		card.draw (c);
		card.delay (10);
	    }
	}
	*/

    }
}





