import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter physics marks");
		int a =sc.nextInt();
		if (a<0 || a>100)
		{
			System.out.println("Invalid marks");
		}
		else if(a>=85)
		{
			System.out.println("A grade");
		}else if(a>=70){
			System.out.println("B Grade");
		}else if(a>=50)
		{
			System.out.println("C Grade");
		}
		else if(a>35)
		{
			System.out.println("D Grade");
		}else
		{
			System.out.println("Failed");
		}
		
	}
}