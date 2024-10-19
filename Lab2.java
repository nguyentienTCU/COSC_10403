/*
Assignment: Lab 2
Name: Tien Nguyen
Email: TIEN.DUY.NGUYEN@tcu.edu
Class-Section: CoSc10403-002
Semester: 2024, Fall
Overview:
This program demonstrates the use of demonstrate input/output using the Scanner and JOptionPane, as well as number conversion using parseXXX methods.
*/


import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the student's name: ");
		String studentName = sc.nextLine();
		
		System.out.print("Enter the score of test 1: ");
		double test1Score = sc.nextDouble();
		
		
		String input = JOptionPane.showInputDialog("Enter the score of test 2: ");
		double test2Score = Double.parseDouble(input);
		
		double averageScore = (test1Score + test2Score)/2;
		System.out.println("Student: "+studentName+" average test score: "+averageScore);
		
		
		System.exit(0);
		
	}

}

