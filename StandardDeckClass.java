import hsa.Console;
import java.awt.*;

class StandardDeckClass extends DeckClass
{
    public StandardDeckClass ()
    {
	for (int i = 0 ; i < 4 ; i++)
	{
	    for (int j = 0 ; j < 13 ; j++)
	    {
		CardClass card = new CardClass ();
		card.setValue (j + 1);
		card.setSuit (4);
		card.setColor (Color.black);
		addCard (card);
	    }
	}
    }
}
