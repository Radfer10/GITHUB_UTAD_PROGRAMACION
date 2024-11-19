package EjercicioArraysAnidados;

public class JuegoRana 
{

	public static void main(String[] args) 
	{
		int NumJugadores = 3;
		int NumLanzamientos = 5;
		
		int lanzamientos[][] = new int[NumJugadores][7];
		int puntos[] = new int[NumLanzamientos];
		
		for (int jugador = 0; jugador < NumJugadores; jugador++)
		{
			for (int i = 0; i <NumLanzamientos; i++)
			{
				double valor = Math.random();
				
				if (valor < 0.4)
					lanzamientos[jugador][0]++;
				else if (valor < 0.5)
				{
					lanzamientos[jugador][1]++;
					puntos[jugador] += 1;
				}
				else if (valor < 0.6)
				{
					lanzamientos[jugador][2]++;
					puntos[jugador] += 2;
				}
				else if (valor < 0.7)
				{
					lanzamientos[jugador][3]++;
					puntos[jugador] += 3;
				}
				else if (valor < 0.8)
				{
					lanzamientos[jugador][4]++;
					puntos[jugador] += 4;
				}
				else if (valor < 0.9)
				{
					lanzamientos[jugador][5]++;
					puntos[jugador] += 5;
				}
				else
					lanzamientos[jugador][6]++;
				puntos[jugador] += 6;
			}
			
			
		}
		for (int jugador = 0; jugador < NumJugadores; jugador++)
		{
			System.out.print("Jugador" + (jugador + 1) + ":");
			for (int j = 0; j < 7; j++)
			{
				System.out.print(lanzamientos[jugador][j]);
				if (j < 6)
					System.out.print("-");
			}
			System.out.println();
			
		}

	}

}
