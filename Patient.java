/*
 * Class: CMSC203 
 * Instructor:Faranaz Eivazi
 * Description: In this class it is the patient class which saves the
 * data that was inputed by the patient.
 * Ex. name, city etc
 * Due: 09/29/24
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alexia Majano
 */
public class Patient {

	//Attributes
	private String firstName;
	private String middleName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNumber;
	private String contactNameEm;
	private String contactPhoneEm;
	// no-arg constructor
	public Patient()
	{
		firstName = "";
		middleName = "";
		lastName = "";
		streetAddress = "";
		city = "";
		state = "";
		zipCode = "";
		phoneNumber = "";	
		contactNameEm ="";
		contactPhoneEm = "";
	}
	// Parameterized constructor
	public Patient(String first, String middle ,String last)
	{
		firstName=first;
		middleName = middle;
		lastName = last;
	}
	// Parameterized constructor for all attributes
	public Patient(String first,String middle,String last,String street,String cityName, String stateName, String zipC, String phoneNum,
			String contactNameEm, String contactPhone) 
	{
		this.firstName = first;
		this.middleName = middle;
		this.lastName= last;
		this.streetAddress = street;
		this.city = cityName;
		this.state = stateName;
		this.zipCode = zipC;
		this.phoneNumber = phoneNum;
		this.contactNameEm = contactNameEm;
		this.contactPhoneEm = contactPhone;
	}	
	//accessors
	public String getFirstName()
	{
		return firstName;	
	}
	public String getmiddleName()
	{
		return middleName;
	}
	public String getlastName()
	{
		return lastName;
	}
	public String getStreetAddress() 
	{
		return streetAddress;
	}
	public String getCity()
	{
		return city;
	}
	public String getState() 
	{
		return state;
	}
	public String getZipCode() 
	{
		return zipCode;
	}
	public String getPhoneNumber() 
	{
		return phoneNumber;
	}
	public String getContactNameEm() 
	{
		return contactNameEm;
	}
	public String getContactPhoneEm() 
	{
		return contactPhoneEm;
	}
	//setters
	public void setFirstName(String first) 
	{
		firstName = first;
	}
	public void setMiddleName(String middle)
	{
		middleName = middle;
	}
	public void setLastName(String last)
	{
		lastName = last;
	}
	public void setStreetAddress(String street) 
	{
		streetAddress = street;
	}
	public void setCity(String cityName) 
	{
		city = cityName;
	}
	public void setState(String stateName) 
	{
		state = stateName;
	}
	public void setZipCode(String zipC) 
	{
		zipCode = zipC;
	}
	public void setPhoneNumber(String phoneNum) 
	{
		phoneNumber = phoneNum;
	}
	public void setContactNameEm(String contactName) 
	{
		contactNameEm = contactName;
	}
	public void setContactPhoneEm(String contactPhone) 
	{
		contactPhoneEm = contactPhone;
	}
	//methods
	public String buildFullName()
	{
		return firstName +" " + middleName + " "+ lastName ;
	}
	public String buildAddress()
	{
		return streetAddress+" "+ city + " "+ state+" "+zipCode;	
	}
	public String buildEmergencyContact() 
	{
		return contactNameEm + " " + contactPhoneEm;
	}
	// toString
	public String toString()
	{
		return  "\nPatient Info:\n" + "" + "Full Name: " + buildFullName() + "\n" +
				"" + "Address: " + buildAddress() + "\n" + "" + "Phone Number: " + phoneNumber + "\n" +
				"" + "Emergency Contact: " + buildEmergencyContact();
	}
}
