/*
Assignment: Lab 4
Name: Tien Nguyen
Email: TIEN.DUY.NGUYEN@tcu.edu
Class-Section: CoSc10403-002
Semester: 2024, Fall
Overview:
This program demonstrates if-else-if and switch statements.
*/


import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //Ask the user to input a month number
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
    //Ask the user to input a year number
        System.out.print("Enter year (1900-2400): ");
        int year = sc.nextInt();

 
    //if-else statement
    //conditions for leap years
    if ((year%4==0&&year%100!=0) || year%400==0) {
        //months that have 31 days
        if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
            int day = 31;
            System.out.println("Number of Days (if statement) in month "+month+" year "+year+" = "+day);
        } 
        //months that have 30 days
        else if(month==4 || month==6 || month==9 || month==11) {
            int day = 30;
            System.out.println("Number of Days (if statement) in month "+month+" year "+year+" = "+day);
        } 
        //when the month input is February (29 days)
        else if(month==2) {
            int day = 29;
            System.out.println("Number of Days (if statement) in month "+month+" year "+year+" = "+day);
        } 
        //when the month input is outside the range
        else {
            System.out.println("Number of Days (if statement) in month "+month+" year "+year+" = 0");
            System.out.println("Invalid month.");
        }
    } 
    //when it's not a leap year
    else {
        //months that have 31 days
        if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
            int day = 31;
            System.out.println("Number of Days (if statement) in month "+month+" year "+year+" = "+day);
        } 
        //months that have 30 days
        else if(month==4 || month==6 || month==9 || month==11) {
            int day = 30;
            System.out.println("Number of Days (if statement) in month "+month+" year "+year+" = "+day);
        } 
        //when the month input is February (28 days)
        else if(month==2) {
            int day = 28;
            System.out.println("Number of Days (if statement) in month "+month+" year "+year+" = "+day);
        } 
        //when the month input is outside the range
        else {
            System.out.println("Number of Days (if statement) in month "+month+" year "+year+" = 0");
            System.out.println("Invalid month.");
        }
    } 

    int day;
    //switch-case statement
    switch (month) {
    //months that have 31 days
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            day = 31;
            System.out.println("Number of Days (switch statement) in month "+month+" year "+year+" = "+day);
            break;

    //months that have 30 days
        case 4:
        case 6:
        case 9:
        case 11:
            day = 30;
            System.out.println("Number of Days (switch statement) in month "+month+" year "+year+" = "+day);
            break;

    //when the month input is February        
        case 2:
            day = ((year%4==0&&year%100!=0) || year%400==0) ? 29 : 28;
            System.out.println("Number of Days (switch statement) in month "+month+" year "+year+" = "+day);
            break;

    //when the month input is outside the range
        default:
            day = 0;
            System.out.println("Number of Days (switch statement) in month "+month+" year "+year+" = 0");
            System.out.println("Invalid month.");
            break;
            
        }    
    }
}
