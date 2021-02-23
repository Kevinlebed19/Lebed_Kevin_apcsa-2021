//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
setNum(num);

	}

	public void setNum(int num)
	{
number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int gcd = 0;
		
		for(int i = 1; i <= a && i <= b && i <= c; i++)
        {
            if(a%i==0 && b%i==0 && c%i==0 )
                gcd = i;
        }


		return gcd;
	}

	public String toString()
	{
		String output="";

		int a, b, c = 0; 
		  
       
        int m = 2; 
  
        
        while (c < number) { 
  
          
            for (int n = 1; n < m; ++n) { 
               
                a = m * m - n * n; 
                b = 2 * m * n; 
                c = m * m + n * n; 
  
                if (c > number) 
                    break; 
  
                System.out.println(a + " " + b + " " + c); 
            } 
            m++; 
        } 



		return output+"\n";
	}
}