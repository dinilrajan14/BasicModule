package Email;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Emailupdater {
	public static void main(String[] arg) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int count=1,z=1;
	 String x;
	 while(z==1)
	   {
			System.out.println("\n        reg");
			System.out.println("enter your name");
			String name=br.readLine();
			System.out.println("Enter your address");
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
			
			System.out.println("do you want to continue registration(Y/N)");
			x=br.readLine();
			if(x.compareTo("Y")==0)
			{
				z=1;
			}
	 if(x.compareTo("N")==0) {
				System.out.println("Do you want to update the email ID(YES/NO)");
				x=br.readLine();
				if(x.compareTo("YES")==0)
				
		
				{
					System.out.println("update email");
				
				System.out.println("enter new email ID:");
				String newid=br.readLine();
				System.out.println("email updated");
				System.out.println("name:"+name);
				System.out.println("adress:"+address);
				System.out.println("contact number:" +number);
				System.out.println("email id:"+newid);
				System.out.println("Proof type:"+proof);
				System.out.println("proof ID:"+ID);
			    z=0;
				}
	 

			
			
	 }}
	}}
