/*
Name: Lusemar Oliveira
Class: COP2800 - Programming in Java 
Programming Assignment #1: Display Information
Due date: Tuesday, January 19, 2021
Program Description: This  program will display the Area and Perimeter of a rectangle. 
 */
package displayinformation; // Here is the package where the program is located.

public class DisplayInformation { // Here is the our class.
    public static void main(String[] args) { // Here is the main method, it's where the program executes.
        
        double recWidth = 4.5;  // Here is where we declare the variable with it's type, name and value... 
        double recHeight = 9.7;
        double recArea = 0;
        double recPerimeter = 0;
        
        recArea = recWidth * recHeight; // Here is where we do the math operation for the Area.
        recPerimeter = ((2 * recWidth) + (2 * recHeight)); // Here is where we do the math operation for the Perimeter.
        
    System.out.println("The rectangle area is " + recArea + " and the perimeter is " + recPerimeter + "."); // Here is where we out put the Information.
    }
}
