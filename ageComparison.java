import java.util.Scanner;
class AgeComparison
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Ram's age :");
	int ram =sc.nextInt();
	System.out.print("Enter Mohan's age :");
	int mohan =sc.nextInt();
	System.out.print("Enter Kamal's age :");
	int kamal =sc.nextInt();
	System.out.print("Enter Raj's age :");
	int raj =sc.nextInt();
	if(ram<=0 || mohan<=0 || kamal <=0 || raj<=0)
	{
	System.out.print("Invalid age");
	}
	else 
	{
	if(ram>mohan && ram>kamal && ram >raj)
	{
		System.out.println("Ram's age is highest");
	}
	else
	{
		if(mohan>ram && mohan > kamal && mohan >raj)
		{
		System.out.println("Mohan's age is highest");
		}
		else
		{
			if(kamal> ram && kamal> mohan && kamal > raj)
			{
			System.out.println("Kamal's age is highest");
			}
			else
			{
				if(raj>ram && raj > mohan && raj> kamal)
				{
				System.out.println("Raj's age is highest");
				}
			}
		}
	}
	}
}
}
