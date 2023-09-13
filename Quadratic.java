import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Coeffecient of the quadratic equaation : a,b,c.");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double dis = b*b -4*a*c;
		
		if(dis<0)
		{
			System.out.println("The quadratic equation has no real roots");
		}
		else if(dis==0)
		{
			double root = -b /2*a;
			System.out.println("The two equal roots of the quadratic equation are "+ root);
		}else{
			double root1 = (-b - Math.sqrt(dis))/2*a;
			double root2 = (-b + Math.sqrt(dis))/2*a;
			System.out.println("The two roots of the quadratic equations are root 1"+root1+ "and root2 "+root2);
		}
	}
}