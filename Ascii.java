import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any character");
		char a =sc.next().charAt(0);
		int ascii = a;
		System.out.println(ascii);
	}
}