package PruebasCodigoJunit;

public class PruebasJunit 
{
	public int factorial(int n) 
	{
		int fact = 1;
		if (n > 2 && n<32)
			for (int i = 2; i <= n; i++) 
			{
				fact *= i;
			}
		else if (n == 0 || n == 1)
			fact = 1;
		else
			fact = -1;
		return fact;
		}
}

