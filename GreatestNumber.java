import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number");
		int a =sc.nextInt();
		System.out.println("Enter second number");
		int b =sc.nextInt();
		System.out.println("Enter third Number");
		int c =sc.nextInt();
		System.out.println("Enter fourth number");
		int d =sc.nextInt();
		System.out.println("Enter Fifth number");
		int e =sc.nextInt();
		if(a>b &&a>c && a>d && a>e)
		{
			System.out.println("First number is greatest");
		}
		else if(b>a && b>c && b>d && b>e)
		{
			System.out.println("Second number is greatest");
		}
		else if(c>a && c>b && c>d && c>e)
		{
			System.out.println("Third number is greatest");
		}
		else if(d>a && d>b&& d>c &&d>e)
		{
			System.out.println("Fourth number is greatest");
		}
		else
		{
			System.out.println("Fifth number is greatest");
		}
	}
}