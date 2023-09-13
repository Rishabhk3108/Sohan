import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Physics marks :");
	int p = sc.nextInt();
		System.out.print("Enter Chemistry marks :");
	int c = sc.nextInt();
		System.out.print("Enter Maths marks :");
	int m = sc.nextInt();
	if(p<33)
	if(c<33)
	if(m<33)
	{
		System.out.print("fail in all");
	}else{
		if(p<33)
		if(c<33)
		if(m>33)
		{
		System.out.print("Failed in Physics and Chemistry");
		}else
		{
		if(p<33)
		if(c>33)
		if(m<33)
		{
		System.out.print("Failed in Physics and maths");
		}
		else
		{
			if(p>33)
			if(c<33)
			if(m<33)
			{
			System.out.print("Failed in Chemistry and maths");
			}
			else
			{
			if(p<33)
			if(c>33)
			if(m>33)
			{
			System.out.print("Failed in Physics");
			}
			else
			{
				if(p>33)
				if(c<33)
				if(m>33)
				{
				System.out.print("Failed in Chemistry");
				}
				else{
					if(p>33)
					if(c>33)
					if(m<33)
					{
					System.out.print("Failed in maths");
					}
				    }
				    else
				    {
				    	if(p>=45)
					if(c>=45)
					if(m>=45)
					{
					System.out.print("passed in third Divison");
					}else
					{
						if(p>=59)
						if(c>=59)
						if(m>=59)
						{
						System.out.print("Passed in Second Divison");
						}else
						{
							System.out.print("Passed in First Divison");
						}
					}
				    }
			}	
			}
	}
	}
	}
	}
}
