/*
Assignment: Lab 5
Name: Tien Nguyen
Email: TIEN.DUY.NGUYEN@tcu.edu
Class-Section: CoSc10403-002
Semester: 2024, Fall
Overview:
This program demonstrate the use of various loops and get comfortable with nested loops.
*/


import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice=0;
        do {
            //Ask the user to input their choice
            System.out.println("Screen Art Program");
            System.out.println("Enter 1 to print rectangular pattern");
            System.out.println("Enter 2 to print reverse triangular pattern");
            System.out.println("Enter 3 to print reverse star pattern");
            System.out.println("Enter -1 to exit program");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                //when users choose rectangular patern
                    System.out.println("Rectangular pattern selected");

                //ask for the number of rows
                    System.out.print("How many rows? ");
                    int row = sc.nextInt();

                //ask for the number of columns
                    System.out.print("How many columns? ");
                    int column = sc.nextInt();

                //nested loop to print rectangular pattern with given rows and columns
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < column; j++) {
                            System.out.print("*");
                        } System.out.println(" ");
                    }
                    break;

                case 2:
                //when users choose reverse triangular pattern
                    System.out.println("Reverse triangular pattern selected");

                //ask for the size of top
                    System.out.print("Size of Top? ");
                    int topSize = sc.nextInt();

                //nested loop to print reverse triangular pattern with given size of top
                    for (int i = topSize; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        } System.out.println(" ");
                    }
                    break;

                case 3:     
                //when users choose reverse stairstep pattern
                    System.out.println("Reverse stairstep pattern selected");

                //ask for the number of steps
                    System.out.print("Number of steps ");
                    int step = sc.nextInt();
                
                //nested loop to print reverse stairstep pattern with given number of steps
                    for (int i = step; i > 0; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" ");
                        } 
                        System.out.print("#");
                        System.out.println(" ");
                    }
                    break;
                
                case -1:      //write this line to avoid this case being handled in the default situation
                    break;

                default:
                //When the choice is not available
                    System.out.println("Invalid input choice. Please enter again!");
                    break;
            }
        } while (choice!=-1);    //when user choose exit program
    }
}
