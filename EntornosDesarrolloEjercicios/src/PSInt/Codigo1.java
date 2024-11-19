package PSInt;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Codigo1 
{
	public int contador (int x, int y)
	{
		Scanner entrada = new Scanner (System.in);
		int num;
		int c = 0;
		if (x > 0 && y > 0)
		{
			System.out.print("Escribe un número: ");
			num = entrada.nextInt();
			if (num >= x && num <= y)
			{
				System.out.print("\tNúmero en el rango");
				c++;
			}
			else
				System.out.println("\tNúmero fuera de rango");
		}
		else
			c = -1;
		entrada.close();
		return c;
	}
	public static void main(String[] args) {
        Codigo1 codigo = new Codigo1();
        
        // Camino 1: x <= 0 o y <= 0 (espera -1)
        System.out.println("Camino 1: " + ejecutarCamino(codigo, 0, 5, 3)); // Debería imprimir -1
        
        // Camino 2: x > 0, y > 0, número fuera de rango (espera 0)
        System.out.println("Camino 2: " + ejecutarCamino(codigo, 1, 5, 10)); // Debería imprimir 0
        
        // Camino 3: x > 0, y > 0, número dentro del rango (espera 1)
        System.out.println("Camino 3: " + ejecutarCamino(codigo, 1, 5, 3)); // Debería imprimir 1
        
        // Camino 4: x > 0, y > 0, número fuera de rango (espera 0)
        System.out.println("Camino 4: " + ejecutarCamino(codigo, 1, 5, 6)); // Debería imprimir 0
    }

    
    public static int ejecutarCamino(Codigo1 codigo, int x, int y, int simulatedNum) 
    {
       
        String simulatedInput = String.valueOf(simulatedNum);
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

       
        return codigo.contador(x,y);
    }
}
