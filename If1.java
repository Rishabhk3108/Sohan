import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter any two number");
	int a =sc.nextInt();
	int b =sc.nextInt();
	if(a==b)
		//if only one statment is their in if statement then it is optinal to put curly brackets{}
		System.out.println("Both the numbers are same");
		
		if(a!=b)
		
		System.out.println("Both the numbers are Different");
		
	}
}
