import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter any two number");
	int a =sc.nextInt();
	int b =sc.nextInt();//we can pass input without if block also and it is showing true and false because the return type of this conditions 	//is boolean
	System.out.println("a==b "+(a==b));
	System.out.println("a!=b "+(a!=b));
	System.out.println("a>b "+(a>b));
	System.out.println("a>=b "+(a>=b));
	System.out.println("a<b "+(a<b));
	System.out.println("a<=b "+(a<=b));
	}
}
