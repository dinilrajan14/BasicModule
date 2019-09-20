package basicmodule_java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	
	public static void main(String[] args) throws IOException
	{String name;
	String age;
	String degree;
	String branch;
	String contactnum;
	
		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
	name=br.readLine();
	age=br.readLine();
	degree=br.readLine();
	branch=br.readLine();
	contactnum=br.readLine();

	System.out.println("name:"+name);
	System.out.println("age:"+age);
	System.out.println("degree:"+degree);
	System.out.println("branch:"+branch);
	System.out.println("contactnum:"+contactnum);
	
	}
}
