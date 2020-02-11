package com.capg.vijay.lab10.exec1;

import java.util.Scanner;

public class XpowerY
{
	public static void main(String args[])
	{
		System.out.println("Enter the x value:");
		Scanner sc = new Scanner(System.in);
		
		
		Xpower fun =(x,y)->System.out.println(Math.pow(x,y));
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		fun.getPower(x,y);
		sc.close();
	}
}
