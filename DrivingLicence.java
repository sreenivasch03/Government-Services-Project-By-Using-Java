package gov.services.project;

import java.util.Random;

public class DrivingLicence 
{
	private static DrivingLicence drivingLicence=null;
	
	long licenceNumber;
	static Car car;
	
	public DrivingLicence(long licenceNumber) {
		this.licenceNumber = licenceNumber;
	}
	public DrivingLicence() {
		
	}
	
	public static void drivingLicenceCodition(String color1, String color2, String color3)
	{
		if (color1.equals("Red") && color2.equals("Green") && color3.equals("Yellow"))
		{
			System.out.println("You have passed DrivingLicince Exam ");
			if (drivingLicence==null)
			{
				Random random =new Random();
				drivingLicence =new DrivingLicence(random.nextInt(Integer.MAX_VALUE));
				System.out.println("Successfully Created DrivingLicence ");
			}
			else 
			{
				System.out.println("You have already driving licence!");
			}
		}
		else 
		{
			System.out.println("Try after one month..!");
	    }
	}
	public void drivingLicenceDetails()
	{
		System.out.println("Driving Licence Number is :"+drivingLicence.licenceNumber);
	}
}
