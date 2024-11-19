package FASE1;
import java.util.Scanner;

public class CyberCafeFASE1 
{
	String Reservas[];
	String Clientes[];
	
	

	public void Menu () 
	{
		Scanner sc = new Scanner (System.in);
		int select = 0;
		
		while (select != 6)
		{
			System.out.println("===== Menú CyberCafe =====");
			System.out.println("1. Crear Reserva");
			System.out.println("2. Mostrar Reservas");
			System.out.println("3. Eliminar una Reserva");
			System.out.println("4. Gestionar Clientes");
			System.out.println("5. Modificar y Configurar Arrays");
			System.out.println("6. Salir");
			
			select = sc.nextInt();
			
			
		}
		

	}

}
