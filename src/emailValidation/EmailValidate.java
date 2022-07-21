//imported arrayList Collection here
package emailValidation;
import java.util.ArrayList;
import java.util.Scanner;

//Class to store all the email id at one seperate place
class Emails{
	
	//boolean return type method to check if conatins specific string or not
	public boolean EmailData(String str)
	{
		//arraylist to store all the email id's
		ArrayList<String> EmailId=new ArrayList<String>();
		EmailId.add("alex@gmail.com");
		EmailId.add("karan@gmail.com");
		EmailId.add("david123@gmail.com");
		EmailId.add("jeffbezos@gmail.com");
		EmailId.add("elonmuskmars@gmail.com");
		EmailId.add("billgates@gmail.com");
		
		//used .contains method to check the string in arraylist
		boolean ans = EmailId.contains(str);
		
		//returning boolean to the main function
		return ans;
	}
}
public class EmailValidate {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email id.");
		String email = sc.nextLine();
		
		//creating obj of Class Emails
		Emails obj = new Emails();
		
		//passing the string to the Email class to check if its present in database or not
		//output based on the return type.
		if(obj.EmailData(email)==true)
		{
			System.out.println("YES Email id "+email+" is AVAILABLE in the Database.");
		}
		else
		{
			System.out.println("NO Email id "+email+" is NOT available in the Database.");
		}	
	}
}
