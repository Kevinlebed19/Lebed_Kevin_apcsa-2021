//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		if(spot<pups.length) {
			Dog dog = new Dog(age, name);
			pups[spot] = dog;
		}		
	}

	public String getNameOfOldest()
	{
		String name = "";
		for(int i = 0; i<pups.length-1; i++) {
			
			if(pups[i].getAge()>pups[i+1].getAge()) {
				 name = pups[i].getName();
			}else{
				 name = pups[i+1].getName();
			}
		}
		
		return name;
	}

	public String getNameOfYoungest()
	{
		String name = "";
		for(int i = 0; i<pups.length-1; i++) {
			
			if(pups[i].getAge()>pups[i+1].getAge()) {
				 name = pups[i+1].getName();
			}else{
				 name = pups[i].getName();
			}
		}
		
		return name;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}