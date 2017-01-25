/*
* Write a program to print the result of the following * expressions provided the integer variable a is 20 and b is 10.
* int b= a-- - --a;
* int c=a--;
* int d=a>>2;
* int e=a&b;
*/
class Session1Assignment2
{
	public static void main(String s[])
	{
		int a = 20;
		int b = 10;
		int c,d,e;
		b = a-- - --a;
		System.out.println("b=a-- - --a = " + b);
		c = a--;
		System.out.println("c=a-- = " + c);
		d = a >> 2;
		System.out.println("d=a>>2 = " + d);
		e = a & b;
		System.out.println("e=a&b = " + e); 	
	}
}