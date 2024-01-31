package gov.services.project;

import java.util.Random;

public class VoterCard 
{
	private static VoterCard v = null;
	static int voterNumber;
	
	private VoterCard(int voterNumber) {
		
		this.voterNumber = voterNumber;
	}
	
	public static void printVoterId()
	{
		if(v==null)
		{
			Random random = new Random();
			int voterId = random.nextInt(Integer.MAX_VALUE);
			v = new VoterCard(voterId);
			System.out.println("Voter Id successfully applied..");
		}
		else
		{
			System.out.println("Voter card is already created!");
		}
	}
	
	public static void voterDetails()
	{
		System.out.println("Voter Card Number :"+voterNumber);
	}
	
}
