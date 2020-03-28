package lucile15;

public class LucileCh15
 {
	public static void main(String args[])
	{
		double DVDPrice=42.0;
		double rateOfPerOnDVD=12.0;
		double Earn,savings;
		
        Earn=(DVDPrice*100)/rateOfPerOnDVD;
        
        System.out.println(" Lucile Earn : "+Earn+" $ ");
        
        savings=Earn-DVDPrice;
        
        System.out.println(" Lucile deposit into her Savings Account : "+savings+" $ ");
	}
 }

	
