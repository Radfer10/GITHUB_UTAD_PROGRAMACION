/*En este ejercicio se nos pide que, en base a un array bidimensional, consigamos imprimir un cuadro con las indicaciones que se nos plantean en el ejercicio.

Para ello, se nos pide que dibujemos un marco con los símbolos "+", "-" y "|", y que dentro de dicho marco podamos dibujar una línea vertical central con el símbolo "*", otra línea horizontal central con el símbolo "o", y una línea diagonal que recorra todo el cuadro formada por el símbolo "%".

He implementado todo mediante métodos para cada acción diferente. Primero, 
en el main, declaro un array bidimensional con las dimensiones de 19x19, 
según se nos pide en el enunciado.

Después, llamo a cada método que he creado para ir pintando el array.

El primer método, llamado "marco," es el que se encarga de dibujar el marco. 
Básicamente, según las posiciones iniciales de cada esquina del array, las 
igualo al símbolo "+" para que cada esquina del marco esté dibujada con un "+". 
Después, mediante dos bucles, asigno los diferentes componentes del marco para 
la posición de arriba y abajo del array. Recorro las filas con la variable j 
para que se rellenen con los símbolos "-" y "|" formando un marco. 
Posteriormente, retorno el array original para llamarlo en el main.

El segundo método, llamado "rojo," se encargará de dibujar la línea central 
vertical. Para ello, mediante un bucle, me sitúo en la parte central del 
segundo valor de filas del array y posteriormente recorro i para rellenar esa 
columna en la posición central del array con el símbolo "*".

El tercer método, llamado "verde," se encarga de dibujar la línea horizontal 
central del cuadro. Para ello, creo otro bucle para situarme dentro del array 
en la posición del valor 9 de i (filas) y, desde esa posición, j irá 
incrementando para rellenar esa columna del array con el símbolo "o".

El método "azul" se encargará, mediante tres bucles distintos, de pintar una 
línea diagonal con el símbolo "%". En el primer bucle, nos posicionaremos en 
el centro del array para dibujar un "%". Después, con el segundo bucle, nos 
posicionaremos en la esquina superior izquierda para rellenar esa parte 
principal de la diagonal con "%". Por último, el tercer bucle hará lo mismo 
que el segundo bucle, pero de manera inversa, para formar esa diagonal en la 
zona inferior derecha del array.

Por último, el método llamado "blanco" hará el lienzo en blanco, de modo que 
todo el array esté rellenado, en un principio, por espacios en blanco y que, a 
partir de ahí, se vayan sobrescribiendo esos espacios en blanco con el resto de métodos que irán dibujando el cuadro que se nos pide al principio.

Como mencioné al principio de la explicación, en el método main se irán 
llamando, de uno en uno, cada método y después se imprimirá el array con el 
cuadro ya dibujado.

*/

package ActividadUD4RaulDeMiguel;

public class Cuadro 
{
	public static String[][] rojo (String Cuadro[][])
	{
		for (int i = 1; i < 18; i++)
			 Cuadro[i][9] = "*";
		return Cuadro;
	}
	public static String[][] verde (String Cuadro[][])
	{
		for (int j = 1; j < 18; j++)
			Cuadro[9][j] = "o";
		return Cuadro;
	}
	public static String[][] azul (String Cuadro[][])
	{
		for (int i = 9; i == 9; i++)
			Cuadro[i][9] = "%";
		for (int i = 1; i < 9; i++)
		{
			for (int j = 1; j < 9; j++)
				Cuadro[i++][j] = "%";
		}
		for (int i = 10; i < 18; i++)
		{
			for (int j = 10; j < 18; j++)
				Cuadro[i++][j] = "%";
		}
		return (Cuadro);
	}
	public static String[][] blanco (String Cuadro[][])
	{
		for (int i = 0; i < Cuadro.length; i++)
			for (int j = 0; j < Cuadro[i].length; j++)
			{
				Cuadro[i][j] = " ";
			}
			return Cuadro;
		
	}
	public static String[][] marco (String Cuadro[][])
	{
		Cuadro[0][0] = "+";
		Cuadro[0][18] = "+";
		Cuadro[18][0] = "+";
		Cuadro[18][18] = "+";
		
		for (int j = 1; j < 18; j++)
		{
			Cuadro[0][j] = "-";
			Cuadro[18][j] = "-";
		}
		
		for (int i = 1; i < 18; i++)
		{
			Cuadro[i][0] = "|";
			Cuadro[i][18] = "|";
		}
		return Cuadro;
	}
	public static void main(String[] args) 
	{
		String Cuadro [][] = new String[19][19];
		
		blanco (Cuadro);
		marco (Cuadro);
		verde(Cuadro);
		rojo(Cuadro);
		azul(Cuadro);
		
		for (int i = 0; i < 19; i++)
		{
			for (int j = 0; j < 19; j++)
			{
				System.out.print(Cuadro[i][j]);
			}
			System.out.println();
		}
	}
}
