import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculadoraTest4 
{
	 int nume1;
	 int nume2;
	 int resul;
	public CalculadoraTest4(int numel, int nume2, int resul) 
	{
		this.nume1 = numel;
		this.nume2 = nume2;
		this.resul = resul;
	}
	@Test
	public void testDivide () 
	{
		Calculadora calcu = new Calculadora(20, 10);
		int resultado = calcu.divide();
		assertEquals (2, resultado);
	}
	
	@Parameters
	public static Collection<Object[]> numeros() 
	{
		return Arrays.asList(new Object[][] { 	{ 20, 10, 2 }, 
											{ 30, -2, -15 },
											{ 5, 2, 3 } });
	}

}
