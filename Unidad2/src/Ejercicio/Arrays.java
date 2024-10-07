package Ejercicio;

public class Arrays 
{
	public static void main (String[] args)
	{
		String[] laborables = {"lunes", "martes", "miércoles", "jueves", "viernes"};
		
		int actual = 3;
		int vacaciones = 22;
		int finalVacaciones = (actual + vacaciones) % 5;
		System.out.println(laborables[finalVacaciones]);
	}

}
