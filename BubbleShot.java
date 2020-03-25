package bubbleshotCh5;

public class BubbleShot
{
	void Bubbleshot(int arr[])
	{
		int n=arr.length;
		
		
		for(int i=0;i<n-1;i++)
			
			for(int j=0;j<n-1-i;j++)
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
	}
	
	
	void PrintArray(int arr[])
	{
		int n=arr.length;
		
		for(int i=0;i<n;++i)
		
			System.out.println(arr[i]+ " ");
			System.out.println();
	}
	
	
	public static void main(String args[])
	{
		BubbleShot bs=new BubbleShot();
		int arr[]= {66,57,54,53,64,52,59};
		bs.Bubbleshot(arr);
		System.out.println(" Shoted Array ");
		bs.PrintArray(arr);
	}
}
