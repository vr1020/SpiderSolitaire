import hsa.Console;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;

class CardClass extends ShapeClass
{
    private int currentValue = 1;
    private int currentSuit = 1; //1 - diamond; 2 - club; 3 - heart; 4 - spade;
    private boolean faceUp = true;
    public void setSuit (int suit)
    {
	currentSuit = suit;
    }


    public int getSuit ()
    {
	return currentSuit;
    }


    public void setValue (int value)
    {
	currentValue = (value);
    }


    public int getValue ()
    {
	return currentValue;
    }


    public void setFaceUp (boolean faceup)
    {
	faceUp = faceup;
    }


    public boolean isFaceUp ()
    {
	return faceUp;
    }


    public void setCardSize (int size)
    {
	setHeight (size);
	setWidth (size * 7 / 10);
    }


    public void draw (Console c)
    {
	String[] value = new String [14];
	for (int i = 2 ; i < 11 ; i++)
	{
	    value [i] = Integer.toString (i);
	}
	value [1] = "A";
	value [11] = "J";
	value [12] = "Q";
	value [13] = "K";

	DiamondClass diamond = new DiamondClass ();
	ClubClass club = new ClubClass ();
	HeartClass heart = new HeartClass ();
	SpadeClass spade = new SpadeClass ();

	if (!isFaceUp ())
	{

	    BufferedImage img = null;
	    try
	    {
		img = ImageIO.read (new File ("C:\\cardimg2.jpg"));
	    }
	    catch (IOException e)
	    {
		System.out.println ("error");
		e.printStackTrace ();
	    }

	   Image scaledimg = img.getScaledInstance (getWidth (), getHeight (), Image.SCALE_SMOOTH);
	    c.drawImage (scaledimg, getCenterX () - getWidth () / 2, getCenterY () - getHeight () / 2, null);
	    
	    //  c.fillRect (getCenterX () - getWidth () / 2, getCenterY () - getHeight () / 2, getWidth (), getHeight ());

	}
	else
	{
	    c.drawRect (getCenterX () - getWidth () / 2, getCenterY () - getHeight () / 2, getWidth (), getHeight ());
	    switch (currentSuit)
	    {
		case 1:
		    diamond.setHeight (getHeight () / 4);
		    diamond.setCenter (getCenterX (), getCenterY ());
		    diamond.setColor (Color.red);
		    diamond.draw (c);
		    break;
		case 2:
		    club.setHeight (getHeight () / 4);
		    club.setWidth (getHeight () / 5);
		    club.setCenter (getCenterX (), getCenterY ());
		    club.setColor (Color.black);
		    club.draw (c);
		    break;
		case 3:
		    heart.setHeight (getHeight () / 4);
		    heart.setWidth (getHeight () / 5);
		    heart.setCenter (getCenterX (), getCenterY ());
		    heart.setColor (Color.red);
		    heart.draw (c);
		    break;
		case 4:
		    spade.setHeight (getHeight () / 4);
		    spade.setWidth (getHeight () / 5);
		    spade.setCenter (getCenterX (), getCenterY ());
		    spade.setColor (Color.black);
		    spade.draw (c);
		    break;
	    }
	    Font font = new Font ("SanSerif", Font.PLAIN, 12);
	    c.setColor (Color.black);
	    c.setFont (font);
	    c.drawString (value [currentValue], getCenterX () + 3 - getWidth () / 2, getCenterY () + 12 - getHeight () / 2);
	}
    }


    public void erase (Console c)
    {
	Color cOldColor = getColor ();
	c.setColor (Color.white);
	c.fillRect (getCenterX () - getWidth () / 2, getCenterY () - getHeight () / 2, getWidth () + 1, getHeight () + 1);
	c.setColor (cOldColor);
    }
}
