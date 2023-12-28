package com.coderscampus;

import java.util.Random;
import java.util.Scanner;
public class RandomGuessNumber {

	public static void main(String[] args) {
	Random random = new Random();
	int randomNumber = random.nextInt(100);
	System.out.println("My random number is: " + randomNumber);
		Scanner scanner = new Scanner(System.in);
	System.out.print("Pick a number between 1 and 100");
	   int  myInput = scanner.nextInt();
	if (myInput == randomNumber) {
	
		System.out.println("You win");
		 System.exit(0);
		}
	  int attemps = 5;
	 while (attemps > 0) { 
   if (myInput > randomNumber) {
		System.out.println("Pick a lower number. Please Try Again");
		scanner.nextLine();
		attemps--;
	}
	else if (myInput < randomNumber) {
		System.out.println("Pick a higher number. Please Try Again");
		scanner.nextLine();
		attemps--;
		}
	 }
	  
	  if (attemps == 0) {
	  System.out.println("You lose. The random number was : " + randomNumber);	
	}
}
	}



