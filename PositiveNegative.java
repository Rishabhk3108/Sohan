import java.util.Scanner;
class PositiveNegative
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter any number :");
	int a = sc.nextInt();
	if(a<0)
	{
	System.out.println("The number is negative");
	}
	else
	{
		if(a==0)
		{
		System.out.println("The number is neutral");
		}else
		{
		System.out.println("The number is positive");
		}
	}
}
}
