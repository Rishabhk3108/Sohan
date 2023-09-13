import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any Character");
	char a =sc.next().charAt(0);
	if(a==65 || a==97 || a==69 || a==101 || a==73 || a==105 || a==79 ||a==111 || a==85 || a==117)
	{
	System.out.println("This is an vowel");
	}else
	{
		if(a>65 && a<90 || a>97 && a<122)
		{
		System.out.println("This is a Consonant");
		}
		else
		{
			if(a>48 && a<57)
			{
			System.out.println("This is an integer");
			}
			else
			{
			System.out.println("This is a Special Character");
			}
		}
	}
	
	}
}