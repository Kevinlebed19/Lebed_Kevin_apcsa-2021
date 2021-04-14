//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {

    	List<Integer> rowTotals = new ArrayList<Integer>();
    	for(int[] row : m) {
    		int count = 0;
    		for(int num : row) {
    			count+=num;
    		}
    		rowTotals.add(count);
    	}
    		
 
    	return rowTotals;
    }
}
