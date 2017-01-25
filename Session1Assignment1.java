class Session1Assignment1
{
	public static void main(String s[])
	{
		int a = 10,b = 20,sum = 0,carry = 0;
		while (b != 0)
    		{
        
        		carry = a & b;  
 			a = a ^ b; 
 
        
        		b = carry << 1;
    		}
		
		System.out.println("sum = "+a);
			
	}
}