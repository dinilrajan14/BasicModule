package basicmodule_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Namefact {
	public  static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
		int num,fact=1;
		System.out.println( "enter the  count of letter");
		num=Integer.parseInt(br.readLine());
		while(num>1) {
			fact=fact*num;
		--num ;
		}
	
	System.out.println("combinations are:"+fact);
}}


