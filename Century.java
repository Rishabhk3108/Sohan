import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any year :");
		int year=sc.nextInt();
		if(year%100==0)
		{
			System.out.println("This year is century");
		}else
		{
			System.out.println("This year is not a century");
		}
	}
}