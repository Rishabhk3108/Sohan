import java.util.Scanner;
class MarkFive
	{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the marks of Physics :");
		int p = sc.nextInt();
		System.out.print("Enter the marks of Chemistry :");
		int c = sc.nextInt();
		System.out.print("Enter the marks of maths:");
		int m = sc.nextInt();
		System.out.print("Enter the marks of hindi :");
		int h = sc.nextInt();
		System.out.print("Enter the marks of english :");
		int e = sc.nextInt();
		if(p<33)
		{
			if(c<33)
			{
				if(m<33)
				{
					if(h<33)
					{
						if(e<33)
						{
						System.out.println("Failed in all Subjects");
						}
						else
						{
						System.out.println("Failed in four Subjects i.e., Physics , chemistry, maths and hindi");
						}
					}
					else
					{
						if(e<33)
						{
						System.out.println("Failed in four Subjects i.e., Physics, chemistry, maths and english");
						}
						else
						{
						System.out.println("Failed in three subject i.e., PCM");
						}
					
					}
				}
				else
				{
					if(h<33)
					{
						if(e<33)
						{
						System.out.println("Failed in four subjects i.e., P C Hindi and English");
						}
						else
						{
						System.out.println("Failed in three Subject PCH");
						}
					}
					else
					{
					 	if(e<33)
					 	{
					 	System.out.println("Failed in PCE");
					 	}
					 	else
					 	{
					 	System.out.println("Fail in PC");
					 	}
					}
				}
				}
			else
			{
				if(m<33)
				{
					if(h<33)
					{
						if(e<33)
						{
						System.out.println("Fail in P M H E");
						}
						else
						{
						System.out.println("Fail in P M H");
						}
					}
					else
					{
						if(e<33)
						{
						System.out.println("Fail in P M E");
						}
						else
						{
						System.out.println("Fail in PM");
						}
					}
				}
				else
				{
					if(h<33)
					{
						if(e<33)
						{
						System.out.println("Fail P H E");
						}
						else
						{
						System.out.println("Fail in PH");
						}
					}else
					{
						if(e<33)
						{
						System.out.println("Fail in P E");
						}
						else
						{
						System.out.println("fail in P");
						}
					}
				}
			}
				
			}
			else
			{
				if(c<33)
				{
					if(m<33)
					{
						if(h<33)
						{
							if(e<33)
							{
							System.out.println("Fail in C M H E");
							}
							else
							{
							System.out.println("Fail in CMH");
							}
						}
						else
						{
							if(e<33)
							{
							System.out.println("Fail in CME");
							}
							else
							{
							System.out.println("Fail in CM");
							}
						}
					}
					else
					{
						if(h<33)
						{
							if(e<33)
							{
							System.out.println("Fail in C E H");
							}
							else
							{
							System.out.println("Fail in  C H");
							}
						}else
						{
							if(e<33)
							{
								System.out.println("Fail in C E");
							}
							else
							{
							System.out.println("Fail in C");
							}
						}
					}
				}
				else
				{
					if(m<33)
					{
						if(h<33)
						{
							if(e<33)
							{
							System.out.println("Fail in MHE");
							}
							else
							{
							System.out.println("Fail in MH");
							}
						}
						else
						{
							if(e<33)
							{
							System.out.println("Fail in M E");
							}
							else
							{
							System.out.println("Fail in M");
							}
						}
					}
					else
					{
						if(h<33)
						{
							if(e<33)
							{
							System.out.println("Fail in H E");
							}
							else
							{
							System.out.println("Fail in H");
							}
						}
						else
						{
							if(e<33)
							{
							System.out.println("Fail in E");
							}
							else
							{
							System.out.println("You are passed");
							}
						}
					}
				}
			}
		}
	}

		
		
		
	
	
