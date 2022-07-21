# Emal-id-validation

Email Id Validation

Introduction:

This is an Email Id Validation fully written in JAVA. User can check if the entered email id exist in the database or not



Installation Guide:

1.	GitHub link: https://github.com/baljeet-singh97/Email-Id-Validation

2.	Download the entire project as Zip in local system.

3.	import the project in Eclipse IDE

4.	Go to src/arithmaticCalculator/arithmeticCalc.java and run the code



How to use:

1. After running the code you will see the window like:






2. Enter the Email id you want to check.



 
3.	After entering the email id program will give output if the email id is available in the database or not .



Code Description:

Main Function:

•	Creates an object of Scanner class

Scanner sc = new Scanner(System.in);	.

•	taking input from the user as string

String email = sc.nextLine();	.	.


•	created object of class Emails

Emails obj = new Emails();	.

•	calling the class EmailData method that is Boolean return type.
	
if(obj.EmailData(email)==true)


Class

Class Emails

Defined this class to store all the email data at one place.
-	Defined a Boolean type parameterized method “EmailData” taking string as a parameter from main function.
public boolean EmailData(String str)                                                                                                  .  

-	Defined ArrayList to store all the email – id’s
ArrayList<String> EmailId=new ArrayList<String>();                                                                            .

-	Returned Boolean value to the main function used contain to check if string present in the database or not
boolean ans = EmailId.contains(str); return ans;                                                                                    .

 

