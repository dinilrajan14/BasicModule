package basicmodule_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hight {
	public static void main( String[] args) throws IOException
	{ 
	BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
	
		int count,temp;
	System.out.println("enter the num of student");
	count=Integer.parseInt(br.readLine());
	int arr[]=new int[count];
	System.out.println("enter the hights");
	for(int i=0;i<count;i++)
	{	
		arr[i]=Integer.parseInt(br.readLine());
		
	}
	for(int i=0;i<count;i++)
	{
		for(int j=0;j<i;j++)
	
	if (arr[i]<arr[j])
	{
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	}
	
	for(int i=0;i<count;i++)
	{
		System.out.println(arr[i]);
		
	}
	}}	


