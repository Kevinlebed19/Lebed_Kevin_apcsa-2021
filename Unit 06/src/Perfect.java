//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;
   
   public Perfect() {
	   
	   number = 0;
   }
   
public Perfect(int num) {
	   setnum(num);
	   
   }

	public void setnum(int num) {
	number=num;
	
}


	public boolean isPerfect()
	{
		
	    int sum = 1; 
	  
	  
	    for (int i = 2; i * i <= number; i++) 
	    { 
	        if (number % i==0) 
	        { 
	            if(i * i != number) 
	                sum = sum + i + number / i; 
	            else
	                sum = sum + i; 
	        } 
	    }  
	   
	    if (sum == number && number != 1) 
	        return true; 
	  
	    return false; 
	}

	public String toString() {
		
		if(isPerfect()) {
			return number+" is perfect";
		}else {
			return number+" is not perfect";
		}
		
	}	
	
}