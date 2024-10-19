/*
Assignment: Lab 1
Name: Tien Nguyen
Email: e.a.ipser@tcu.edu
Class-Section: CoSc10403-002
Semester: 2024, Fall
Overview:
This program demonstrates the use of variables, basic types and printing special characters to the system console.
*/

public class Lab1
{
	
	public static void main (String[] args)
	{
		//Declare a String variable with your full name.
			String name = "Tien Nguyen";
		//Declare one of each Java base type and assign them appropriate values (not zero):
		//byte
			byte age = 18;
		//short
			short century = 21;
		//int
			int year = 2024;
		//long
			long money = 250000;
		//float
			float grade = 9.5f;
		//double
			double pi = 3.141592653589793238462643383279502884197;
		//Decide on a quote you would like to display (you don’t need to store it in a variable).
		//Write to System.out the following:
		//your lab title (using your name variable declared in 1 plus apostrophe s Lab),
			System.out.println(name+"'s Lab");
		//the variables declared in 2 and their respective values,
			System.out.println("byte age: "+age);
			System.out.println("short century: "+century);
			System.out.println("int year: "+year);
			System.out.println("long money: "+money);
			System.out.println("float grade: "+grade);
			System.out.println("double pi: "+pi);
		//your quote, formatted with newlines, tabs or special characters (\n, \t, \’, etc) as necessary. 
			System.out.println("Quote of the day: \"We all have this limited time on earth. How can we help others?\" -- David Giertz");
	}
}
