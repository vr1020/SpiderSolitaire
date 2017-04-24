import hsa.Console;
import java.awt.*;

class UseCardFPROJ
{
    static Console c;
    public static void main (String[] args)
    {
	c = new Console ();
	CardClass[] card = new CardClass [10];
	for (int i = 0 ; i < 10 ; i++)
	{
	    card [i] = new CardClass ();
	    card [i].setValue ((int) (Math.random () * 13) + 1);
	    card [i].setCardSize (50);
	    card [i].setSuit (4);
	    card [i].setCenter ((int) (Math.random () * 400), (int) (Math.random () * 400));
	    card [i].draw (c);
	}

    }
}
