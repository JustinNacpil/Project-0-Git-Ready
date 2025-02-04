//
//Nacpil, Justin
//Project: 1
//Due: 2024-09-19
//Course: cs-1400-05-f24
//
//Description:
//This is my first Java project for CS 1400 for solves Quadratic Equations
//

import java.util.Scanner;

public clas QuadraticEquationSolver 
{
	public static void main(String[] args)
	{	
		//Prints out the title of the program
		System.out.println("Quadratic Equation Solver by J. Nacpil");

		//Outputs a blank line
		System.out.println("");

		//Allows for input to be taken by the keyboard
		Scanner keyboard = new Scanner(System.in);

		//Outputs line asking for coefficient then recieves input from keyboard
		System.out.print("Enter coefficient a? ");
		double a = keyboard.nextDouble();

		System.out.print("Enter coefficient b? ");
		double b = keyboard.nextDouble();

		System.out.print("Enter coefficient c? ");
		double c = keyboard.nextDouble();
		
		System.out.println("");

		//discriminant which is used for the quadratic equation
		double discriminant = b * b - 4 * a* c;

		//equation for both positive and negative quadratic equations
		double x1 = (-b + Math.sqrt(discriminant))/(2 * a);
		double x2 = (-b - Math.sqrt(discriminant))/(2 * a);
		
		//outputs the solution for x1 and x2
		System.out.println("The solutions:");
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);

		
	}
}
