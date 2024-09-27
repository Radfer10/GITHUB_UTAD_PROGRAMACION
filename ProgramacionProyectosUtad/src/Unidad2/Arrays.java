package Unidad2;

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

/*Lo que hace aqui es crear un array de 5 posiciones con los dias de la semana
y nos marca la posicion actual que es 3 que en este caso seria jueves y las posiciones de vacaciones que tiene desde ese dia
al sumarlo da 25 dias que si sacamos el modulo % entre 5 puedes coger el resto de esa division que en este caso es 0 porque es divisible entre 5
y nos indica que la posicon en la que esta desde la actual mas 22 dias que tiene de vacaciones se encontraria en la posicon 0
que seria lunes, lo que viene a decir que desppues de las vacaciones empezaria a trabajar el lunes.*/