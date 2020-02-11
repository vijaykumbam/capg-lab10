package com.capg.vijay.lab10.exec3;

import java.util.Scanner;

public class Test
{
	static String storedName ="vijay";
	static String storedPassword ="123456";	
	static int namelength = storedName.length();
	static int passwordlength = storedPassword.length();
	public static void main(String[] args)
	{
		
		ValidationInterface ref = (name,password)->
		{
			String str = new String(name);
			String str1 = new String(password);
			if(namelength== (name.length())  && passwordlength == (password.length()))
			{
				int value=(str.compareTo(storedName));
				int value1= (str1.compareTo(storedPassword));
				if(value ==0 && value1==0)
				return true;
			}
			return false;
		};
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Enter the password");
		String password = sc.next();
		System.out.println(ref.validationMethod(name,password));
		
		
	}

}
