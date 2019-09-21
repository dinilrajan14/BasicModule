package Coustemer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Coustemerdisplay {
	public static String arr[]=new String[25];
	public static void viewCoustomer(String name,String address,String number,String email,String proof,String proofID,int count)
	{
	System.out.println("\n  Customer  list\n\n");
	System.out.println("\n   The Registered Coustomers Are");

	int i=1;
	while(i<=count)
	{
	System.out.println("\n  CUSTOMER NAME :"+arr[i]+"\t\tCoustomer ID :"+i);
	i++;
	}
	}
	
public static void main(String[] args) throws IOException
{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	int count=0,z=1;
	String x;
	while(z==1)
	{ System.out.println("registration");
	System.out.println("enter your name:");
	String name=br.readLine();
	System.out.println("enter your address:");
	String address=br.readLine();
	System.out.println("Contact Number");
	String number=br.readLine();
	System.out.println("e-mail ID is");
	String email=br.readLine();
	System.out.println("enter proof ID type");
	String proof=br.readLine();
	System.out.println("Enter proof ID");
	String ID=br.readLine();
	System.out.println("Thank you for registering your ID id:" +count);
	count++;
	for(int i=count;i<25;i++)
	{
	arr[i]=name;

	}
	System.out.println("do you want to continue registration (Y/N)");
	x=br.readLine();
	if(x.compareTo("Y")==0)
	{
	z=1;
	}
	if(x.compareTo("N")==0)
	{viewCoustomer (name,address,number, email, proof, ID, count );
	 break;
	 }
}}}

