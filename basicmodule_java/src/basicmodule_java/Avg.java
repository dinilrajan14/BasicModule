package basicmodule_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Avg {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num,avge,sum=0;
		System.out.println("enter the num of students");
		num=Integer.parseInt(br.readLine());
		int arr[]=new int[num];
		System.out.println("enter the marks of students");
		for(int i=0;i<num;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
			
		}
		
		for(int i=0;i<num;i++)	
		{
			sum=sum+arr[i];
			
		}
		avge=sum/num;
	
	
	
	System.out.println("the avg is;"+avge);
}
}