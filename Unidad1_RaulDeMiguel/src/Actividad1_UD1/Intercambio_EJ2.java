/* En este caso nos piden en el ejercicio que imprimamos el valor de dos números enteros y
 * que, acto seguido, se impriman los valores de los mismos dos números enteros pero de manera inversa.
 * 
 * Para ello, en la primera declaración utilizamos println para que se impriman los valores de num1 y num2 
 * seguidos de un salto de línea, y en la segunda declaración volvemos a utilizar println, 
 * pero esta vez intercambiamos los valores de num1 y num2.*/
package Actividad1_UD1;

public class Intercambio_EJ2 
{
	public static void main(String[] args) 
	{
		int num1 = 5;
		int num2 = 8;
		
		System.out.println("num1=" + num1 + " y " + "num2=" + num2);
		System.out.println("num1=" + num2 + " y " + "num2="+ num1);

	}
}
