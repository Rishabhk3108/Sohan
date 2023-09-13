import java.util.Scanner;
class FiveDigit
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any five digit number ");
	int a =sc.nextInt();
	if(a>=10000 && a<=99999)
		{
		System.out.println("This is a five digit number ");
		int lastdigit =a%10;
		int firstdigit =a/10000;
		int sum = firstdigit+lastdigit;
		System.out.println("\n ");
		System.out.println("This is the sum of first and last digit of given number "+sum);
		System.out.println("\n");
		sum =sum*sum;
		System.out.println("This is the square of sum of first and last digit of given number"+sum);
		System.out.println("\n ");
		int seconddigit = (a/1000)%10;
		int secondlast = (a/10)%10;
		int sum1 =seconddigit+secondlast;
		System.out.println("This is the sum of second and last second digit of given number"+sum1);
		System.out.println("\n ");
		sum1=sum1*sum1;
		System.out.println("This is the square of sum of second and last second digit of the given number "+sum1);
		System.out.println("\n ");
		int middle = (a/100)%10;
		System.out.println("This is the middle digit of five digit number"+middle);
		System.out.println("\n ");
		middle =middle*middle;
		System.out.println("This is the square of middle digit of given five digit number"+middle);
		}
		else
		{
		System.out.println("This is not a five digit number");
		}
	}
}
