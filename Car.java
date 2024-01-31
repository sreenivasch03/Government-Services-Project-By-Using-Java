package gov.services.project;

import java.util.Random;

public class Car
{
	private String vehicleNumber;
	private String color;
	private int chasiNumber;
	private int numberOfWheels;
	
	public Car(String vehicleNumber, String color, int chasiNumber, int numberOfWheels) 
	{
		this.vehicleNumber = vehicleNumber;
		this.color = color;
		this.chasiNumber = chasiNumber;
		this.numberOfWheels = numberOfWheels;
	}
	
	public Car() 
	{
		super();
	}
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getChasiNumber() {
		return chasiNumber;
	}

	public void setChasiNumber(int chasiNumber) {
		this.chasiNumber = chasiNumber;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public void carInfo()
	{
		System.out.println("Vehicle Number : "+getVehicleNumber());
		System.out.println("Vehicle Color :"+getColor());
		System.out.println("Vehicle ChasiNumber : "+getChasiNumber());
		System.out.println("Number of Wheels :"+getNumberOfWheels());
	}
}
