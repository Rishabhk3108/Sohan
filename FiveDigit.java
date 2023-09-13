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
	System.out.println("The number is five digit number");
	int lastdigit =a%10;
	int firstdigit =a/10000;
	int sum=lastdigit+firstdigit;
	System.out.println("This is the sum of first and last digit of the number"+sum);
	int seconddigit =(a/1000)%10;
	int secondlastdigit =(a/10)%10;
	int sum1=seconddigit+secondlastdigit;
	System.out.println("This is the sum of second and lastSecond digit of the number"+sum1);
	int middle = (a/100)%10;
	System.out.println("This is the middle digit of number"+middle);
	sum=sum*sum;
	System.out.println("This is the square of sum of first and last digit of the given number "+sum);
	sum1=sum1*sum1;
	System.out.println("This is the square of sum of second and last second digit of the given number "+sum1);
	middle =middle*middle;
	System.out.println("This is the square of middle digit of the given number "+middle);
	}else
	{
	System.out.println("The number is not five digit number");
	}
}
}
