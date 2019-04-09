package com.zebc;

import com.zebc.Player;

import java.util.*;

public class GuessGame{
	Player p1;
	Player p2;
	Player p3;

	public void startGame(){
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		Boolean b1 [] = new Boolean[10];
		Boolean b2 [] = new Boolean[10];
		Boolean b3 [] = new Boolean[10];
		
		for (int i = 0; i < 10; i++) {
			b1[i] = true;
			b2[i] = true;
			b3[i] = true;
		}

		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;

		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;

		int targetNumber = (int) (Math.random() * 10);
		System.out.println("Number from 0 to 9...");
	 
		while(true){
			System.out.println("Number is - " + targetNumber);

			while(true){
				p1.guess();
				if (b1[p1.number]) {
					guessp1 = p1.number;
					System.out.println("First player think, is it " + guessp1);
					b1[p1.number] = false;
					break;
				}
			}

			while(true){
				p2.guess();
				if (b2[p2.number]) {
					guessp2 = p2.number;
					System.out.println("Second player think, is it " + guessp2);
					b2[p2.number] = false;
					break;
				}
			}

			while(true){
				p3.guess();
				if (b3[p3.number]) {
					guessp3 = p3.number;
					System.out.println("Third player think, is it " + guessp3);
					b3[p3.number] = false;
					break;
				}
			}
			
			if (guessp1 == targetNumber){
				p1isRight = true;
			}
			if (guessp2 == targetNumber){
				p2isRight = true;
			}
			if (guessp3 == targetNumber){
				p3isRight = true;
			}

			if (p1isRight || p2isRight || p3isRight){
				System.out.println();
				System.out.println("We have a Winner!");
				System.out.println()''
				System.out.println("First player say " + p1isRight);
				System.out.println("Second player say " + p2isRight);
				System.out.println("Third player say " + p3isRight);
				System.out.println();
				System.out.println("Game over");
				break;
			} else {
				System.out.println("Continue...");
			}
		}
	}
}