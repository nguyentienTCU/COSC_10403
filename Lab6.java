/*
Assignment: Lab 6
Name: Tien Nguyen
Email: TIEN.DUY.NGUYEN@tcu.edu
Class-Section: CoSc10403-002
Semester: 2024, Fall
Overview:
This program demonstrates the use of methods as well as practice more nested loops.
*/


import java.util.Scanner;

public class Lab6 {

    //method to print out rectangular pattern
    public static void drawRectangle(int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("*");
            } System.out.println(" ");
        }
    }

    //method to print out reverse triangular
    public static void drawReverseTriangle(int topSize) {
        for (int i = topSize; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            } System.out.println(" ");
        }
    }

    //method to print out reverse stair step (with or without wall)
    public static void drawReverseStair_Wall(int step, boolean wall) {
        if (!wall) {
            for (int i = step; i > 0; i--) {
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                } 
                System.out.print("#");
                System.out.println(" ");
            }
        } else {
            for (int i = step; i > 0; i--) {
                System.out.print("#");
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                } 
                System.out.print("#");
                System.out.println(" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            //Ask the user to input their choice
            System.out.println("Screen Art Program");
            System.out.println("Enter 1 to print rectangular pattern");
            System.out.println("Enter 2 to print reverse triangular pattern");
            System.out.println("Enter 3 to print reverse stair step pattern");
            System.out.println("Enter 4 to print reverse wall + stair step pattern");
            System.out.println("Enter -1 to exit program");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                //when users choose rectangular patern
                    System.out.println("Rectangular pattern selected");

                //ask for the number of rows
                    System.out.print("How many rows? ");
                    int row = sc.nextInt();

                    if (row>=1&&row<=10) {
                        row+=0;
                    } else {
                    do {
                        System.out.println("Please enter a number between 1-10");
                        row = sc.nextInt();
                    } while (row<1||row>10);
                }
                //ask for the number of columns
                    System.out.print("How many columns? ");
                    int column = sc.nextInt();

                //when users enter out-of-range numbers of step, remind them until they input correctly
                    if (column>=1&&column<=10) {
                        column+=0;
                    } else {
                    do {
                        System.out.println("Please enter a number between 1-10");
                        column = sc.nextInt();
                    } while (column<1||column>10);
                }

                //print out rectangular pattern using method
                    drawRectangle(row,column);
                    break;

                case 2:
                //when users choose reverse triangular pattern
                    System.out.println("Reverse triangular pattern selected");

                //ask for the size of top
                    System.out.print("Size of Top? ");
                    int topSize = sc.nextInt();

                //when users enter out-of-range numbers of step, remind them until they input correctly
                    if (topSize>=1&&topSize<=10) {
                        topSize+=0;
                    } else {
                    do {
                        System.out.println("Please enter a number between 1-10");
                        topSize = sc.nextInt();
                    } while (topSize<1||topSize>10);
                }

                //print out reverse triangular pattern using method
                    drawReverseTriangle(topSize);
                    break;

                case 3:     
                //when users choose reverse stairstep pattern
                    System.out.println("Reverse stairstep pattern selected");

                //ask for the number of steps
                    System.out.print("Number of steps ");
                    int stairStep = sc.nextInt();

                //when users enter out-of-range numbers of step, remind them until they input correctly
                    if (stairStep>=1&&stairStep<=10) {
                        stairStep+=0;
                    } else {
                    do {
                        System.out.println("Please enter a number between 1-10");
                        stairStep = sc.nextInt();
                    } while (stairStep<1||stairStep>10);
                }

                //print out reverse stairstep pattern using method (not including wall)
                    drawReverseStair_Wall(stairStep, false);
                    break;

                case 4:
                //when users choose reverse wall+stairstep pattern
                System.out.println("Wall + stairstep pattern selected");

                //ask for the number of steps
                    System.out.print("Number of steps ");
                    int wallStep = sc.nextInt();

                //when users enter out-of-range numbers of step, remind them until they input correctly
                    if (wallStep>=1&&wallStep<=10) {
                        wallStep+=0;
                    } else {
                    do {
                        System.out.println("Please enter a number between 1-10");
                        wallStep = sc.nextInt();
                    } while (wallStep<1||wallStep>10);
                }

                //print out reverse stairstep pattern using method (including wall)
                    drawReverseStair_Wall(wallStep, true);
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
