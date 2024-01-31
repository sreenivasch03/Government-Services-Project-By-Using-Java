package gov.services.project;

import java.util.ArrayList;

public class Customer 
{
	private String name;
	private String fatherName;
	private String dateOfBirth;
	private int age;
	private String gender;
	private long mobileNo;
	private String address;
	
	public Customer() 
	{
		
	}
	public Customer(String name, String fatherName, String dateOfBirth, int age, String gender,
			long mobileNo,String address) {
		
		this.name = name;
		this.fatherName = fatherName;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void customerDetails()
	{
		System.out.println("Name :"+getName());
		System.out.println("Father Name :"+getFatherName());
		System.out.println("Date of birth :"+getDateOfBirth());
		System.out.println("Age :"+getAge());
		System.out.println("Gender :"+gender);
		System.out.println("Mobile No :"+getMobileNo());
		System.out.println("Address :"+getAddress());
	}
}
