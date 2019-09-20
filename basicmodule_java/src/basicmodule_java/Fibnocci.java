package basicmodule_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibnocci {
	public static  void main(String[] args) throws IOException
	{
		BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
		int n,a=0,b=1,y,c;
		System.out.println("enter the num");
		n=Integer.parseInt(br.readLine());
		 
			
			
			System.out.print(a+ " " +b);
		
			for(int i=2;i<n;i++)
			{
			c=a+b;
			System.out.print(" " +c);
			a=b;
			b=c;
			
		}
		
	}

}
