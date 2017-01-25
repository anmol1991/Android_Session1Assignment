/*
* Write a program that swaps the values of two variables without * using third variable
*/
class Session1Assignment3
{
	public static void main(String s[])
	{
		int a = 20;
		int b = 10;
		System.out.println("Before Swapping a = " + a + " and b = "+ b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping a = " + a + " and b = "+ b); 	
	}
}