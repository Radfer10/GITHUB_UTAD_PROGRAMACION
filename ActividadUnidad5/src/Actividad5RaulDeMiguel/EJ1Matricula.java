/*En este primer ejercicio, tenemos que conseguir que el usuario introduzca una matrícula válida 
 * y que el programa le devuelva la siguiente matrícula a la introducida.

Para ello, primero me he encargado de realizar el proceso de validación de matrícula. 
En el ejercicio se nos pide que verifiquemos si la matrícula contiene 4 números, un espacio 
y 3 letras. Para ello, he creado un método de tipo booleano que verifica si se cumplen todas 
las condiciones, devolviendo false si alguna condición no se cumple, y true si todas las comprobaciones 
son correctas. Este método, llamado MatriculaValida, recibe un String llamado matricula. 
Lo primero que verifica es que la longitud del String sea de 8 caracteres; en caso contrario, 
devuelve false. Después, recorre el String para comprobar que tiene 4 números, que hay un espacio 
después de los 4 números, y que en el caso de las letras no se introduzcan vocales ni la letra ñ, 
además de verificar que sean exactamente 3 letras. Si todas las condiciones se cumplen, devuelve true, 
lo que significa que la validación ha sido correcta, tal y como se pide en el ejercicio.

Una vez realizado el proceso de validación de la matrícula, creo un método que servirá para 
generar la siguiente matrícula en la secuencia; este método se llama nextMatricula. 
Para incrementar el número, creo una variable de tipo int que recorre una subcadena de los 
primeros 4 caracteres y, si el número introducido es 9999, se reinicia a 0. Si no, el 
número se incrementa en uno. Para gestionar el incremento de las letras, he creado un 
método separado llamado siguienteLetra, en el cual creo una variable llamada next que 
almacena el siguiente carácter en la secuencia. Este bucle verifica que si next es una 
vocal o excede Z (ya que las vocales no se tienen en cuenta para el incremento de letras), 
se iguala a B. Si no, next se incrementa al siguiente carácter. Luego, este método se llama 
en nextMatricula donde, una vez incrementado el número, se incrementa cada letra, empezando 
por la última letra de la matrícula. Si esa letra resulta ser 'B', se incrementa la siguiente 
letra hacia la izquierda, y si también es 'B', se incrementa la letra más a la izquierda.

Por último, creo una variable de tipo String llamada newMatricula, que devolverá la nueva 
matrícula en función del String original incrementado con el siguiente número y letra. 
Luego, este String se retorna, y en el método main, tras validar la matrícula, se muestra 
por pantalla el resultado con nextMatricula, que contiene la siguiente matrícula a la 
introducida por el usuario.*/
package Actividad5RaulDeMiguel;
import java.util.Scanner;

public class EJ1Matricula 
{
	public static boolean MatriculaValida (String Matricula)
	{
		if (Matricula.length() != 8)
			return false;
		for (int i = 0; i < 4; i++)
		{
			if (!Character.isDigit(Matricula.charAt(i)))
				return false;
		}
		if (!Character.isSpaceChar(Matricula.charAt(4)))
			return false;
				
		for (int i = 5; i < 8; i++)
		{
			if (!Character.isLetter(Matricula.charAt(i)))
				return false;
			else if (!Character.isUpperCase(Matricula.charAt(i)))
				return false;
			else if (Matricula.charAt(i) == 'A' || Matricula.charAt(i) == 'E' ||
			Matricula.charAt(i) == 'I' || Matricula.charAt(i) == 'O' || Matricula.charAt(i) == 'U' ||
			Matricula.charAt(i) == 'Ñ')
				return false;
			
		}
		return true;
	}
	public static char siguienteLetra(char letra)
	{
		char next = (char) (letra + 1);
		while (next == 'A' || next == 'E' || next == 'I' || next == 'O' ||
				next == 'U' || next > 'Z')
		{
			if (next > 'Z')
				next = 'B';
			else
				next++;
		}
		return next;
	}
	public static String nextMatricula (String matricula)
	{
		int numero = Integer.parseInt(matricula.substring(0, 4));
		char letra1 = matricula.charAt(5);
		char letra2 = matricula.charAt(6);
		char letra3 = matricula.charAt(7);
		numero++;
		if (numero > 9999)
		{
			numero = 0;
			letra3 = siguienteLetra(letra3);
			if (letra3 == 'B')
			{
				letra2 = siguienteLetra(letra2);
				if (letra2 == 'B')
					letra1 = siguienteLetra(letra1);
			}
		}
		String newMatricula = String.format("%04d %c%c%c", numero, letra1, letra2, letra3 );
		return newMatricula;
	}
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		while (true)
		{
			System.out.println("Introducca una matricula: ");
			String matricula = sc.nextLine();
			if (!MatriculaValida(matricula))
				System.out.println("La matricula es invalida");
			else
			{
				System.out.println(nextMatricula(matricula));
				break;
			}
			sc.close();
		}
	}
}
