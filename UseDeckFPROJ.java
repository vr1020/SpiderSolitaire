import hsa.Console;
import java.awt.*;

class UseDeckFPROJ
{
    public static void main (String[] args)
    {
	Console c = new Console ();
	StandardDeckClass deck = new StandardDeckClass ();
	CardClass card = new CardClass ();
	deck.shuffle ();


	for (int i = 1 ; i < 53 ; i++)
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
    }
}


