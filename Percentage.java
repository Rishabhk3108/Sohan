import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Percentage :");
	int per = sc.nextInt();
	if(per<0)
	{
	System.out.print("Invalid Percentage ");
	}
	else
	{
		if(per>100)
		{
		System.out.print("Invalid Percentage ");
		}
		else
		{
			if(per>=60)
			{
			System.out.print("Passed in first Divison");
			}
			else
			{
				if(per>=45)
				{
				System.out.print("Passed in second Divison");
				}
				else
				{
					if(per>=33)
					{
					System.out.print("Passed in third Divison");
					}
					else
					{
					System.out.print("Failed");
					}
				}
			}
		}
	}
	}
}