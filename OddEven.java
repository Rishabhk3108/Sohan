import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter any number");
	int a =sc.nextInt();
	if(a%2==0)
		{
		System.out.println("The number is even");
		}
		if(a%2!=0)
		{
		System.out.println("The number is odd");
		}
	}
}
