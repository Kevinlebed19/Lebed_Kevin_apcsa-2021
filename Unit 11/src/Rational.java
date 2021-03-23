//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	private int numerator;
	private int denominator;

	public Rational(){
		setRational(0,0);
	}
	
	public Rational(int num, int den){
		setRational(num,den);
	}
	
	public void setRational(int num, int den) {
		numerator = num;
		denominator = den;
	}
	
	
	
	public void add(Rational  other)
	{
		//numerator = (num1 * den2 + num2 * den1)
	//	denominator = (den1 * den2)
		
		


		reduce();
	}

	private void reduce()
	{
		int gcd = gcd(numerator, denominator);
	    numerator =  numerator / gcd ;
	    denominator = denominator/ gcd;


	}

	private int gcd(int numOne, int numTwo)
	{


		return numTwo == 0 ? numOne : gcd(numTwo, numOne % numTwo);
	}

	public Object clone ()
	{
		Rational rational = new Rational();
		return rational;
	}


	public int getNumerator()
	{
		return numerator;
	}
	
	public int getDenominator()
	{
		return denominator;
	}
	
	
	public boolean equals( Object obj)
	{


		return false;
	}

	public int compareTo(Rational other)
	{


		return -1;
	}



	
	//write  toString() method
	
	
}