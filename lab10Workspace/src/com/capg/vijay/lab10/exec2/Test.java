package com.capg.vijay.lab10.exec2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		System.out.println("Enter the String");
		Scanner sc =  new Scanner(System.in);
		
		
		StringSpace obj = (str)->{
			for(int loop=0;loop<str.length();loop++)
			{
				System.out.print(str.charAt(loop)+" ");
			}
		};
		
		String str = sc.next();
		obj.fun(str);
	}

}
