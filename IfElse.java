import java.util.Scanner;
class number
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number :");
	int a = sc.nextInt();
	System.out.println("Enter first number :");
	int b = sc.nextInt();
	if(a==b)
	    {
		System.out.println("Both the numbers are equal");
	    }
	else
	    {
	    	if(a>b)
	    	{
	    	System.out.println("A is greater then B");
	    	}
	    	else
	    	{
	    	System.out.println("B is greater then A");
	    	}
	    
	    }
	}
}
