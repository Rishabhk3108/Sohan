import java.util.Scanner;
class Salary

{
	public static void main(String args[])
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Salary");
	float salary = sc.nextFloat();
	float pf = (float)(salary*12)/100;
	System.out.println("PF of the given Salary is:"+pf);
	salary=salary-pf;
	float DA = (float)(salary*7.8)/100;
	System.out.println("DA of the given Salary is:"+DA);
	salary=salary-DA;
	float TA = (float)(salary*3.6)/100;
	System.out.println("TA of the given Salary is:"+TA);
	}
}
