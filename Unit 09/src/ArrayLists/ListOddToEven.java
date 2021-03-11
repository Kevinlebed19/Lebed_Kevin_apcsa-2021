package ArrayLists;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{

		int firstValue = ray.get(0);
		int distance = 0;
		for(int i = 0; i< ray.size(); i++) {
			if(ray.get(i)%2!=0) {
				for(int j = i; j<ray.size(); j++) {
					if(ray.get(j)%2==0) {
						return j-i;
					}
				}
			}
		}
		return -1;
	}
	
}