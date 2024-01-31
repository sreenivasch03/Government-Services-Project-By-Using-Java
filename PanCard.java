package gov.services.project;

import java.util.Random;

public class PanCard 
{
	private static PanCard p =null;
	static int panNumber;
	
	private PanCard(int panNumber) {
		
		this.panNumber = panNumber;
	}
	
	public static void printPancard()
	{
		if(p==null)
		{
			Random random = new Random();
			int panNum = random.nextInt(Integer.MAX_VALUE);
			p = new PanCard(panNum);
			System.out.println("Pan Card successfully applied..");
		}
		else
		{
			System.out.println("Pan card is already created!");
		}
	}
	public static void panDetails()
	{
		System.out.println("Pan Number :"+panNumber);
	}
}
