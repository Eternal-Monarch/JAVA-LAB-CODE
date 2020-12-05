import java.util.Scanner;
class AdditinCal
{
	int res=0;
	AdditinCal(int x,int y)
	{
	 res=x+y;
	}
}
class Add
{
public static void main(String[] arg)
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	a=sc.nextInt();
	System.out.println("Enter second number");
	b=sc.nextInt();
	AdditinCal c=new AdditinCal(a,b);
	System.out.println("Addition of two numbers is : "+c.res);
}
}
