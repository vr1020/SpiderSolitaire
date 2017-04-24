// The DiamondClass Class
// Second in a series of demonstration programs for introducing Java

import hsa.Console;
import java.awt.*;

class DiamondClass extends SuitClass
{
    // global variables for this class
    // encapsulated data

    // Java doesn't have a delay method

    public void draw (Console c)
    {
	// declare two arrays for X & Y coordinates of Diamond
	int iPointsX[] = new int [4];
	int iPointsY[] = new int [4];

	// calculate points on diamond & store in the arrays
	iPointsX [0] = getCenterX () - getWidth () / 2;
	iPointsY [0] = getCenterY ();
	iPointsX [1] = getCenterX ();
	iPointsY [1] = getCenterY () - getHeight () / 2;
	iPointsX [2] = getCenterX () + getWidth () / 2;
	iPointsY [2] = getCenterY ();
	iPointsX [3] = getCenterX ();
	iPointsY [3] = getCenterY () + getHeight () / 2;

	// draw the diamond using methods available from the Console object (c)
	c.setColor (getColor ());
	if (getIsFilled ())
	{
	    c.fillPolygon (iPointsX, iPointsY, 4);
	}
	else
	{
	    c.drawPolygon (iPointsX, iPointsY, 4);
	}
    }


    public void draw (Graphics g)
    {
	// declare two arrays for X & Y coordinates of Diamond
	int iPointsX[] = new int [4];
	int iPointsY[] = new int [4];

	// calculate points on diamond & store in the arrays
	iPointsX [0] = getCenterX () - getWidth () / 2;
	iPointsY [0] = getCenterY ();
	iPointsX [1] = getCenterX ();
	iPointsY [1] = getCenterY () - getHeight () / 2;
	iPointsX [2] = getCenterX () + getWidth () / 2;
	iPointsY [2] = getCenterY ();
	iPointsX [3] = getCenterX ();
	iPointsY [3] = getCenterY () + getHeight () / 2;

	// draw the diamond using methods available from the Console object (c)
	g.setColor (getColor ());
	if (getIsFilled ())
	{
	    g.fillPolygon (iPointsX, iPointsY, 4);
	}
	else
	{
	    g.drawPolygon (iPointsX, iPointsY, 4);
	}
	g.drawPolygon (iPointsX, iPointsY, 4);
    }


    public void erase (Graphics g)
    {
	Color cOldColor = getColor ();
	g.setColor (Color.white);
	draw (g);
	g.setColor (cOldColor);
    }
}
