package RaulDeMiguelUnidad2;
import java.util.Scanner;

public class Switch_Ej1 {

	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Por favor, introduzca un número del 1 al 7: ");
		int numero = sc.nextInt();
		String texto = "";
		
		switch (numero)
		{
		case 1:
			texto = "Lunes";
			break;
		case 2:
			texto = "Martes";
			break;
		case 3:
			texto = "Miercoles";
			break;
		case 4:
			texto = "Jueves";
		case 5:
			texto = "Viernes";
		case 6:
			texto = "Sabado";
		case 7:
			texto = "Domingo";
			break;
		default:
			texto = "Error, fuera de rango";
		}
		System.out.println(texto);
		sc.close();

	}

}
