import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any character");
		char a = sc.next().charAt(0);
		if(a>=65 && a<=90)
		{
			System.out.println("The Character is upper case character");
			int ascii = a;
			ascii =ascii+32;
			char b= (char)(ascii);
			System.out.println(b);
		}else
		{
			System.out.println("The Character is lower case character");
			int ascii = a;
			ascii =ascii-32;
			char b= (char)(ascii);
			System.out.println(b);
		}
	}	
}