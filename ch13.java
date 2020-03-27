package chMoney13;

import java.util.Scanner;

public class ch13

{
	public static void main(String args[])
	{
	
	int karaGlassCount;
	int raniGlassCount;
	
	int karaGlassRate=5;
	int raniGlassRate=7;
	
	Scanner in=new Scanner(System.in);
	
	System.out.println(" Enter kara's glass count : ");
    karaGlassCount=in.nextInt();
    System.out.println(" Enter rani's glass count : ");
    raniGlassCount=in.nextInt();
    
    int karaTotalMoney=karaGlassCount*karaGlassRate;
    int raniTotalMoney=raniGlassCount*raniGlassRate;
    
    if(karaTotalMoney>raniTotalMoney)
    {
    	System.out.println(" Kara : "+karaTotalMoney+" cents ");
    }
    else if (raniTotalMoney>karaTotalMoney)
    {
    	System.out.println(" Rani : "+raniTotalMoney+" cents ");
    }
    else if (karaTotalMoney==raniTotalMoney)
    {
    	System.out.println(" Kara and Rani both cents equal money");
    }
	
  }
	
}


