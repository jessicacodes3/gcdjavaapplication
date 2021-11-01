// This program calculates grratest commom divisor (GCD) 

import java.util.Scanner;

public class GCDapp {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int[] numbers = new int[5];

// Prompt the user to enter five numbers
System.out.print("Enter five numbers: ");

for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();}

System.out.println("The greatest common divisor is " + gcd(numbers));} // Display the gcd
	
public static int gcd(int... numbers) // Method that returns the gcd 5 data sets of integers
        {int gcd = 1;			
		boolean isDivisor;

for (int i = 2; i < min(numbers); i++) {
			isDivisor = true;
			for (int e: numbers) {
				if (e % i != 0)
					isDivisor = false;}
			if (isDivisor)
				gcd = i;}
		return gcd;}
    
 public static int min(int... numbers)// Method min returns the smallest integer in an array 
        {int min = numbers[0];
		for (int e: numbers) {
			if (e < min)
				min = e;}
		return min;	
    }
    }
