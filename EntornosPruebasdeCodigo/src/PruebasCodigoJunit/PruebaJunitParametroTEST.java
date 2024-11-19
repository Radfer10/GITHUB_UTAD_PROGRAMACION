package PruebasCodigoJunit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class PruebaJunitParametroTEST 
{
	/*Metodo que crea un ArrayList que contendrá todos las posibles pruebas y casos
	 * que se pueden dar en el código facotrial ejecutandose de manera Parametrizada
	 * segun los parametros del constructor definido mas abajo*/
	@Parameters
	public static Iterable<Object[]> getData()
	{
		return Arrays.asList(new Object[][] {
			{5, 120}, {1, 1}, {0, 1}, {32, -1}, {-5, -1}
		});
	}

	private int a, exp;
	/*Es el constructor que define los parámetros de entrada para comparar el valor de entrada
	 * con su salida y poder comparar cada prueba de manera efectiva*/
	public PruebaJunitParametroTEST (int a, int exp)
	{
		this.a = a;
		this.exp = exp;
	}
	/*Este metodo llama al código a probar siendo el metodo factorial y
	 * se utiliza assertEquals para comparar las salidas de ambos parámetros
	 * definidos anteriormente*/
	@Test
	public void testFactorial()
	{
		PruebasJunit Prueba = new PruebasJunit();
		int resultado = Prueba.factorial(a);
		assertEquals(exp, resultado);
	}
}

/*Los casos probados son si el parametro dado es un número dentro del rango 
 * designado para calcular su factorial, tambien se prueba si es 1 que tiene que devolver 
 * un 1 y si es 0 que tambien devuelve 1, tambien se comprueba el caso si el numero
 * pasado como parametro esta fuera del rango en tal caso tiene que devolver un -1
 * y también hacemos la prueba de un numero negativo que en tal caso el resultado tambien
 * tiene que devolver -1*/
