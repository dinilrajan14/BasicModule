package basicmodule_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Economy {
	public static void main(String[] args)throws IOException
	{
		BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
		int num,count=0,total=0;
		float overall;
		System.out.println("enter the num of bowlers");
		num=Integer.parseInt(br.readLine());
		int run[]= new int[num];
		int bowl[]= new int[num];
		float eco[]= new float[num];
		System.out.println("runs concided");
		for(int i=0;i<num;i++)
		{
			run[i]=Integer.parseInt(br.readLine());
			
		}
		
		System.out.println( "bowls bowled");
		
		for(int i=0;i<num;i++)
		{
			bowl[i]=Integer.parseInt(br.readLine());
			bowl[i]=bowl[i]/6;
		}
		for(int i=0;i<num;i++)
		{
			eco[i]=run[i]/bowl[i];
		}
			for(int i=0;i<num;i++)
			{
				total=(int) (total+eco[i]);
			}
			overall=total/num;
			System.out.println("economy;"+overall);
			
			
		for(int i=0;i<num;i++)
		{
			
			
			if(eco[i]<overall)
			{
				count++;
			}
				
		}
		System.out.println(+count);
	}}
