package basicmodule_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mark { 
	public static void main (String[] args)throws IOException
	
	{
		int num,count=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		num=Integer.parseInt(br.readLine());
		int arr[]= new int[num];
		System.out.println("enter the marks of students");
		for(int i=0;i<num;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
			
		}
		int max=45;
		for(int i=0;i<num;i++)	
		{
			if(arr[i]<max)
			{
			count++;
			
		}
		}
	
		System.out.println("the number of students attend in retest is;"+count);

}}