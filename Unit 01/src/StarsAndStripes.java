//© A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;


public class StarsAndStripes{
	
	
   public void StarsAndStripes(){
	   
      out.println("StarsAndStripes");
      printTwoBlankLines();
      printTwentyStars();
      printTwentyStars();
      printTwentyDashes();
      printTwentyDashes();
      printASmallBox();
      printTwoBlankLines();
      printABigBox();
   }

   public void printTwentyStars(){
	   out.println("********************");
	   
   }

   public void printTwentyDashes(){
	   out.println("--------------------");
   }

   public void printTwoBlankLines(){
	   out.println("\n\n");
   }
   
   public void printASmallBox(){
	   out.println("---------------");
	   out.println("-             -");
	   out.println("-             -");
	   out.println("---------------");
   }
 
   public void printABigBox(){
	   out.println("------------------------------");
	   out.println("-                            -");
	   out.println("-                            -");
	   out.println("------------------------------");
   }   
}