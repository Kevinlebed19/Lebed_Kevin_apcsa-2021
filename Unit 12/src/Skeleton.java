//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Skeleton implements Monster
{
	private String name;
	private int size;
	
	public Skeleton(String n,int s) {
		name = n;
		size = s;
	}
	
	public int getHowBig() {
		return size;
	}

	public String getName() {
		return name;
	}
	
	public boolean isBigger(Monster other) {
		if(other.getHowBig()>size)return true;
		return false;
	}
	
	public boolean isSmaller(Monster other) {
		if(other.getHowBig()<size)return true;
		return false;
	}
	
	public boolean namesTheSame(Monster other) {
		if(other.getName().equals(name))return true;
		return false;
	}

	public String toString() {
		return name+" "+size;
	}
}