package EjercicioArraysAnidados;

import java.util.Scanner;

public class EjercicioSudoku 
{


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int Sudoku[][] = new int[3][3];
		boolean flag[] = new boolean[9];
		boolean valido = true;
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.print("Introduzca la coordenada " + (i + 1) + "," + (j + 1) + ": ");
				Sudoku[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.print(Sudoku[i][j] + "");
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				int num = Sudoku[i][j];
				if (num >= 1 && num <= 9)
				{
					if (flag[num - 1])
					{
						valido = false;
						break;
					}
					else
						valido = true;
				}
						
			}
				
		}
		if (valido)
			System.out.print("OK");
		else
			System.out.print("KO");
		sc.close();
	}
}


