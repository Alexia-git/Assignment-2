/*
 * Class: CMSC203 
 * Instructor:Faranaz Eivazi
 * Description: In this class it is the procedure class.
 * This class has setters and getters for any procedure done.
 * Due: 09/29/24
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alexia Majano
 */
public class Procedure {
	//Attributes
	private String procedureName;
	private String practitioner;
	private String date;
	private double cost;
	//no arg Constructor
	public Procedure()
	{
		procedureName ="";
		practitioner="";
		cost = 0.0;
		date = "";
	}
	// Parameterized constructor (two)
	public Procedure(String procedure, String day ) 
	{
		this.procedureName = procedure;
		this.date = day; 
	}
	//  Parameterized constructor for all attriubutes
	public Procedure(String procedure, String day, 
			String doctorName, double charge) 
	{
		this.procedureName = procedure;
		this.date = day;
		this.practitioner = doctorName;
		this.cost = charge;
	}
	//getters
	public String getProcedureName() 
	{
		return procedureName;
	}
	public String getPractitioner() 
	{
		return practitioner;
	}
	public double getCost() 
	{
		return cost;
	}
	public String getDate() 
	{
		return date;
	}
	//setters
	public void setProcedureName(String procedure) 
	{
		procedureName = procedure;
	}
	public void setPractitioner(String doctorName) 
	{
		practitioner = doctorName;
	}
	public void setCost(double charge) 
	{
		cost = charge;
	}
	public void setDate(String day) 
	{
		date = day;
	}
	//toString method
	public String toString()
	{
		return 
				"Procedure: " + procedureName+"\n"+"Procedure Date: "+ date + "\n"
				+ "Practitioner: " + practitioner +" \n" +"Charges: " + cost;
	}
}
