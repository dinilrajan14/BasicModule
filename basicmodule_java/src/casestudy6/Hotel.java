package casestudy6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hotel {
	public static void main(String[]args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int count=0;
		String x;
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
		System.out.println("do you want to book a room (Y/N)");
		x=br.readLine();
		if(x.compareTo("Y")==0)
		{System.out.println("booking");

		System.out.print("AC OR Non-AC(AC/nAc)");
		String ac=br.readLine();
		System.out.print("cot(Single/Double)");
		String cot=br.readLine();
		System.out.print("With cable or Without cable(C/Cn)");
		String cable=br.readLine();
		System.out.print("Wifi needed or not(W/nW)");
		String wifi=br.readLine();
		System.out.print("Laundary Service Needed or Not(L/nL)");
		String  laundary=br.readLine();
	}

}
