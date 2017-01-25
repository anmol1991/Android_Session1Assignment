/*
*Write a program to print the 
*characters corresponding to ASCII codes from 65 to 90.
*/
class Session1Assignment4
{
	public static void main(String s[])
	{
		int i= 0;
		char a;
		for(i = 60; i <= 90; i++)
		{
			a = (char)i;
			System.out.println(i+"-"+a);
		}	
	}
}