package basicmodule_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greater {
	
	public static void main(String[] args)throws IOException
	{
		BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
		int num,max;
		System.out.println("enter the num ");
		num=Integer.parseInt(br.readLine());
		int arr[]=new int[num];
		System.out.println("enter the bids ");
		for(int i=0;i<num;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
			
		}
		max=arr[0];
		for(int i=0;i<num;i++)
		{if(arr[i]>max)
			max=arr[i];
		}
		System.out.println(+max);
		}
}
		
