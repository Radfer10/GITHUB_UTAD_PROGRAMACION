package Ejercicio_clase;
import java.util.Scanner;

public class ProgramaProfesor 
{
	public static int suma(int [] a)
	{
		int suma = 0;
		for (int i = 0; i < a.length; i++)
		{
			suma = suma + a[i];
		}
		return suma;
	}
	
	public static int media(int [] a)
	{
		int suma = suma(a);
		int media = suma / a.length;
		return media;
	}

	

	public static void main(String[] args) 
	{
		int Notas[];
		String [] Alumnos;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Introduce el número de examenes: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		Alumnos = new String[num];
		Notas = new int[num];
		System.out.println("Introduce el nombre de los alumnos: ");
		for (int i = 0; i < num; i++)
		{
			Alumnos[i] = sc.nextLine();
		}
		for (int i = 0; i < num; i++) 
		{
            System.out.print("Introduce la nota del alumno " + Alumnos[i] + ": ");
            Notas[i] = sc.nextInt(); 
        }
		System.out.println(suma(Notas));
		System.out.println(media(Notas));
		
		System.out.print("Cual es la nota de: ");
		String nombre = sc.nextLine();
		sc.nextLine();
		boolean flag = false;
		for (int i = 0; i < num; i++)
		{
			if (Alumnos[i].equals(nombre))
			{
				System.out.print("El alumno" + Alumnos[i] + "ha sacado un" + Notas[i]);
				flag = true;
				break;
			}
		}
		if (flag != false)
		{
			System.out.println("No esta ese alumno");
		}
		sc.close();
		
	}

}
