/*
 * Class: CMSC203 
 * Instructor:Faranaz Eivazi
 * Description: In this class it is the driver class that gathers the other class and 
 * displays the information, in this class.
 * Due: 09/29/24
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alexia Majano
 */

import java.util.Scanner;

public class PatientDriverApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//scanner patientInfo
		Patient patientInfo = new Patient();
		// patients information & input
		System.out.print("Enter first name: ");
		String firstName = scanner.nextLine();
		patientInfo.setFirstName(firstName);
		System.out.print("Enter middle name: ");
		String middleName = scanner.nextLine();
		patientInfo.setMiddleName(middleName);
		System.out.print("Enter last name: ");
		String lastName = scanner.nextLine();
		patientInfo.setLastName(lastName);
		System.out.print("Enter street address: ");
		String streetAddress = scanner.nextLine();
		patientInfo.setStreetAddress(streetAddress);
		System.out.print("Enter city: ");
		String city = scanner.nextLine();
		patientInfo.setCity(city);
		System.out.print("Enter state: ");
		String state = scanner.nextLine();
		patientInfo.setState(state);
		System.out.print("Enter ZIP code: ");
		String zipCode = scanner.nextLine();
		patientInfo.setZipCode(zipCode);
		System.out.print("Enter phone number: ");
		String phoneNumber = scanner.nextLine();
		patientInfo.setPhoneNumber(phoneNumber);
		System.out.print("Enter emergency contact name: ");
		String contactNameEm = scanner.nextLine();
		patientInfo.setContactNameEm(contactNameEm);
		System.out.print("Enter emergency contact phone: ");
		String contactPhoneEm = scanner.nextLine();
		patientInfo.setContactPhoneEm(contactPhoneEm);
		//procedures initialization
		Procedure procedure1 = new Procedure("Physical Exam", "03/31/2004","Dr.Amanda", 500.0);
		Procedure procedure2 = new Procedure("blood test", "04/20/2020", "Dr. isaiah", 4600.43);
		Procedure procedure3 = new Procedure("X-ray", "12/25/2021", "Dr. katyln", 1000.75);     
		// Display info
		displayPatient(patientInfo);
		System.out.println("\n");
		//displays procedures
		displayProcedure(procedure1);
		System.out.println("\n");
		displayProcedure(procedure2);
		System.out.println("\n");
		displayProcedure(procedure3);
		//getting totalcharges and displaying them
		System.out.println("Total Charges: $" + calculateTotalCharges(procedure1, procedure2, procedure3)+ "\n");
		//Coders name&date&mc number
		System.out.println("Student Name: Alexia Majano");
		System.out.println("Due Date:" + "09/29/2024");
		System.out.println("MC#:"+ "21144849");
		scanner.close();
	}
	//  the toString info of the Patient
	public static void displayPatient(Patient patient) {
		System.out.println(patient);
	}
	//  procedure information
	public static void displayProcedure(Procedure procedure) {
		System.out.println(procedure);
	}
	// Calculate total cost
	public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
		return procedure1.getCost() + procedure2.getCost() + procedure3.getCost();
	}
}
