import java.io.*;
class methodoverload
{
	void area(int l)
	{
	int area=l*l;
	System.out.println("area of a square is: " +area);
	}
	void area(int l,int b)
	{
	int area=l*b;
	System.out.println("area of a rectangle is: " +area);
	}
}
class method
{
	public static void main(String args[]) throws IOException
	{
	int l,b;
	InputStreamReader read=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(read);
     System.out.println("enter the length and breadth");
     l=Integer.parseInt(br.readLine());
    b=Integer.parseInt(br.readLine());
    methodoverload ob=new methodoverload();
    ob.area(l);
    ob.area(l,b);
	}
}
