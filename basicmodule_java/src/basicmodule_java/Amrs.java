package basicmodule_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Amrs {
	public static void main(String[] args) throws IOException
	{	int num,rem,sum=0,temp,n,count=0 ;
		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
	System.out.println(" enter the num");
	 num=Integer.parseInt(br.readLine());
	 temp=num;
	 n=num;
	 while(n>0)
	 {
		 count++;
		 n=n/10;
		 
	 }
	while(temp>0) {
		rem=temp%10;
		rem= (int) Math.pow(rem, count);
		sum=sum+rem;
		temp=temp/10;
		
	}
	if(num==sum)
	{
		System.out.println(" the num is Armstrong");
	}
	else
	{ 
		System.out.println(" the num is Not Armstrong");
	}
	}

}