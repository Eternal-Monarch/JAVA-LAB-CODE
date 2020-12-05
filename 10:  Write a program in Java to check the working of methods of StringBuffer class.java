class Main
{
	public static void main(String args[])
	{
		StringBuffer str=new StringBuffer("Hello World");
		System.out.println(str);
		System.out.println(str.length());		
		System.out.println(str.append(" JAVA"));
		System.out.println(str.insert(5," CSE	"));
		System.out.println(str.reverse());
		str.setLength(5);
		System.out.println(str);
	}
}
