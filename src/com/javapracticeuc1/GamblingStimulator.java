package com.javapracticeuc1;

public class GamblingStimulator {
	public static void main(String[] args) {

		
			 int stake = 100 ;	
			 int bet = 1;
			 System.out.println("Welcome to Gambling Simulator");
				

				System.out.println("Gambler start with stake of $" + stake);
					int TRIAL = (int) Math.floor(Math.random() * 2);
				System.out.println("Value Is " +TRIAL);
				if (TRIAL == 0) {   
					System.out.println("Gambler won game");
					stake++; 	
				} else {
					System.out.println("Gambler loos game");
					stake--;	
				}
				System.out.println("Gambler having stake after bet are of $ " + stake);
				
	}	

}
