package gov.services.project;

import java.util.Random;

public class AdhaarCard 
{
	private static AdhaarCard a = null;

	static int adhaarNumber;
	private AdhaarCard(int adhaarNumber) 
	{
		this.adhaarNumber = adhaarNumber;
	}
	
	public static void printAdhaarCard()
	{
		if(a==null)
		{
			Random random = new Random();
			int aadharNumber = random.nextInt(Integer.MAX_VALUE);
			a = new AdhaarCard(aadharNumber);
			System.out.println("Adhaar card successfully applied..");
		}
		else
		{
			System.out.println("You have already Adhaar card!");
		}
	}
	
	public static void adhaarDetails()
	{
		System.out.println("Adhaar Number :"+adhaarNumber);
	}
}
