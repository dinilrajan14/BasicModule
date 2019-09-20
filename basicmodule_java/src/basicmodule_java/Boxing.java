package basicmodule_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boxing {public static void main(String[] args)throws IOException
{
	BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
	int num,min;
	System.out.println("enter the num ");
	num=Integer.parseInt(br.readLine());
	int arr[]=new int[num];
	System.out.println("enter the fouls ");
	for(int i=0;i<num;i++)
	{
		arr[i]=Integer.parseInt(br.readLine());
		
	}
	min=arr[0];
	for(int i=0;i<num;i++)
	{if(arr[i]<min)
		min=arr[i];
	}
	System.out.println(+min);
	}
}


