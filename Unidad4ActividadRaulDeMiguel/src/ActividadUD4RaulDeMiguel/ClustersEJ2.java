/*En este ejercicio de arrays bidimensionales, se nos pide que imprimamos 
 * un array de números aleatorios y, en el caso de que se repitan números 
 * consecutivos, se contabilice como un cluster. Posteriormente, debemos 
 * intercambiar todos los números que no son un cluster de números repetidos 
 * por el símbolo "-".

Para ello, he creado dos métodos diferentes. El primero de ellos se llama 
"MakeCluster," que, como su nombre indica, crea el cluster utilizando el método 
"Math.random." Básicamente, inicializo un array bidimensional de 10x10, tal 
como se nos pide en el ejercicio. Después, con un bucle for anidado, recorro 
el array con dos iteradores y utilizo el método Math.random para introducir 
valores numéricos aleatorios en cada una de las posiciones del array.

El segundo método, llamado "EncontrarClusterH," se encarga de encontrar esa 
sucesión de números repetidos en función del primer array dado y, seguidamente, 
intercambiar el resto de números por el símbolo "-". Para ello, declaro una 
nueva variable llamada ClusterH con las dimensiones y valores del array original. 
Básicamente, lo lleno de "-" mediante un bucle for anidado y, a continuación, 
con otro bucle for anidado, recorro el array original. Si se repite un número, 
convierto el valor del array a char para que se pueda igualar a ClusterH, 
que es un array de caracteres. Luego, esos valores numéricos repetidos 
encontrados los paso a valor absoluto con '0' para que se puedan introducir en 
el array llamado ClusterH. Después, con un bucle while, verifico si la sucesión 
de números repetidos continúa para que se puedan introducir más de dos números 
repetidos en el array, y que además la variable llamada contador, que es la que 
se incrementa cuando encuentra un cluster, no incremente de más.

Por último, en el método main, llamo al método que crea el array de números 
y lo muestro por pantalla. Después, llamo al método que encuentra los clusters 
y también lo muestro por pantalla.*/

package ActividadUD4RaulDeMiguel;

public class ClustersEJ2 
{
	public static char[][] EncontrarClusterH(int Cluster[][])
	{
		char ClusterH[][] = new char [Cluster.length][Cluster[0].length];
		int contador = 0;
		
		for (int i = 0; i < ClusterH.length; i++)
			for (int j = 0; j < ClusterH[i].length; j++)
				ClusterH[i][j] = '-';
		
		for (int i = 0; i < Cluster.length; i++)
		{
			for (int j = 0; j < Cluster[i].length - 1; j++)
			{
				if (Cluster[i][j] == Cluster[i][j + 1])
				{
					contador++;
					ClusterH[i][j] = (char)(Cluster[i][j] + '0');
					ClusterH[i][j + 1] = (char) (Cluster[i][j] + '0');
				}
				while (j < Cluster[i].length - 1 && Cluster[i][j] == Cluster[i][j + 1])
				{
					ClusterH[i][j + 1] = (char) (Cluster[i][j] + '0');
					j++;
					
				}
			}
			
		}
		System.out.println("En el tablero hay " + contador + " clustersH");
		System.out.println();
		return ClusterH;
	}
	public static int[][] MakeCluster()
	{
		int Cluster[][] = new int [10][10];
		for (int i = 0; i < Cluster.length; i++)
		{
			for (int j = 0; j < Cluster[i].length; j++)
				Cluster[i][j] = (int)(Math.random()*10);
		}
		return Cluster;
	}
	public static void main(String[] args) 
	{
		int cluster[][] = MakeCluster();
		
		for (int i = 0; i < cluster.length; i++)
		{
			for (int j = 0; j < cluster[i].length; j++)
				System.out.print(cluster[i][j]);
			System.out.println();
		}
		System.out.println();
		char Cluster [][] = EncontrarClusterH(cluster);
		for (int i = 0; i < Cluster.length; i++)
		{
			for (int j = 0; j < Cluster[i].length; j++)
				System.out.print(Cluster[i][j]);
			System.out.println();
		}
	}
}
