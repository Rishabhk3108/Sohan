import java.util.Scanner;
class Test
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any five digit number");
int a =sc.nextInt();
int fd = a/10000;
int sd = (a/1000)%10;
System.out.println("First digit is " +fd);
System.out.println("First digit is " +sd);
if(fd%sd==0 || sd%fd ==0)
{
System.out.println("First digit is divisible by second digit of the given number");
}
else
{
System.out.println("First digit is not divisible by second digit of the given number");
}
}
}

