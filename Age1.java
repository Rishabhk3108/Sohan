import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the age :");
	int age = sc.nextInt();
	if(age<=0)
	{
	System.out.println("Enter valid age");
	}
	else
	{
		if(age<=12)
		{
		System.out.println("You are a child");
		}
		else
		{
			if(age<=19)
			{
			System.out.println("You are teen");
			}
			else
			{
				if(age<=59)
				{
				System.out.println("You are young");
				}
				else
				{
					if(age<=100)
					{
					System.out.println("You are Old");
					}
					
				}
			}
		}
	}
	}

}
