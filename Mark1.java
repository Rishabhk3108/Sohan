import java.util.Scanner;
class Marks
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter p marks");
		int p =sc.nextInt();
		System.out.println("Enter c marks");
		int c =sc.nextInt();
		System.out.println("Enter mdgh marks");
		int m =sc.nextInt();
		int per =((p+c+m)/300)*100;
		
	if(p<33)
	{
		if(c<33)
		{
			if(m<33)
			{
			System.out.println("Fail in all subject");
			}
			else
			{
			System.out.println("Fail in chemistry and physics");
			}
		}
		else
		{
		    if(m<33)
		    {
		    System.out.println("Fail in maths and Physics");
		    }
		    else
		    {
		    System.out.println("Failed in Physics");
		    }
		}    
	}
	else{
	    	if(m<33)
	    	{
	    		if(c<33)
	    		{
	    		System.out.println("Failed in Chemistry and maths");
	    		}
	    		else
	    		{
	    		System.out.println("Failed in Maths");
	    		}
	    	}
	    	else
	    	{
	   		 if(c<33)
	   		 {
	    		System.out.println("Failed in chemistry");
	    		}
	    		else
	    		{
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
	    }	        
	        	
	}
}
