//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double top =(y2-y1);
		double bottom =(x2-x1);
		return top/bottom;
	}

}