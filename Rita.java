package salesperson10;
class Rita
{
	public static void main(String args[])
	{
		int totalMilesToDrive=2052;
		int totalDays=6;
		int townToStopPerDay=2;
		double kmPerMile=1.60934;
		double avgKm=(totalMilesToDrive*kmPerMile)/(totalDays*townToStopPerDay);
		System.out.println("She drive average of "+avgKm+"km between every stop");
		
		
	}
}