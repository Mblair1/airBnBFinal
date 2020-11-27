package com.citadel.edu.model;

import java.util.Scanner;

public class Review {
	public Account reviewer;
	private static String text;
	private int ID;
	
	public void write() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your review: ");
		this.text = input.nextLine();
		
	}
	public void read() {
		System.out.println(this.text);
	}
}
