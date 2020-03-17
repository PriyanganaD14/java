package ch11;

class Movie
{
	static int mov1=100;
	static int mov2=110;
	static int mov=mov1+mov2;
	 static double movhr=mov/60;
	
	public static void main(String args[])
	{
		System.out.println("Dan took "+movhr+" hour to watch movies");
	}
}