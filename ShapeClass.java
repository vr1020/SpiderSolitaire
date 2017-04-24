import hsa.Console;
import java.awt.*;

abstract class ShapeClass
{
    private int iWidth = 80;
    private int iHeight = 100;
    private int iCentreX = 100;
    private int iCentreY = 100;
    private Color cColor = Color.red;
    private boolean filled = true;
    public void delay (int iDelayTime)
    {
	long lFinalTime = System.currentTimeMillis () + iDelayTime;
	do
	{
	}
	while (lFinalTime > System.currentTimeMillis ());
    }


    // communicator methods
    public void setWidth (int iNewWidth)
    {
	iWidth = iNewWidth;
    }


    public void setHeight (int iNewHeight)
    {
	iHeight = iNewHeight;
    }


    public void setCenter (int iNewCentreX, int iNewCentreY)
    {
	iCentreX = iNewCentreX;
	iCentreY = iNewCentreY;
    }


    public void setColor (Color cNewColor)
    {

	cColor = cNewColor;
    }


    public int getWidth ()
    {
	return iWidth;
    }


    public int getHeight ()
    {
	return iHeight;
    }


    public int getCenterX ()
    {
	return iCentreX;
    }


    public int getCenterY ()
    {
	return iCentreY;
    }


    public Color getColor ()
    {
	return cColor;
    }


    public void setIsFilled (boolean newfilled)
    {
	filled = newfilled;
    }


    public boolean getIsFilled ()
    {
	return filled;
    }


    public abstract void draw (Console c);
    public void erase (Console c)
    {
	Color cOldColor = getColor ();
	c.setColor (Color.white);
	draw (c);
	c.setColor (cOldColor);
    }


   /* public abstract void draw (Graphics g);
    public void erase (Graphics g)
    {
	Color cOldColor = getColor ();
	g.setColor (Color.white);
	draw (g);
	g.setColor (cOldColor);
    }
    */
}
