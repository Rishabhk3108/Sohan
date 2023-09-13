import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Age");
	int a =sc.nextInt();
	if(a>=0)
	{
	System.out.println("Invalid age");
	}
	else
	{
		if(a>=18)
		{
			System.out.println("you are eligible for voting");
		}
		if(a<18)
		{
			System.out.println("you are not eligible for voting");
		}	
	}
}
