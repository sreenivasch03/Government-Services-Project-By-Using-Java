package gov.services.project;

import java.util.Random;
import java.util.Scanner;

public class GovernmentServices
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean status = true;
		while(status)
		{
			System.out.println("------------------------------");
			System.out.println(" *GOVERNMENT SERVICE PORTAL*");
			System.out.println("------------------------------");
			System.out.println(" 1.Apply for Adhaar Card \n 2.Apply for Voter Card \n 3.Apply for Pan card \n 4.Apply for Driving License \n 5.Exit");
			System.out.println("=> Please select your option :");
			int option = sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("Enter your name :");
				String name=sc.next();
				System.out.println("Enter FatherName : ");
				String fatherName = sc.next();
				System.out.println("Enter your Date of birth :");
				String dateOfBirth = sc.next();
				System.out.println("Enter your age: ");
				int age=sc.nextInt();
				System.out.println("Enter your gender : ");
				String gender=sc.next();
				System.out.println("Enter your mobile number : ");
				long mobileNo=sc.nextLong();
				System.out.println("Enter your address : ");
				String address=sc.next();
				Customer c =new Customer(name,fatherName,dateOfBirth,age,gender,mobileNo,address);
				AdhaarCard.printAdhaarCard();
				System.out.println("Enter your option : \n1.Dislay Adhaar Details \n2.Continue");
				int ch=sc.nextInt();
				if (ch==1)
				{
					AdhaarCard.adhaarDetails();
					c.customerDetails();
				}
				else
				{
					System.out.println("Thank you..Have nice day :)");
				}
		    break;
			case 2:
				System.out.println("Enter your name :");
				String name1=sc.next();
				System.out.println("Enter FatherName : ");
				String fatherName1=sc.next();
				System.out.println("Enter your Date of birth :");
				String dateOfBirth1 = sc.next();
				System.out.println("Enter your age: ");
				int age1=sc.nextInt();
				System.out.println("Enter your gender : ");
				String gender1=sc.next();
				System.out.println("Enter your mobile number : ");
				long mobileNo1=sc.nextLong();
				System.out.println("Enter your address : ");
				String address1=sc.next();
				Customer c1 =new Customer(name1,fatherName1,dateOfBirth1,age1,gender1,mobileNo1,address1);
				if(c1.getAge()>=18)
				{
					VoterCard.printVoterId();
					System.out.println("Enter you choice : \n 1.Displey voter details \n 2.Continue");
					int choice = sc.nextInt();
					if(choice==1)
					{
						c1.customerDetails();
						VoterCard.voterDetails();
					}
					else
					{
						System.out.println("Thank you..Have nice day :)");
					}
				}
				else
				{
					System.out.println("You are not eligible for voter card!");
				}
			break;
			case 3:
				System.out.println("Enter your name :");
				String name2=sc.next();
				System.out.println("Enter FatherName : ");
				String fatherName2=sc.next();
				System.out.println("Enter your Date of birth :");
				String dateOfBirth2 = sc.next();
				System.out.println("Enter your age: ");
				int age2=sc.nextInt();
				System.out.println("Enter your gender : ");
				String gender2=sc.next();
				System.out.println("Enter your mobile number : ");
				long mobileNo2=sc.nextLong();
				System.out.println("Enter your address : ");
				String address2=sc.next();
				Customer c2 =new Customer(name2,fatherName2,dateOfBirth2,age2,gender2,mobileNo2,address2);
				PanCard.printPancard();
				System.out.println("Enter your choice : \n 1.Display Pan Card Details \n 2.Continue");
				int choice = sc.nextInt();
				if(choice==1)
				{
					c2.customerDetails();
					PanCard.panDetails();
				}
				else
				{
					System.out.println("Thank..Have nice day :)");
				}
			break;
			case 4:
				System.out.println("Enter your name :");
				String name3=sc.next();
				System.out.println("Enter FatherName : ");
				String fatherName3=sc.next();
				System.out.println("Enter your Date of birth :");
				String dateOfBirth3 = sc.next();
				System.out.println("Enter your age: ");
				int age3=sc.nextInt();
				System.out.println("Enter your gender : ");
				String gender3=sc.next();
				System.out.println("Enter your mobile number : ");
				long mobileNo3=sc.nextLong();
				System.out.println("Enter your address : ");
				String address3=sc.next();
				Customer c3 =new Customer(name3,fatherName3,dateOfBirth3,age3,gender3,mobileNo3,address3);
				System.out.println("Enter the Vehicle number ");
				String vehicleNumber=sc.next();
				System.out.println("Enter the Color of the Vehicle :");
				String color=sc.next();
				System.out.println("Enter Number of Wheels ");
				int numberOfWheels=sc.nextInt();
				Random random=new Random();
				int chasiNumber=random.nextInt();
				Car car= new Car(vehicleNumber,color, chasiNumber,numberOfWheels); 
				if (car!=null)
				{
					System.out.println("Which Color is to Stop the Vehicle");
					String color1=sc.next();
					System.out.println("Which color is Go the vehicle ");
					String color2=sc.next();
					System.out.println("Which color is to Indicate the vehicle to ready State");
					String color3=sc.next();
					DrivingLicence.drivingLicenceCodition(color1, color2, color3);
					System.out.println("Select your option : \n1.Dislay Licence Details \n2.Continue");
					int choice1=sc.nextInt();
					if (choice1==1) {
						DrivingLicence d1=new DrivingLicence();
						d1.drivingLicenceDetails();
						System.out.println();
						car.carInfo();
						System.out.println();
						c3.customerDetails();	
					}
					else
					{
						continue;
					}
				}
				else
				{
					System.out.println("There is no vehicle found!");
				}
			break;
			case 5:
				System.out.println("Thank you for visiting.. :)");
				status = false;
			break;
			default:
				System.out.println("Please select corrcet input..!");
			}
		}
	}
}
