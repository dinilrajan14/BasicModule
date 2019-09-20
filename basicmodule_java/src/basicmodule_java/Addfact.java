package basicmodule_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Addfact {
	public class Boxing {public static void main(String[] args)throws IOException
	{
		BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
		int num,fact,sum=0;
		num=Integer.parseInt(br.readLine());
		if(num<0) {
			fact=Integer.parseInt(br.readLine());
			for(int i=0;i<=fact;i++)
			{
				sum=sum+i;
				
			}
			System.out.println(+sum);
		}
			else
			{for(int i=0;i<=fact;i++)
			{
				sum=sum+i;
				
			}
		}
			
}
