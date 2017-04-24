import hsa.Console;
import java.awt.*;

abstract class SuitClass extends ShapeClass
{
    public abstract void draw (Console c);
    // public abstract void erase (Console c);
    public void setHeight (int Height)
    {
	super.setHeight (Height);
	super.setWidth (Height * 4 / 5);
    }


    public void setWidth (int Width)
    {
	super.setHeight (Width * 5 / 4);
	super.setWidth (Width);
    }
}
