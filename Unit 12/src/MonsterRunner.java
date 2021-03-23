//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter 1st monster's name");
		String name1 = keyboard.next();
		System.out.println("Enter 2st monster's name");
		String name2 = keyboard.next();
		System.out.println("Enter 1st monster's size");
		int size1 = keyboard.nextInt();
		System.out.println("Enter 2st monster's size");
		int size2 = keyboard.nextInt();
		
		Skeleton skeleton = new Skeleton(name1,size1);
		Zombie zombie = new Zombie(name2,size2);
		System.out.println(skeleton.isBigger(zombie));
		System.out.println(skeleton.isSmaller(zombie));
		System.out.println(skeleton.namesTheSame(zombie));
	}
}
