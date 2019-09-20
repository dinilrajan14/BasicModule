package basicmodule_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leapyear {
	public static void main(String[] args)throws IOException
	{
		BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
		int year;
		System.out.println("enter the year");
		year=Integer.parseInt(br.readLine());
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				 System.out.println("leap year");
					
					
			else
				System.out.println("not leap year");
			}
			else
				System.out.println(" leap year");
		}
		else
			System.out.println("not leap year");
	}

}
