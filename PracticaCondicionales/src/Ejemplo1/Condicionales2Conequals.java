package Ejemplo1;

public class Condicionales2Conequals 
{

	public static void main(String[] args) 
	{
		String first = "Uda";
		String second = "city";
		String firstandSecond = first + second;
		String third = "Udacity";
		
		if (firstandSecond.equals(third))
		{
			System.out.println("They are the same");
		}
		else
		{
			System.out.println("firstAndSecond is " 
					+ firstandSecond);
		}
	}

}

