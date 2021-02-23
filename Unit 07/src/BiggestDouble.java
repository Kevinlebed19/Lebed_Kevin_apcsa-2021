//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one=a;
		two=b;
		three=c;
		four=c;
	}

	public double getBiggest()
	{
		double biggest = one;
		if(one>two&&one>three&&one>four) {
			biggest = one;
		}
		else if(two>one&&two>three&&two>four) {
			biggest = two;
		}
		else if(three>one&&three>two&&three>four) {
			biggest = three;
		}
		else if(four>one&&four>two&&four>three) {
			biggest = four;
		}
		
		return biggest;
	}

	public String toString()
	{
	   return "biggest = "+getBiggest();
	}
}