/*
Assignment: Lab 3
Name: Tien Nguyen
Email: TIEN.DUY.NGUYEN@tcu.edu
Class-Section: CoSc10403-002
Semester: 2024, Fall
Overview:
This program demonstrate use of conditional statements and handling of programming logic.
*/


import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) {
		System.out.println("This program drops lowest score, averages 2 test scores and print it with letter grade.");
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter score #1: ");
		a = sc.nextInt();
		System.out.print("Enter score #2: ");
		b = sc.nextInt();
		System.out.print("Enter score #3: ");
		c = sc.nextInt();

		if (a>=0 && b>=0 && c>=0) {
		 if( a-b <= 0 && a-c <= 0) {
			System.out.println("Lowest score to be dropped is "+a);
		} else if (b-c <= 0 && b-a <= 0) {
			System.out.println("Lowest score to be dropped is "+b);
		} else if (c-b <= 0 && c-a <= 0) {
			System.out.println("Lowest score to be dropped is "+c);
		} 
	}else {
		System.out.println("incorrect input value");
	}
		if (a>=0 && b>=0 && c>=0) {
		  if (a-b <= 0 && a-c <= 0) {
			double x = (double)(b+c)/2;
			if (x>=90 && x<=100) {
				System.out.println("The average score is "+x+" = A");
			} else if (x>=80 && x<90) {
				System.out.println("The average score is "+x+" = B");
			} else if (x>=70 && x< 80) {
				System.out.println("The average score is "+x+" = C");
			} else if (x>=60 && x<70) {
				System.out.println("The average score is "+x+" = D");
			} else {
				System.out.println("The average score is "+x+" = F");
			}
		} else if (b-c <= 0 && b-a <= 0) {
			double x = (double)(a+c)/2;
			if (x>=90 && x<=100) {
				System.out.println("The average score is "+x+" = A");
			} else if (x>=80 && x<90) {
				System.out.println("The average score is "+x+" = B");
			} else if (x>=70 && x< 80) {
				System.out.println("The average score is "+x+" = C");
			} else if (x>=60 && x<70) {
				System.out.println("The average score is "+x+" = D");
			} else {
				System.out.println("The average score is "+x+" = F");
			}
		} else if (c-b <= 0 && c-a <= 0) {
			double x = (double)(a+b)/2;
			if (x>=90 && x<=100) {
				System.out.println("The average score is "+x+" = A");
			} else if (x>=80 && x<90) {
				System.out.println("The average score is "+x+" = B");
			} else if (x>=70 && x< 80) {
				System.out.println("The average score is "+x+" = C");
			} else if (x>=60 && x<70) {
				System.out.println("The average score is "+x+" = D");
			} else {
				System.out.println("The average score is "+x+" = F");
			}
		} 
	} 	else {
		System.out.println(" ");
	}
}
}
